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
	@Override
	public String toString() {
		return calle + " " + numeroCalle;
	}



	private Float precioVenta;
	private String orientacion;
	private Float frente;
	private Float fondo;
	private Float superficieTerreno;
	private String propiedadHorizontal;
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
			String orientacion, Float frente, Float fondo, Float superficieTerreno, String propiedadHorizontal,
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
			Float frente, Float fondo, Float superficieTerreno, String propiedadHorizontal, Float superficieEdificada,
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



	public String getPropiedadHorizontal() {
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



	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}



	public void setFechaCarga(LocalDate fechaCarga) {
		this.fechaCarga = fechaCarga;
	}



	public void setEstado(String estado) {
		this.estado = estado;
	}



	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}



	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}



	public void setCalle(String calle) {
		this.calle = calle;
	}



	public void setNumeroCalle(Integer numeroCalle) {
		this.numeroCalle = numeroCalle;
	}



	public void setPisoDepartamento(String pisoDepartamento) {
		this.pisoDepartamento = pisoDepartamento;
	}



	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}



	public void setTipoInmueble(String tipoInmueble) {
		this.tipoInmueble = tipoInmueble;
	}



	public void setPrecioVenta(Float precioVenta) {
		this.precioVenta = precioVenta;
	}



	public void setOrientacion(String orientacion) {
		this.orientacion = orientacion;
	}



	public void setFrente(Float frente) {
		this.frente = frente;
	}



	public void setFondo(Float fondo) {
		this.fondo = fondo;
	}



	public void setSuperficieTerreno(Float superficieTerreno) {
		this.superficieTerreno = superficieTerreno;
	}



	public void setPropiedadHorizontal(String string) {
		this.propiedadHorizontal = string;
	}



	public void setSuperficieEdificada(Float superficieEdificada) {
		this.superficieEdificada = superficieEdificada;
	}



	public void setAntiguedad(Integer antiguedad) {
		this.antiguedad = antiguedad;
	}



	public void setDormitorios(Integer dormitorios) {
		this.dormitorios = dormitorios;
	}



	public void setBaños(Integer baños) {
		this.baños = baños;
	}



	public void setGarageCochera(Boolean garageCochera) {
		this.garageCochera = garageCochera;
	}



	public void setPatio(Boolean patio) {
		this.patio = patio;
	}



	public void setPiscina(Boolean piscina) {
		this.piscina = piscina;
	}



	public void setAguaCorriente(Boolean aguaCorriente) {
		this.aguaCorriente = aguaCorriente;
	}



	public void setCloacas(Boolean cloacas) {
		this.cloacas = cloacas;
	}



	public void setGasNatural(Boolean gasNatural) {
		this.gasNatural = gasNatural;
	}



	public void setAguaCaliente(Boolean aguaCaliente) {
		this.aguaCaliente = aguaCaliente;
	}



	public void setTelefono(Boolean telefono) {
		this.telefono = telefono;
	}



	public void setLavadero(Boolean lavadero) {
		this.lavadero = lavadero;
	}



	public void setPavimento(Boolean pavimento) {
		this.pavimento = pavimento;
	}



	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}



	public void setEliminado(Boolean eliminado) {
		this.eliminado = eliminado;
	}



	public void setReservado(Boolean reservado) {
		this.reservado = reservado;
	}



	public void setVendido(Boolean vendido) {
		this.vendido = vendido;
	}



	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}
		
}
