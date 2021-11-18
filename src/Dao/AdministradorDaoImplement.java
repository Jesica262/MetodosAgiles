package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Class.Administrador;
import Class.DTOAdministrador;


public class AdministradorDaoImplement implements AdministradorDao {

	private Connection con;
	private static final String insert = "INSERT INTO administrador (nombre) VALUES (?)";
	private static final String delete = "DELETE FROM administrador WHERE id_administrador = ?";
	private static final String select_todos ="SELECT * FROM administrador";
	
	@Override
	public void altaAdministrador(Administrador a) throws Exception {

		PreparedStatement pr = null;
		
		try {
			   con = Conexion.getConexion();	
			    pr = con.prepareStatement(insert);
		        pr.setString(1,a.getUsuario());
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
	@Override
	public List<Administrador> buscarTodos() {
		 
			List<Administrador> lista = new ArrayList<Administrador>();
			ResultSet rs = null;
			PreparedStatement pr = null;
			try {
				con = Conexion.getConexion();
				pr= con.prepareStatement(select_todos);
				rs = pr.executeQuery();
				while(rs.next()) {
					Administrador a = new Administrador();

					a.setId(rs.getInt("idAdministrador"));
					a.setUsuario(rs.getString("usuario"));
					a.setClave(rs.getString("clave"));
					a.setEliminado(rs.getBoolean("eliminado"));
					lista.add(a);
				}			
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				try {
					if(rs!=null) rs.close();
					if(pr!=null) pr.close();
					if(con!=null) con.close();				
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}	
			System.out.println("Resultado "+lista);
			return lista;
	}
}
