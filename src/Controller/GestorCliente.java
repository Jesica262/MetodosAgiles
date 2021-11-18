package Controller;

public class GestorCliente {
	static private GestorCliente gestor = new GestorCliente();
	 
    private GestorCliente() { }

    static public GestorCliente get() {
        return gestor;
    }

}
