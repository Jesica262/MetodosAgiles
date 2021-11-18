package Controller;

public class GestorVendedor {
	static private GestorVendedor gestor = new GestorVendedor();
	 
    private GestorVendedor() { }

    static public GestorVendedor get() {
        return gestor;
    }

}
