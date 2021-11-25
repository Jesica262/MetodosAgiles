package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import Class.Propietario;

public class PropietarioDaoImplement implements PropietarioDao{
	
	private Connection con;
	private static final String insert = "INSERT INTO propietario (nombre,apellido,dni,tipoDocumento,calle,numeroCalle,localidad,provincia,telefono,email) VALUES (?,?,?,?,?,?,?,?,?,?)";
	
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
				pr.setInt(5, p.getNumeroCalle());
				pr.setString(6, p.getLocalidad());
				pr.setString(7, p.getProvincia());
				pr.setLong(8, p.getTelefono());
				pr.setString(9, p.getEmail());
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
}
