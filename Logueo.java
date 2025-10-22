package Estudio;
import java.util.Scanner;
public class Logueo {
	
	public static void main(String[] args) {
		Scanner Logueo = new Scanner (System.in);
		
		String nombre;
		int edad;
		boolean credenciales;
		char tipoUsuario;
		
		System.out.print("Nombre: ");
		nombre = Logueo.next();
		System.out.print("Edad: ");
		edad = Logueo.nextInt();
		System.out.print("¿Tienes credenciales activas? (true/false): ");
		credenciales = Logueo.nextBoolean();
		System.out.print("Tpo de Usuario (A/P/E): ");
		tipoUsuario = Logueo.next().charAt(0);
		
		
		
		String acceso = (credenciales  && edad >=  18 ) ? "Acceso Permitido" :
						(credenciales && edad < 18) ? "Restringido por edad" : 
						 "Acceso Denegado";
						System.out.println(acceso);
	
		
		switch(tipoUsuario) {
		case 'A':
			System.out.println("Panel de Administracion;");
			break;
		case 'B':
			System.out.println("Acceso a clases y recursos");
			break;
		case 'E':
			System.out.println("Consulta tus tareas y calificaciones");
			break;
			default:
				System.out.println("Usuario no registrado");
		}
			
	}
	
	

}
