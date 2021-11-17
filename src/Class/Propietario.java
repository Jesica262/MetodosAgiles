package Class;

public class Propietario {

	private Integer idPropietario;
	private String nombre;
	private String apellido;
	private String tipoDocumento; //ver si conviene enum
	private long numeroDocumento;
	private String calle;
	private Integer numeroCalle;
	private String localidad; //ver si conviene enum
	private String provincia; //ver si conviene enum
	private long telefono; // yo lo pondria como String
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

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public Integer getNumeroCalle() {
		return numeroCalle;
	}

	public void setNumeroCalle(Integer numeroCalle) {
		this.numeroCalle = numeroCalle;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}

	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
