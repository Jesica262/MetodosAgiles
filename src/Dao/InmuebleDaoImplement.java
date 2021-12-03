package Dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

import Class.Inmueble;

public class InmuebleDaoImplement implements InmuebleDao{
	private Connection con;
	private static final String insert = "INSERT INTO inmueble (fechaDeCarga,estado,provincia,localidad,calle,numero,pisoDepartamento,barrio,tipoInmueble,precioVenta,orientacion,frente,fondo,superficieTerreno,gasNatural,antiguedad,aguaCorriente,aguaCaliente,cloacas,patio,pavimento,piscina,baños,dormitorios,lavadero,garage,propiedadHorizontal,observaciones,eliminado,reservado,vendido,foto,idPropietario) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	private static final String delete = "UPDATE inmueble SET eliminado=true WHERE codigo = ?";
	private static final String select_todos ="SELECT * FROM inmueble WHERE eliminado=0";
	private static final String update="UPDATE inmueble SET fechaDeCarga=?, estado=?, provincia=?, localidad=?, calle=?, numero=?, pisoDepartamento=?, barrio=?, tipoInmueble=?, precioVenta=?, orientacion=?, frente=?, fondo=?, superficieTerreno=?, gasNatural=?, antiguedad=?, aguaCorriente=?, aguaCaliente=?, cloacas=?, patio=?, pavimento=?, piscina=?, baños=?, dormitorios=?, lavadero=?, garage=?, propiedadHorizontal=?, observaciones=?, eliminado=?, reservado=?, vendido=?, idPropietario=? WHERE codigo= ?";


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

}
