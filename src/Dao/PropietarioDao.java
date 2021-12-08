package Dao;

import java.util.List;

import Class.Propietario;

public interface PropietarioDao {
	
	public void altaPropietario(Propietario p) throws Exception;
	public List<Propietario> buscarTodos(String s) throws Exception;
	public Propietario buscarPorNombre(String nombre)throws Exception;
	public void modificarEstado(Propietario p)  throws Exception;
	public void modificarPropietario(Propietario p)  throws Exception;
	Propietario buscarPorId(Integer id) throws Exception;

}
