package Dao;

import java.util.List;

import Class.Vendedor;

public interface VendedorDao {

	List<Vendedor> buscarTodos();
	Boolean guardarVendedor(Vendedor v) throws Exception;
	Boolean actualizarVendedor(Vendedor v) throws Exception;
	Boolean darDeBajaVendedor(Vendedor v) throws Exception;
}
