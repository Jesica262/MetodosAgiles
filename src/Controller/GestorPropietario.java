package Controller;

import java.util.List;

import Class.Propietario;
import Dao.PropietarioDao;
import Dao.PropietarioDaoImplement;

public class GestorPropietario {
	
	private PropietarioDao propietarioDao;
	 
    public GestorPropietario() { 
    	
    	propietarioDao = new PropietarioDaoImplement();
    }

  //  static public GestorPropietario get() {
   //     return gestor;
    //}
    
    public void guardar(Propietario p) throws Exception {
		   try {
			   propietarioDao.altaPropietario(p);
		   }
			
			catch (Exception ex) {
				 throw ex;
				
			}
	}
    
    public void modificar(Propietario p) throws Exception {
		   try {
			   propietarioDao.modificarPropietario(p);
		   }
			
			catch (Exception ex) {
				 throw ex;
				
			}
	}
    
    public Propietario BuscarPorNombre(String nombre) throws Exception {
		try {
			return propietarioDao.buscarPorNombre(nombre);
		   }
			
			catch (Exception ex) {
				 throw ex;
				
			}	
	}
    
    public List<Propietario> buscarTodos() throws Exception{
		
		try {
			return propietarioDao.buscarTodos("");
		   }
			
			catch (Exception ex) {
				 throw ex;
				
			}
    }
    
    public void modificarEstado(Propietario p) throws Exception  {
    	
    	try {
    		propietarioDao.modificarEstado(p);
		   }
			
			catch (Exception ex) {
				 throw ex;
				
			}
    }
    public boolean validacionVacios(String nombre, String apellido, String dni, String telefono, String email, String calle, 
    		String numero, String tipo, String provincia, String localidad) {
		
		if(nombre.isEmpty() || apellido.isEmpty() || dni.isEmpty() || telefono.isEmpty() || email.isEmpty() || calle.isEmpty() 
				|| numero.isEmpty() || tipo.isEmpty() || provincia.isEmpty() || localidad.isEmpty()) {
			System.out.println("El campo se encuentra vacío"); 
			return false;
		}
		
		return true;
    }
}
