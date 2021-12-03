package Dao;

import Class.Inmueble;

public interface InmuebleDao {

	public Boolean guardarInmueble(Inmueble i) throws Exception;

	public Boolean eliminarInmueble(Inmueble i) throws Exception;

	public Boolean actualizarInmueble(Inmueble i) throws Exception;

}
