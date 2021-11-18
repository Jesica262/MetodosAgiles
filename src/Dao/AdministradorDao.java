package Dao;

import java.util.ArrayList;
import java.util.List;

import Class.Administrador;
import Class.DTOAdministrador;

public interface AdministradorDao {
	
	public void altaAdministrador(Administrador a) throws Exception;
	
	public void bajaAdministrador(Integer id) throws Exception;

	List<Administrador> buscarTodos() throws Exception;
	
}
