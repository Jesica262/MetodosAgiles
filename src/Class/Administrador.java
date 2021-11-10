package Class;

public class Administrador {
	
	private String nombre;
	private Integer id;

	public Administrador() {}
	
	public Administrador(String nombre) {
		
		super();
		this.nombre = nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
