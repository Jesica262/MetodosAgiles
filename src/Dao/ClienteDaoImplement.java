package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Class.Cliente;

public class ClienteDaoImplement implements ClienteDao {
	
	private Connection con;
	private static final String selectAll = "SELECT * FROM cliente";
	private static final String search = "SELECT * FROM cliente WHERE ";
	private static final String serchNombre= "SELECT * FROM cliente WHERE nombre=?";
	private static final String updateEstado = "UPDATE cliente SET eliminado = ? where idCliente = ?";
	private static final String insert = "INSERT INTO cliente (nombre,apellido,telefono,email,usuario,clave,eliminado,"
			+ "barrio,características,monto) VALUES (?,?,?,?,?,?,?,?,?,?)";
	private static final String update = "UPDATE cliente SET nombre = ?, apellido = ?, telefono = ?, email = ?, "
			+ "usuario = ?, clave = ?, eliminado = ?, tipoInmueble = ?, localidad = ?, barrio = ?, características = ?, "
			+ "monto = ? where idCliente = ?";
	
	@Override
	public List<Cliente> buscarTodos(String s) throws Exception {
		
		List<Cliente> lista = new ArrayList<Cliente>();
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
				Cliente cliente = new Cliente();
		
				cliente.setNombre(rs.getString("nombre"));
				cliente.setApellido(rs.getString("apellido"));
				cliente.setTelefono(rs.getLong("telefono"));
				cliente.setEmail(rs.getString("email"));
				cliente.setUsuario(rs.getString("usuario"));
				cliente.setClave(rs.getString("clave")); 
				cliente.setEliminado(rs.getBoolean("eliminado"));
				cliente.setTipoInmueble(rs.getString("tipoInmueble")); 
				cliente.setLocalidad(rs.getString("localidad"));											
				cliente.setBarrio(rs.getString("barrio")); 
				cliente.setCaracteristicas(rs.getString("características")); 
				cliente.setMonto(rs.getFloat("monto"));
				cliente.setIdCliente(rs.getInt("idCliente"));
				
				if(!cliente.getEliminado())
				{
					lista.add(cliente);
				}
				
			}
						
		} catch(Exception ex) { 
			
			 throw new Exception("Error al buscar los clientes en la Base de datos.");
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
	public Cliente buscarPorNombre(String nombre) throws Exception {
		
		Cliente cliente= new Cliente();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = Conexion.getConexion();
			pstmt= conn.prepareStatement(serchNombre);
			pstmt.setString(1, nombre);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				
				cliente.setNombre(rs.getString("nombre"));
				cliente.setApellido(rs.getString("apellido"));
				cliente.setTelefono(rs.getLong("telefono"));
				cliente.setEmail(rs.getString("email"));
				cliente.setUsuario(rs.getString("usuario"));
				cliente.setClave(rs.getString("clave")); 
				cliente.setEliminado(rs.getBoolean("eliminado"));
				cliente.setTipoInmueble(rs.getString("tipoInmueble")); 
				cliente.setLocalidad(rs.getString("localidad"));											
				cliente.setBarrio(rs.getString("barrio")); 
				cliente.setCaracteristicas(rs.getString("características")); 
				cliente.setMonto(rs.getFloat("monto"));
				cliente.setIdCliente(rs.getInt("idCliente"));
				
			}
		}
		catch (Exception ex)
		{
			throw new Exception("Error al buscar en la Base de datos.");
		
	}
		return cliente;	
	}

	@Override
	public void modificarEstado(Cliente c) throws Exception {
		con = Conexion.conectar();
		PreparedStatement pr = null;
		
			try {
				
				if(c.getIdCliente() != null && c.getIdCliente()  > 0 ) {
				pr = con.prepareStatement(updateEstado);
				pr.setBoolean(1, c.getEliminado());
				pr.setInt(2, c.getIdCliente());
				pr.executeUpdate();	
				}
		
				
			} catch(Exception ex) { 
				
				 throw new Exception("Error al modificacion el estado del cliente en la Base de datos.");
			}
	}

	@Override
	public void altaCliente(Cliente c) throws Exception {

		PreparedStatement pr = null;
		
		try {
			   con = Conexion.getConexion();	
			    pr = con.prepareStatement(insert);
		        pr.setString(1, c.getNombre());
				pr.setString(2, c.getApellido());
				pr.setLong(3, c.getTelefono());
				pr.setString(4, c.getEmail());
				pr.setString(5, c.getUsuario());
				pr.setString(6, c.getClave());
				pr.setBoolean(7, c.getEliminado());
				pr.setString(8, c.getBarrio());
				pr.setString(9, c.getCaracteristicas());
				pr.setFloat(10, c.getMonto());
				pr.executeUpdate();		
				
		} catch(Exception ex) { 
			
			 throw new Exception("Error al guardar un cliente en la Base de datos.");
		}finally {
			try {
				con.close();
			} catch(Exception x) {
				x.printStackTrace();
			}
		}		
	}

	@Override
	public void modificarCliente(Cliente c) throws Exception {
		con = Conexion.conectar();
		PreparedStatement pr = null;
	
		try {
			
			if(c.getIdCliente() != null && c.getIdCliente() > 0 ) {
				
				System.out.print("        fdfb      "+c.getIdCliente());
				pr = con.prepareStatement(update);
				pr.setString(1, c.getNombre());
				pr.setString(2, c.getApellido());
				pr.setLong(3, c.getTelefono());
				pr.setString(4, c.getEmail());
				pr.setString(5, c.getUsuario());
				pr.setString(6, c.getClave());
				pr.setBoolean(7, c.getEliminado());
				pr.setString(8, c.getTipoInmueble());
				pr.setString(9, c.getLocalidad());
				pr.setString(10, c.getBarrio());
				pr.setString(11, c.getCaracteristicas());
				pr.setFloat(12, c.getMonto());
				pr.setInt(13, c.getIdCliente());
				pr.executeUpdate();	
				
			}
	
		} catch(Exception ex) { 
			
			 throw new Exception("Error al querer modificar el Propietario en la Base de datos.");
		}
	
	}

}
