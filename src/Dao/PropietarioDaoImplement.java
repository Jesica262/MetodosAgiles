package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Class.Propietario;

public class PropietarioDaoImplement implements PropietarioDao{
	
	private Connection con;
	private static final String insert = "INSERT INTO propietario (nombre,apellido,dni,tipoDocumento,calle,numeroCalle,localidad,provincia,telefono,email) VALUES (?,?,?,?,?,?,?,?,?,?)";
	private static final String selectAll = "SELECT * FROM propietario";
	private static final String search = "SELECT * FROM propietario WHERE ";
	private static final String serchNombre= "SELECT * FROM propietario WHERE nombre=?";
	private static final String updateEstado = "UPDATE propietario SET eliminado = ? where idPropietario = ?";
	private static final String update = "UPDATE propietario SET nombre = ?, apellido = ?, dni = ?, tipoDocumento = ?, calle = ?, numeroCalle = ?, localidad = ?, provincia = ?, telefono = ?, email = ? where idPropietario = ?";
	private static final String buscarPorId = "SELECT * FROM propietario WHERE idPropietario=?";
	@Override
	public void altaPropietario(Propietario p) throws Exception {
		
		PreparedStatement pr = null;
		
		try {
			   con = Conexion.getConexion();	
			    pr = con.prepareStatement(insert);
		        pr.setString(1, p.getNombre());
				pr.setString(2, p.getApellido());
				pr.setLong(3, p.getNumeroDocumento());
				pr.setString(4, p.getTipoDocumento());
				pr.setString(5, p.getCalle());
				pr.setInt(6, p.getNumeroCalle());
				pr.setString(7, p.getLocalidad());
				pr.setString(8, p.getProvincia());
				pr.setLong(9, p.getTelefono());
				pr.setString(10, p.getEmail());
				pr.executeUpdate();		
			
		} catch(Exception ex) { 
			
			 throw new Exception("Error al guardar un propietario en la Base de datos.");
		}finally {
			try {
				con.close();
			} catch(Exception x) {
				x.printStackTrace();
			}
		}		
	}

	@Override
	public List<Propietario> buscarTodos(String s) throws Exception {
		List<Propietario> lista = new ArrayList<Propietario>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = Conexion.getConexion();
			if(!s.isEmpty()) {
				pstmt= conn.prepareStatement(search);
				pstmt.setString(1, s);
				rs = pstmt.executeQuery();
			}
			else {
				pstmt= conn.prepareStatement(selectAll);
				rs = pstmt.executeQuery();
			}
			while(rs.next()) {
				Propietario p = new Propietario();
				p.setApellido(rs.getString("apellido"));
				p.setNombre(rs.getString("nombre"));
				p.setCalle(rs.getString("calle"));
				p.setEmail(rs.getString("email"));
				p.setLocalidad(rs.getString("localidad"));
				p.setNumeroCalle(rs.getInt("numeroCalle"));
				p.setNumeroDocumento(rs.getLong("dni"));
				p.setTelefono(rs.getLong("telefono"));
				p.setTipoDocumento(rs.getString("tipoDocumento"));
				p.setEliminado(rs.getBoolean("eliminado"));
				p.setProvincia(rs.getString("provincia"));
				p.setIdPropietario(rs.getInt("idPropietario"));
				
				if(!p.getEliminado())
				{
					lista.add(p);
				}
			}
						
		} catch(Exception ex) { 
			
			 throw new Exception("Error al buscar todos los propietarios en la Base de datos.");
		}finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();				
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}	
		return lista;	
	}

	@Override
	public Propietario buscarPorNombre(String nombre) throws Exception {
		Propietario propietario= new Propietario();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = Conexion.getConexion();
			pstmt= conn.prepareStatement(serchNombre);
			pstmt.setString(1, nombre);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				
				propietario.setApellido(rs.getString("apellido"));
				propietario.setNombre(rs.getString("nombre"));
				propietario.setCalle(rs.getString("calle"));
				propietario.setEmail(rs.getString("email"));
				propietario.setLocalidad(rs.getString("localidad"));
				propietario.setProvincia(rs.getString("provincia"));
				propietario.setNumeroCalle(rs.getInt("numeroCalle"));
				propietario.setNumeroDocumento(rs.getLong("dni"));
				propietario.setTelefono(rs.getLong("telefono"));
				propietario.setIdPropietario(rs.getInt("idPropietario"));
				propietario.setTipoDocumento(rs.getString("tipoDocumento"));
				
			}
		}
		catch (Exception ex)
		{
			throw new Exception("Error al buscar en la Base de datos.");
		
	}
		return propietario;
	}

	@Override
	public void modificarEstado(Propietario p) throws Exception {
		con = Conexion.conectar();
		PreparedStatement pr = null;
		
			try {
				
				if(p.getIdPropietario() != null && p.getIdPropietario() > 0 ) {
				pr = con.prepareStatement(updateEstado);
				pr.setBoolean(1, p.getEliminado());
				pr.setInt(2, p.getIdPropietario());
				pr.executeUpdate();	
				}
		
				
			} catch(Exception ex) { 
				
				 throw new Exception("Error al modificacion el estado del propietario en la Base de datos.");
			}
	}

	@Override
	public void modificarPropietario(Propietario p) throws Exception {
			con = Conexion.conectar();
			PreparedStatement pr = null;
		
			try {
				
				if(p.getIdPropietario() != null && p.getIdPropietario() > 0 ) {
				pr = con.prepareStatement(update);
				pr.setString(1, p.getNombre());
				pr.setString(2, p.getApellido());
				pr.setLong(3, p.getNumeroDocumento());
				pr.setString(4, p.getTipoDocumento());
				pr.setString(5, p.getCalle());
				pr.setInt(6, p.getNumeroCalle());
				pr.setString(7, p.getLocalidad());
				pr.setString(8, p.getProvincia());
				pr.setLong(9, p.getTelefono());
				pr.setString(10, p.getEmail());
				pr.setInt(11, p.getIdPropietario());
				pr.executeUpdate();	
				}
		
			} catch(Exception ex) { 
				
				 throw new Exception("Error al querer modificar el Propietario en la Base de datos.");
			}
		
	}
	@Override
	public Propietario buscarPorId(Integer id) throws Exception {
		Propietario propietario= new Propietario();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = Conexion.getConexion();
			pstmt= conn.prepareStatement(buscarPorId);
			pstmt.setString(1, id.toString());
			rs = pstmt.executeQuery();
			if(rs.next()) {
				
				propietario.setApellido(rs.getString("apellido"));
				propietario.setNombre(rs.getString("nombre"));
				propietario.setCalle(rs.getString("calle"));
				propietario.setEmail(rs.getString("email"));
				propietario.setLocalidad(rs.getString("localidad"));
				propietario.setProvincia(rs.getString("provincia"));
				propietario.setNumeroCalle(rs.getInt("numeroCalle"));
				propietario.setNumeroDocumento(rs.getLong("dni"));
				propietario.setTelefono(rs.getLong("telefono"));
				propietario.setIdPropietario(rs.getInt("idPropietario"));
				propietario.setTipoDocumento(rs.getString("tipoDocumento"));
				
			}
		}
		catch (Exception ex)
		{
			throw new Exception("Error al buscar en la Base de datos.");
		
	}
		return propietario;
	
	}
	
}