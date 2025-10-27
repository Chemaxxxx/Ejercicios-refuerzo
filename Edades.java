package Estudio;
import java.util.Scanner;
public class Edades {
	public static void main(String[] args) {
		
		String nombre;
		int edad;
		
		
		Scanner Edades = new Scanner(System.in);
		
		
		System.out.print("Introduce tu nombre");
		nombre = Edades.next();
		System.out.print("Introduce una edad:");
		edad = Edades.nextInt();
		
		String  rango = (edad < 13) ? "Eres un niño/a":
						(edad >= 13 && edad < 18) ? "Eres un adolescente":
						(edad >= 18 && edad < 65 ) ?  "Eres un adulto":
						(edad > 65) ? "Eres una persona mayor":
							" ";			
						System.out.println(rango);
			
		
		
		}
		
		
	}


