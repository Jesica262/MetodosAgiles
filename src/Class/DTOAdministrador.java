package Class;

public class DTOAdministrador {
	
	private String usuario;
	private Integer idAdministrador;
	private String clave;
	private Boolean eliminado;

	public DTOAdministrador(String usuarioAdmin, String contraseniaAdmin) {
		// TODO Auto-generated constructor stub
		usuario= usuarioAdmin;
		clave=contraseniaAdmin;
		eliminado=false;
		
	}
	public DTOAdministrador(Integer idAdministrador, String usuario, String clave, Boolean eliminado) {
		super();
		this.usuario = usuario;
		this.idAdministrador = idAdministrador;
		this.clave = clave;
		this.eliminado = eliminado;
	}
	public DTOAdministrador() {
		// TODO Auto-generated constructor stub
		
	}
	public String getUsuario() {
		return usuario;
	}
	


}
