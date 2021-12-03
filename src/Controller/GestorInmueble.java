package Controller;

import Class.Inmueble;
import Dao.InmuebleDao;

public class GestorInmueble {
	static private GestorInmueble gestor = new GestorInmueble();
	private InmuebleDao inmuebleDao;
	 
    private GestorInmueble() {
    	inmuebleDao = new InmuebleDao();
    }

    static public GestorInmueble get() {
        return gestor;
    }
    
    public Boolean crearInmueble(Inmueble i) throws Exception {
    	inmuebleDao.guardarInmueble(i);
    	return true;
    }

}
