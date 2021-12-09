package Controller;

import java.util.List;

import Class.Cliente;
import Class.Propietario;
import Dao.ClienteDao;
import Dao.ClienteDaoImplement;

public class GestorCliente {
	
	static private GestorCliente gestor = new GestorCliente();
	private ClienteDao clienteDao;
	 
    public GestorCliente() { 
    	
    	clienteDao = new ClienteDaoImplement();
    }
    
    static public GestorCliente get() {
        return gestor;
    }
    public List<Cliente> buscarTodos() throws Exception{
		
		try {
			return clienteDao.buscarTodos("");
		   }			
			catch (Exception ex) {
				 throw ex;
			}
    }
    public void modificarEstado(Cliente c) throws Exception  {
    	
    	try {
    		clienteDao.modificarEstado(c);
		   }
			
			catch (Exception ex) {
				 throw ex;				
			}
    }
    public boolean validacionVacios(String nombre, String apellido,String telefono, String usuario, String clave, 
    		String barrio, String caracteristica, String monto, String inmueble, String localidad) {
		
		if(nombre.isEmpty() || apellido.isEmpty() || telefono.isEmpty() || usuario.isEmpty() || clave.isEmpty() 
		|| barrio.isEmpty() || caracteristica.isEmpty() || monto.isEmpty() || inmueble.isEmpty() || localidad.isEmpty()) 
		{
			System.out.println("El campo se encuentra vacío"); 
			return false;
		}		
		return true;
    }   
    public void guardar(Cliente c) throws Exception {
		   try {
			   clienteDao.altaCliente(c);
		   }			
			catch (Exception ex) {
				 throw ex;				
			}
	}
    public void modificarCliente(Cliente c) throws Exception {
		   try {
			   clienteDao.modificarCliente(c);
		   }			
			catch (Exception ex) {
				 throw ex;				
			}
	}
    public Cliente BuscarPorNombre(String nombre) throws Exception {
 		try {
 			return clienteDao.buscarPorNombre(nombre);
 		   }
 			
 			catch (Exception ex) {
 				 throw ex;				
 			}	
 	}
    

}
