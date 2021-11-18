package Controller;

public class GestorPropietario {
	static private GestorPropietario gestor = new GestorPropietario();
	 
    private GestorPropietario() { }

    static public GestorPropietario get() {
        return gestor;
    }

}
