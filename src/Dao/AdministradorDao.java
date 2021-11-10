package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import Class.Administrador;

public class AdministradorDao implements AdministradorDaoImplement{

	
	private Connection con;
	private static final String insert = "INSERT INTO administrador (nombre) VALUES (?)";
	private static final String delete = "DELETE FROM administrador WHERE id_administrador = ?";
	
	@Override
	public void altaAdministrador(Administrador a) throws Exception {

		PreparedStatement pr = null;
		
		try {
			   con = Conexion.getConexion();	
			    pr = con.prepareStatement(insert);
		        pr.setString(1,a.getNombre());
				pr.executeUpdate();		
			
		} catch(Exception ex) { 
			
			 throw new Exception("Error al guardar el Administrador en la Base de datos.");
		}finally {
			try {
				con.close();
			} catch(Exception x) {
				x.printStackTrace();
			}
		}
		
		
	}
	@Override
	public void bajaAdministrador(Integer id) throws Exception {

		PreparedStatement pr = null;
		try {
			con = Conexion.getConexion();
			pr = con.prepareStatement(delete);
			pr.setInt(1, id);
			pr.executeUpdate();
		} catch(Exception ex) { 
			
			 throw new Exception("Error al dar de baja el Administrador en la Base de datos.");
		}
		
	}
}
