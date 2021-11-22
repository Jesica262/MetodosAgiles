package Controller;

import java.util.ArrayList;
import java.util.List;

import Class.DTOVendedor;
import Class.Vendedor;
import Dao.AdministradorDao;
import Dao.VendedorDao;
import Dao.VendedorDaoImplement;
import Class.Administrador;
import Class.DTOAdministrador;

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
	//	List<Vendedor> lista = vendedorDao.buscarTodos();
		ArrayList<DTOVendedor> listaDTO = new ArrayList<DTOVendedor>();
<<<<<<< HEAD
	//	for(Vendedor a: lista) {
	//		listaDTO.add(new DTOAdministrador(a.getIdAdministrador(),a.getUsuario(),a.getClave(),a.getEliminado()));
=======
		for(Vendedor v: lista) {
			listaDTO.add(new DTOVendedor(v.getIdVendedor(),v.getNombre(),v.getApellido(),v.getDni(),v.getUsuario(),v.getClave(),v.getEmail(),v.getEliminado()));
>>>>>>> 88b161b2c24e3bbf7abdb1f26bbacc0ae478789b
			
	//	}
		return listaDTO;
	}

}

