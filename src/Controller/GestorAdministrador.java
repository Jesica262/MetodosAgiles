package Controller;

import java.util.ArrayList;
import java.util.List;

import Class.Administrador;
import Class.DTOAdministrador;
import Dao.AdministradorDao;
import Dao.AdministradorDaoImplement;

public class GestorAdministrador {
	static private GestorAdministrador gestor = new GestorAdministrador();
	private AdministradorDao admiDao;
    

    static public GestorAdministrador get() {
        return gestor;
    }

	private GestorAdministrador() {
		
		admiDao = new AdministradorDaoImplement() ;
	}
	
	public void guardar(Administrador admi) throws Exception {
		   try {
			   admiDao.altaAdministrador(admi);		   
		   }
			
			catch (Exception ex) {
				 throw ex;
				
			}
		}

	public ArrayList<DTOAdministrador> buscarAdministrador(DTOAdministrador administradorABuscar) throws Exception {
		List<Administrador> lista = admiDao.buscarTodos();
		ArrayList<DTOAdministrador> listaDTO = new ArrayList<DTOAdministrador>();
		for(Administrador a: lista) {
			if(a.getUsuario().equals(administradorABuscar.getUsuario()) && a.getUsuario().equals(administradorABuscar.getUsuario())) listaDTO.add(new DTOAdministrador(a.getIdAdministrador(),a.getUsuario(),a.getClave(),a.getEliminado()));
			
		}
		return listaDTO;
		
	}

}
