package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Class.Vendedor;

public class VendedorDaoImplement implements VendedorDao{
	private Connection con;
	private static final String insert = "INSERT INTO vendedor (nombre,apellido,email,dni,usuario,clave,eliminado) VALUES (?,?,?,?,?,?,?)";
	private static final String delete = "UPDATE vendedor SET eliminado=1 WHERE id_administrador = ?";
	private static final String select_todos ="SELECT * FROM vendedor WHERE eliminado=0";
	private static final String update="UPDATE vendedor SET nombre=?, apellido=?. email=?, dni=?, usuario=?, clave=? WHERE idVendedor= ?";

	@Override
	public List<Vendedor> buscarTodos() {
		List<Vendedor> lista = new ArrayList<Vendedor>();
		ResultSet rs = null;
		PreparedStatement pr = null;
		try {
			con = Conexion.getConexion();
			pr= con.prepareStatement(select_todos);
			rs = pr.executeQuery();
			while(rs.next()) {
				Vendedor a = new Vendedor();

				a.setIdVendedor(rs.getInt("idVendedor"));
				a.setNombre(rs.getString("nombre"));
				a.setApellido(rs.getString("apellido"));
				a.setDni(rs.getLong("dni"));
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

	@Override
	public Boolean guardarVendedor(Vendedor v) throws Exception {
		PreparedStatement pr = null;
				
				try {
					   con = Conexion.getConexion();	
					    pr = con.prepareStatement(insert);
				        pr.setString(1, v.getNombre());
						pr.setString(2, v.getApellido());
						pr.setString(3, v.getEmail());
						pr.setLong(4, v.getDni());
						pr.setString(5, v.getUsuario());
						pr.setString(6, v.getClave());
						pr.setBoolean(7, v.getEliminado());
						pr.executeUpdate();		
					
				} catch(Exception ex) { 
					
					 throw new Exception("Error al guardar el vendedor en la Base de datos.");
				}finally {
					try {
						con.close();
					} catch(Exception x) {
						x.printStackTrace();
					}
				}		
	
		return true;
	}

	@Override
	public Boolean actualizarVendedor(Vendedor v) throws Exception {
		PreparedStatement pr = null;
		
		try {
			   con = Conexion.getConexion();	
			    pr = con.prepareStatement(update);
		        pr.setString(1, v.getNombre());
				pr.setString(2, v.getApellido());
				pr.setString(3, v.getEmail());
				pr.setLong(4, v.getDni());
				pr.setString(5, v.getUsuario());
				pr.setString(6, v.getClave());
				pr.setInt(7, v.getIdVendedor());
				pr.executeUpdate();		
			
		} catch(Exception ex) { 
			
			 throw new Exception("Error al guardar el vendedor en la Base de datos.");
		}finally {
			try {
				con.close();
			} catch(Exception x) {
				x.printStackTrace();
			}
		}		

		return true;
	}

	@Override
	public Boolean darDeBajaVendedor(Vendedor v) throws Exception {
		PreparedStatement pr = null;
		
		try {
			   con = Conexion.getConexion();	
			    pr = con.prepareStatement(delete);
				pr.setInt(1, v.getIdVendedor());
				pr.executeUpdate();		
			
		} catch(Exception ex) { 
			
			 throw new Exception("Error al eliminar el vendedor en la Base de datos.");
		}finally {
			try {
				con.close();
			} catch(Exception x) {
				x.printStackTrace();
			}
		}		

		return true;
	}

}
