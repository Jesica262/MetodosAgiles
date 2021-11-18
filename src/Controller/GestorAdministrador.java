package Controller;

import Class.Administrador;
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

}
