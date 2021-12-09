package Controller;

import java.util.List;

import Class.Cliente;
import Class.Inmueble;
import Class.Propietario;
import Dao.InmuebleDao;
import Dao.InmuebleDaoImplement;

public class GestorInmueble {
	static private GestorInmueble gestor = new GestorInmueble();
	private InmuebleDao inmuebleDao;
	 
    public GestorInmueble() {
    	inmuebleDao = new InmuebleDaoImplement();
    }

    static public GestorInmueble get() {
        return gestor;
    }
    
    public Boolean crearInmueble(Inmueble i) throws Exception {
    	inmuebleDao.guardarInmueble(i);
    	return true;
    }
    public Boolean darDeBajaInmueble(Inmueble i) throws Exception {
    	inmuebleDao.eliminarInmueble(i);
    	return true;
    }
    public Boolean modificarInmueble(Inmueble i) throws Exception {
    	return inmuebleDao.actualizarInmueble(i);
    }
    
    public List<Inmueble> buscarTodos() throws Exception{
		
		try {
			return inmuebleDao.buscarTodos("");
		   }
			
			catch (Exception ex) {
				 throw ex;
				
			}
    }
    public Inmueble BuscarPorCodigo(String codigo) throws Exception {
 		try {
 			return inmuebleDao.buscarPorCodigo(codigo);
 		   }
 			
 			catch (Exception ex) {
 				 throw ex;				
 			}	
 	}

}
