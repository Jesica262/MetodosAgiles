package Controller;

import java.util.ArrayList;
import java.util.List;

import Class.Vendedor;
import Dao.VendedorDao;
import Dao.VendedorDaoImplement;

public class GestorVendedor {
	static private GestorVendedor gestor = new GestorVendedor();
	private VendedorDao vendedorDao;
	 
    private GestorVendedor() { 
    	vendedorDao = new VendedorDaoImplement();
    }

    static public GestorVendedor get() {
        return gestor;
    }

	public List<Vendedor> obtenerTodos() {
		return vendedorDao.buscarTodos();
		
	}
	public Boolean crearVendedor(Vendedor v) throws Exception {
		vendedorDao.guardarVendedor(v);
		return true;
	}
	public Boolean modificarVendedor(Vendedor v) throws Exception {
		vendedorDao.actualizarVendedor(v);
		return true;
	}
	public Boolean eliminarVendedor(Vendedor v) throws Exception {
		vendedorDao.darDeBajaVendedor(v);
		return true;
	}
    public boolean validacionVacios(String nombre, String dni,String apellido, String email, String usuario, String clave) {
		
		if(nombre.isEmpty() || apellido.isEmpty() || dni.isEmpty() || clave.isEmpty() || usuario.isEmpty()) {
			System.out.println("El campo se encuentra vacío"); 
			return false;
		}
		
		return true;
    }

}

