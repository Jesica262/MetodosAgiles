package Controller;

import java.time.LocalDate;
import java.util.List;

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
    public List<Inmueble> obtenerTodos() throws Exception{
    	
    	
    	return inmuebleDao.obtenerTodos();
    }
    
    public List<Inmueble> buscarTodos() throws Exception{
		
		try {
			return inmuebleDao.buscarTodos("");
		   }
			
			catch (Exception ex) {
				 throw ex;
				
			}
    }
	public boolean validacionVacios(String propietario, String fechaCarga,String provincia, 
			String localidad, String calle, String numeroCalle, String tipoInmueble,String precioVenta) {
			
			if(propietario.isBlank() || fechaCarga.isBlank() || provincia.isBlank() || localidad.isBlank() ||
					calle.isBlank() || numeroCalle.isBlank() || tipoInmueble.isBlank() || precioVenta.isBlank()) {
				System.out.println("Algun campo obligatorio se encuentra vacío"); 
				return false;
			}
			
			return true;
	    }

}
