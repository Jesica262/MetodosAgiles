package Class;

import java.time.LocalDate;

public class Inmueble {

	
	private Integer codigo;
	private LocalDate fechaCarga;
	private String estado; // ver si conviene enum
	private String provincia; //ver si conviene enum
	private String localidad;
	private String calle; //ver esto en la historia
	private Integer numeroCalle; //ver esto en la historia
	private String pisoDepartamento;
	private String barrio;
	private String tipoInmueble;//ver en la historia
	private Float precioVenta;
	private String orientacion;
	private Float frente;
	private Float fondo;
	private Float superficieTerreno;
	private Boolean propiedadHorizontal;
	private Float superficieEdificada;
	private Integer antiguedad;
	private Integer dormitorios;
	private Integer baños;
	private Boolean garageCochera;
	private Boolean patio;
	private Boolean piscina;
	private Boolean aguaCorriente;
	private Boolean cloacas;
	private Boolean gasNatural;
	private Boolean aguaCaliente;
	private Boolean telefono;
	private Boolean lavadero;
	private Boolean pavimento;
	private String observaciones;
	private Boolean eliminado;
	private Boolean reservado;
	private Boolean vendido;
	private Propietario propietario;
	
	public Inmueble(Integer codigo, LocalDate fechaCarga, String estado, String provincia, String calle,
			Integer numeroCalle, String pisoDepartamento, String barrio, String tipoInmueble, Float precioVenta,
			String orientacion, Float frente, Float fondo, Float superficieTerreno, Boolean propiedadHorizontal,
			Float superficieEdificada, Integer antiguedad, Integer dormitorios, Integer baños, Boolean garageCochera,
			Boolean patio, Boolean piscina, Boolean aguaCorriente, Boolean cloacas, Boolean gasNatural,
			Boolean aguaCaliente, Boolean telefono, Boolean lavadero, Boolean pavimento, String observaciones,
			Boolean eliminado, Boolean reservado, Boolean vendido, Propietario propietario) {
		super();
		this.codigo = codigo;
		this.fechaCarga = fechaCarga;
		this.estado = estado;
		this.provincia = provincia;
		this.calle = calle;
		this.numeroCalle = numeroCalle;
		this.pisoDepartamento = pisoDepartamento;
		this.barrio = barrio;
		this.tipoInmueble = tipoInmueble;
		this.precioVenta = precioVenta;
		this.orientacion = orientacion;
		this.frente = frente;
		this.fondo = fondo;
		this.superficieTerreno = superficieTerreno;
		this.propiedadHorizontal = propiedadHorizontal;
		this.superficieEdificada = superficieEdificada;
		this.antiguedad = antiguedad;
		this.dormitorios = dormitorios;
		this.baños = baños;
		this.garageCochera = garageCochera;
		this.patio = patio;
		this.piscina = piscina;
		this.aguaCorriente = aguaCorriente;
		this.cloacas = cloacas;
		this.gasNatural = gasNatural;
		this.aguaCaliente = aguaCaliente;
		this.telefono = telefono;
		this.lavadero = lavadero;
		this.pavimento = pavimento;
		this.observaciones = observaciones;
		this.eliminado = eliminado;
		this.reservado = reservado;
		this.vendido = vendido;
		this.propietario = propietario;
	}
	
	

	public Inmueble(LocalDate fechaCarga, String estado, String provincia, String calle, Integer numeroCalle,
			String pisoDepartamento, String barrio, String tipoInmueble, Float precioVenta, String orientacion,
			Float frente, Float fondo, Float superficieTerreno, Boolean propiedadHorizontal, Float superficieEdificada,
			Integer antiguedad, Integer dormitorios, Integer baños, Boolean garageCochera, Boolean patio,
			Boolean piscina, Boolean aguaCorriente, Boolean cloacas, Boolean gasNatural, Boolean aguaCaliente,
			Boolean telefono, Boolean lavadero, Boolean pavimento, String observaciones, Boolean eliminado,
			Boolean reservado, Boolean vendido, Propietario propietario) {
		super();
		this.fechaCarga = fechaCarga;
		this.estado = estado;
		this.provincia = provincia;
		this.calle = calle;
		this.numeroCalle = numeroCalle;
		this.pisoDepartamento = pisoDepartamento;
		this.barrio = barrio;
		this.tipoInmueble = tipoInmueble;
		this.precioVenta = precioVenta;
		this.orientacion = orientacion;
		this.frente = frente;
		this.fondo = fondo;
		this.superficieTerreno = superficieTerreno;
		this.propiedadHorizontal = propiedadHorizontal;
		this.superficieEdificada = superficieEdificada;
		this.antiguedad = antiguedad;
		this.dormitorios = dormitorios;
		this.baños = baños;
		this.garageCochera = garageCochera;
		this.patio = patio;
		this.piscina = piscina;
		this.aguaCorriente = aguaCorriente;
		this.cloacas = cloacas;
		this.gasNatural = gasNatural;
		this.aguaCaliente = aguaCaliente;
		this.telefono = telefono;
		this.lavadero = lavadero;
		this.pavimento = pavimento;
		this.observaciones = observaciones;
		this.eliminado = eliminado;
		this.reservado = reservado;
		this.vendido = vendido;
		this.propietario = propietario;
	}



	public Inmueble() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Integer getCodigo() {
		return codigo;
	}



	public LocalDate getFechaCarga() {
		return fechaCarga;
	}



	public String getEstado() {
		return estado;
	}



	public String getProvincia() {
		return provincia;
	}



	public String getCalle() {
		return calle;
	}



	public Integer getNumeroCalle() {
		return numeroCalle;
	}



	public String getPisoDepartamento() {
		return pisoDepartamento;
	}



	public String getBarrio() {
		return barrio;
	}



	public String getTipoInmueble() {
		return tipoInmueble;
	}



	public Float getPrecioVenta() {
		return precioVenta;
	}



	public String getOrientacion() {
		return orientacion;
	}



	public Float getFrente() {
		return frente;
	}



	public Float getFondo() {
		return fondo;
	}



	public Float getSuperficieTerreno() {
		return superficieTerreno;
	}



	public Boolean getPropiedadHorizontal() {
		return propiedadHorizontal;
	}



	public Float getSuperficieEdificada() {
		return superficieEdificada;
	}



	public Integer getAntiguedad() {
		return antiguedad;
	}



	public Integer getDormitorios() {
		return dormitorios;
	}



	public Integer getBaños() {
		return baños;
	}



	public Boolean getGarageCochera() {
		return garageCochera;
	}



	public Boolean getPatio() {
		return patio;
	}



	public Boolean getPiscina() {
		return piscina;
	}



	public Boolean getAguaCorriente() {
		return aguaCorriente;
	}



	public Boolean getCloacas() {
		return cloacas;
	}



	public Boolean getGasNatural() {
		return gasNatural;
	}



	public Boolean getAguaCaliente() {
		return aguaCaliente;
	}



	public Boolean getTelefono() {
		return telefono;
	}



	public Boolean getLavadero() {
		return lavadero;
	}



	public Boolean getPavimento() {
		return pavimento;
	}



	public String getObservaciones() {
		return observaciones;
	}



	public Boolean getEliminado() {
		return eliminado;
	}



	public Boolean getReservado() {
		return reservado;
	}



	public Boolean getVendido() {
		return vendido;
	}



	public Propietario getPropietario() {
		return propietario;
	}



	public String getLocalidad() {
		return localidad;
	}
	
	

	
}
