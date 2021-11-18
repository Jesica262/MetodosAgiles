package Controller;

public class GestorInmueble {
	static private GestorInmueble gestor = new GestorInmueble();
	 
    private GestorInmueble() { }

    static public GestorInmueble get() {
        return gestor;
    }

}
