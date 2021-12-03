package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import Class.Inmueble;

public class InmuebleDaoImplement implements InmuebleDao{
	private Connection con;
	private static final String insert = "INSERT INTO inmueble (codigo,fechaDeCarga,estado,provincia,localidad,calle,numero,pisoDepartamento,barrio,tipoInmueble,precioVenta,orientacion,frente,fondo,superficieTerreno,gasNatural,antiguedad,aguaCorriente,aguaCaliente,cloacas,patio,pavimento,piscina,baños,dormitorios,lavadero,garage,propiedadHorizontal,observaciones,eliminado,reservado,vendido,foto,idPropietario) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	private static final String delete = "UPDATE inmueble SET eliminado=true WHERE idVendedor = ?";
	private static final String select_todos ="SELECT * FROM inmueble WHERE eliminado=0";
	private static final String update="UPDATE inmueble SET nombre=?, apellido=?, email=?, dni=?, usuario=?, clave=? WHERE idVendedor= ?";


	@Override
	public Boolean guardarInmueble(Inmueble i) {
		
		PreparedStatement pr = null;
		
		try {
			   con = Conexion.getConexion();	
			    pr = con.prepareStatement(insert);
		        pr.setString(1, v.getNombre());
				
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
