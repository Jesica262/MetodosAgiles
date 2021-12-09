package Dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Class.Cliente;
import Class.Inmueble;
import Class.Propietario;

public class InmuebleDaoImplement implements InmuebleDao{
	private Connection con;
	private static final String insert = "INSERT INTO inmueble (fechaDeCarga,estado,provincia,localidad,calle,numero,pisoDepartamento,barrio,tipoInmueble,precioVenta,orientacion,frente,fondo,superficieTerreno,gasNatural,antiguedad,aguaCorriente,aguaCaliente,cloacas,patio,pavimento,piscina,baños,dormitorios,lavadero,garage,propiedadHorizontal,observaciones,eliminado,reservado,vendido,foto,idPropietario) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	private static final String delete = "UPDATE inmueble SET eliminado=true WHERE codigo = ?";
	private static final String select_todos ="SELECT * FROM inmueble WHERE eliminado=0";
	private static final String update="UPDATE inmueble SET fechaDeCarga=?, estado=?, provincia=?, localidad=?, calle=?, numero=?, pisoDepartamento=?, barrio=?, tipoInmueble=?, precioVenta=?, orientacion=?, frente=?, fondo=?, superficieTerreno=?, gasNatural=?, antiguedad=?, aguaCorriente=?, aguaCaliente=?, cloacas=?, patio=?, pavimento=?, piscina=?, baños=?, dormitorios=?, lavadero=?, garage=?, propiedadHorizontal=?, observaciones=?, eliminado=?, reservado=?, vendido=?, idPropietario=? WHERE codigo= ?";
	private static final String search = "SELECT * FROM inmueble WHERE ";
	private static final String selectAll = "SELECT * FROM inmueble";
	private static final String searchCodigo = "SELECT * FROM inmueble WHERE codigo=?";
	
