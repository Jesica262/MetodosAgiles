package Controller;

public class GestorReserva {
	static private GestorReserva gestor = new GestorReserva();
	 
    private GestorReserva() { }

    static public GestorReserva get() {
        return gestor;
    }

}
