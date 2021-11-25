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
			
			 throw new Exception("Error al guardar una estacion en la Base de datos.");
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
				
				lista.add(p);
			}
						
		} catch(Exception ex) { 
			
			 throw new Exception("Error al buscar todas las estaciones en la Base de datos.");
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
}