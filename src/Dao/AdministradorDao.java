package Dao;

import Class.Administrador;

public interface AdministradorDao {
	
	public void altaAdministrador(Administrador a) throws Exception;
	
	public void bajaAdministrador(Integer id) throws Exception;
	
}