	@Override
	public Boolean guardarInmueble(Inmueble i) throws Exception {
		
		PreparedStatement pr = null;
		
		try {
			   con = Conexion.getConexion();	
			    pr = con.prepareStatement(insert);
		        pr.setDate(1,Date.valueOf(i.getFechaCarga()));
		        pr.setString(2, i.getEstado());
		        pr.setString(3, i.getProvincia());
		        pr.setString(4, i.getLocalidad());
		        pr.setString(5, i.getCalle());
		        pr.setInt(6, i.getNumeroCalle());
		        pr.setString(7, i.getPisoDepartamento());
		        pr.setString(8, i.getBarrio());
		        pr.setString(9, i.getTipoInmueble());
		        pr.setFloat(10, i.getPrecioVenta());
		        pr.setString(11, i.getOrientacion());
		        pr.setFloat(12, i.getFrente());
		        pr.setFloat(13, i.getFondo());
		        pr.setFloat(14, i.getSuperficieTerreno());
		        pr.setBoolean(15, i.getGasNatural());
		        pr.setInt(16, i.getAntiguedad());
		        pr.setBoolean(17, i.getAguaCorriente());
		        pr.setBoolean(18, i.getAguaCaliente());
		        pr.setBoolean(19, i.getCloacas());
		        pr.setBoolean(20, i.getPatio());
		        pr.setBoolean(21, i.getPavimento());
		        pr.setBoolean(22, i.getPiscina());
		        pr.setInt(23, i.getBaños());
		        pr.setInt(24, i.getDormitorios());
		        pr.setBoolean(25, i.getLavadero());
		        pr.setBoolean(26, i.getGarageCochera());
		        pr.setString(27, i.getPropiedadHorizontal().toString()); //acomodar esto en la base de datos
		        pr.setString(28, i.getObservaciones());
		        pr.setBoolean(29, i.getEliminado());
		        pr.setBoolean(30, i.getReservado());
		        pr.setBoolean(31, i.getVendido());
		        //pr.setBlob(parameterIndex, inputStream, length);   //agregar otro ? en la sentencia insert al arreglar esto
		        pr.setInt(32, i.getPropietario().getIdPropietario());
		        
				pr.executeUpdate();		
			
		} catch(Exception ex) { 
			
			 throw new Exception("Error al guardar el inmueble en la Base de datos.");
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
	public Boolean eliminarInmueble(Inmueble i) throws Exception {
		PreparedStatement pr = null;
		
		try {
			   con = Conexion.getConexion();	
			    pr = con.prepareStatement(delete);
				pr.setInt(1, i.getCodigo());
				pr.executeUpdate();		
			
		} catch(Exception ex) { 
			
			 throw new Exception("Error al eliminar el inmueble en la Base de datos.");
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
	public Boolean actualizarInmueble(Inmueble i) throws Exception {
		
		PreparedStatement pr = null;
		
		try {
			   con = Conexion.getConexion();	
			    pr = con.prepareStatement(update);
		        pr.setDate(1,Date.valueOf(i.getFechaCarga()));
		        pr.setString(2, i.getEstado());
		        pr.setString(3, i.getProvincia());
		        pr.setString(4, i.getLocalidad());
		        pr.setString(5, i.getCalle());
		        pr.setInt(6, i.getNumeroCalle());
		        pr.setString(7, i.getPisoDepartamento());
		        pr.setString(8, i.getBarrio());
		        pr.setString(9, i.getTipoInmueble());
		        pr.setFloat(10, i.getPrecioVenta());
		        pr.setString(11, i.getOrientacion());
		        pr.setFloat(12, i.getFrente());
		        pr.setFloat(13, i.getFondo());
		        pr.setFloat(14, i.getSuperficieTerreno());
		        pr.setBoolean(15, i.getGasNatural());
		        pr.setInt(16, i.getAntiguedad());
		        pr.setBoolean(17, i.getAguaCorriente());
		        pr.setBoolean(18, i.getAguaCaliente());
		        pr.setBoolean(19, i.getCloacas());
		        pr.setBoolean(20, i.getPatio());
		        pr.setBoolean(21, i.getPavimento());
		        pr.setBoolean(22, i.getPiscina());
		        pr.setInt(23, i.getBaños());
		        pr.setInt(24, i.getDormitorios());
		        pr.setBoolean(25, i.getLavadero());
		        pr.setBoolean(26, i.getGarageCochera());
		        pr.setString(27, i.getPropiedadHorizontal().toString()); //acomodar esto en la base de datos
		        pr.setString(28, i.getObservaciones());
		        pr.setBoolean(29, i.getEliminado());
		        pr.setBoolean(30, i.getReservado());
		        pr.setBoolean(31, i.getVendido());
		        //pr.setBlob(parameterIndex, inputStream, length);   //agregar fot=? en la sentencia update al arreglar esto
		        pr.setInt(32, i.getPropietario().getIdPropietario());
		        pr.setInt(33, i.getCodigo());
		        
				pr.executeUpdate();		
			
		} catch(Exception ex) { 
			
			 throw new Exception("Error al guardar el inmueble en la Base de datos.");
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
	public List<Inmueble> buscarTodos(String s) throws Exception {
		List<Inmueble> lista = new ArrayList<Inmueble>();
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
				Inmueble i = new Inmueble();
				
				i.setAguaCaliente(rs.getBoolean("aguaCaliente"));
				i.setAguaCorriente(rs.getBoolean("aguaCorriente"));
				i.setAntiguedad(rs.getInt("antiguedad"));
				i.setBarrio(rs.getString("barrio"));
				i.setBaños(rs.getInt("baños"));
				i.setCalle(rs.getString("calle"));
				i.setCloacas(rs.getBoolean("cloacas"));
				i.setDormitorios(rs.getInt("dormitorios"));
				i.setEliminado(rs.getBoolean("eliminado"));
				i.setEstado(rs.getString("estado"));
				//i.setFechaCarga(rs.getDate("fechaDeCarga"));
				i.setFondo(rs.getFloat("fondo"));
				i.setFrente(rs.getFloat("frente"));
				i.setGarageCochera(rs.getBoolean("garage"));
				i.setGasNatural(rs.getBoolean("gasNatural"));
				i.setLavadero(rs.getBoolean("lavadero"));
				i.setLocalidad(rs.getString("localidad"));
				i.setNumeroCalle(rs.getInt("numero"));
				i.setObservaciones(rs.getString("observaciones"));
				i.setOrientacion(rs.getString("orientacion"));
				i.setPatio(rs.getBoolean("patio"));
				i.setPavimento(rs.getBoolean("pavimento"));
				i.setPiscina(rs.getBoolean("piscina"));
				i.setPisoDepartamento(rs.getString("pisoDepartamento"));
				i.setPrecioVenta(rs.getFloat("precioVenta"));
				//i.setPropiedadHorizontal(rs.getString("propiedadHorizontal"));
				i.setProvincia(rs.getString("provincia"));
				i.setReservado(rs.getBoolean("reservado"));
				//i.setSuperficieEdificada(rs.getFloat(""));
				i.setSuperficieTerreno(rs.getFloat("superficieTerreno"));
				//i.setTelefono(rs.getBoolean(""));
				i.setTipoInmueble(rs.getString("tipoInmueble"));
				i.setVendido(rs.getBoolean("vedido")); 
								
				lista.add(i);
			}
						
		} catch(Exception ex) { 
			
			 throw new Exception("Error al buscar todos los inmuebles en la Base de datos.");
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
	public Inmueble buscarPorCodigo(String codigo) throws Exception {
		Inmueble inmueble = new Inmueble();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = Conexion.getConexion();
			pstmt= conn.prepareStatement(searchCodigo);
			pstmt.setString(1, codigo);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				
				inmueble.setCodigo(rs.getInt("codigo"));
				inmueble.setCalle(rs.getString("calle"));
				inmueble.setLocalidad(rs.getString("localidad"));
				inmueble.setProvincia(rs.getString("provincia"));
				inmueble.setNumeroCalle(rs.getInt("numero"));
				inmueble.setTipoInmueble(rs.getString("tipoInmueble"));
				inmueble.setPrecioVenta(rs.getFloat("precioVenta"));
			
			}
		}
		catch (Exception ex)
		{
			throw new Exception("Error al buscar en la Base de datos.");
		
	}
		return inmueble;	
	}

}
