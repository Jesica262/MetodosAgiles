package Dao;

import java.util.List;

import Class.Cliente;
import Class.Inmueble;

public interface InmuebleDao {

	public Boolean guardarInmueble(Inmueble i) throws Exception;

	public Boolean eliminarInmueble(Inmueble i) throws Exception;

	public Boolean actualizarInmueble(Inmueble i) throws Exception;
	
	public List<Inmueble> buscarTodos(String s) throws Exception;
	
	public Inmueble buscarPorCodigo(String nombre)throws Exception;

}
