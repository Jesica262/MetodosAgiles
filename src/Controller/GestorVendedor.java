package Controller;

import java.util.ArrayList;
import java.util.List;

import Class.DTOVendedor;
import Class.Vendedor;
import Dao.VendedorDao;
import Dao.VendedorDaoImplement;

public class GestorVendedor {
	static private GestorVendedor gestor = new GestorVendedor();
	private VendedorDao vendedorDao;
	 
    private GestorVendedor() { 
    	vendedorDao = new VendedorDaoImplement();
    }

    static public GestorVendedor get() {
        return gestor;
    }

	public List<DTOVendedor> obtenerTodos() {
		List<Vendedor> lista = vendedorDao.buscarTodos();
		ArrayList<DTOVendedor> listaDTO = new ArrayList<DTOVendedor>();

		for(Vendedor v: lista) {
			listaDTO.add(new DTOVendedor(v.getIdVendedor(),v.getNombre(),v.getApellido(),v.getDni(),v.getUsuario(),v.getClave(),v.getEmail(),v.getEliminado()));

		}
		return listaDTO;
	}

}

