package Controller;

import Class.Administrador;
import Dao.AdministradorDao;
import Dao.AdministradorDaoImplement;

public class GestorAdministrador {
	
	private AdministradorDaoImplement admiDao;

	public GestorAdministrador() {
		
		admiDao = new AdministradorDao() ;
	}
	
	public void guardar(Administrador admi) throws Exception {
		   try {
			   admiDao.altaAdministrador(admi);		   
		   }
			
			catch (Exception ex) {
				 throw ex;
				
			}
		}

}
