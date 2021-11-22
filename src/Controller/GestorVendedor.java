package Controller;

import java.util.ArrayList;
import java.util.List;

import Class.DTOVendedor;
import Class.Vendedor;
import Dao.AdministradorDao;
import Class.Administrador;
import Class.DTOAdministrador;

public class GestorVendedor {
	static private GestorVendedor gestor = new GestorVendedor();
	private AdministradorDao vendedorDao;
	 
    private GestorVendedor() { }

    static public GestorVendedor get() {
        return gestor;
    }

	public List<DTOVendedor> obtenerTodos() {
	//	List<Vendedor> lista = vendedorDao.buscarTodos();
		ArrayList<DTOVendedor> listaDTO = new ArrayList<DTOVendedor>();
	//	for(Vendedor a: lista) {
	//		listaDTO.add(new DTOAdministrador(a.getIdAdministrador(),a.getUsuario(),a.getClave(),a.getEliminado()));
			
	//	}
		return listaDTO;
	}

}
