package Dao;

import java.util.List;

import Class.Propietario;

public interface PropietarioDao {
	
	public void altaPropietario(Propietario p) throws Exception;
	public List<Propietario> buscarTodos(String s) throws Exception;

}
