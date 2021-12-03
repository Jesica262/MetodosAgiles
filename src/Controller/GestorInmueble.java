package Controller;

import Class.Inmueble;
import Dao.InmuebleDao;
import Dao.InmuebleDaoImplement;

public class GestorInmueble {
	static private GestorInmueble gestor = new GestorInmueble();
	private InmuebleDao inmuebleDao;
	 
    private GestorInmueble() {
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

}
