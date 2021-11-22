package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Class.Administrador;
import Class.Vendedor;

public class VendedorDaoImplement implements VendedorDao{
	private Connection con;
	private static final String insert = "INSERT INTO vendedor (nombre) VALUES (?)";
	private static final String delete = "DELETE FROM vendedor WHERE id_administrador = ?";
	private static final String select_todos ="SELECT * FROM vendedor";

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

}
