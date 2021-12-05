package Dao;

import java.util.List;

import Class.Cliente;
import Class.Propietario;

public interface ClienteDao {

	public List<Cliente> buscarTodos(String s) throws Exception;
	public Cliente buscarPorNombre(String nombre)throws Exception;
	public void modificarEstado(Cliente c)  throws Exception;
	public void altaCliente(Cliente c) throws Exception;
	public void modificarCliente(Cliente c)  throws Exception;
}
