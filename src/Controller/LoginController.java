package Controller;

public class LoginController {

	
	public boolean validacionVacios(String usuario, String contrasenia) {
		if(usuario.isEmpty()) { 
			System.out.println("El campo de usuario se encuentra vac�o"); 
			return false;
		}
		if(contrasenia.isEmpty()) {
			System.out.println("El campo de contrase�a se encuentra vac�o"); 
			return false;
		}
		return true;
	}
}
