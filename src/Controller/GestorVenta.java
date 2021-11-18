package Controller;

public class GestorVenta {
	static private GestorVenta gestor = new GestorVenta();
	 
    private GestorVenta() { }

    static public GestorVenta get() {
        return gestor;
    }


}
