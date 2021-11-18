package Class;

public class Administrador {
	
	private Integer idAdministrador;
	private String usuario;
	private String clave;
	private Boolean eliminado;

	public Administrador() {}

	public String getUsuario() {
		return usuario;
	}

	public void setId(int idAdmin) {
		idAdministrador=idAdmin;
		
	}

	public void setUsuario(String user) {
		usuario=user;
	}

	public void setClave(String pass) {
		clave=pass;
	}

	public void setEliminado(boolean elim) {
		eliminado=elim;
		
	}

	public Integer getIdAdministrador() {
		return idAdministrador;
	}

	public String getClave() {
		return clave;
	}

	public Boolean getEliminado() {
		return eliminado;
	}

	
	

}
