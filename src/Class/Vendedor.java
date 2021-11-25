package Class;

public class Vendedor {

	public Vendedor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vendedor(Integer idVendedor, String nombre, String apellido, long dni, String usuario, String clave,
			String email, Boolean eliminado) {
		super();
		this.idVendedor = idVendedor;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.usuario = usuario;
		this.clave = clave;
		this.email = email;
		this.eliminado = eliminado;
	}

	private Integer idVendedor;
	private String nombre;
	private String apellido;
	private long dni;
	private String usuario;
	private String clave;
	private String email;
	private Boolean eliminado;
	
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public void setIdVendedor(Integer idVendedor) {
		this.idVendedor = idVendedor;
	}

	public void setEliminado(Boolean eliminado) {
		this.eliminado = eliminado;
	}

	public Integer getIdVendedor() {
		return idVendedor;
	}

	public Boolean getEliminado() {
		return eliminado;
	}
	 @Override
	 public String toString() {
		 return apellido+" "+nombre+" "+dni;
	 }

}
