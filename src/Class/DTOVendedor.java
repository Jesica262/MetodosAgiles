package Class;

public class DTOVendedor {


	private Integer idVendedor;
	private String nombre;
	private String apellido;
	private long dni;
	private String usuario;
	private String clave;
	private String email;
	private Boolean eliminado;
	

	public DTOVendedor() {
		// TODO Auto-generated constructor stub
	}
	public DTOVendedor(Integer idVendedor, String nombre, String apellido, long dni, String usuario, String clave,
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
	
	 @Override
	 public String toString() {
		 return apellido+" "+nombre+" "+dni;
	 }
}
