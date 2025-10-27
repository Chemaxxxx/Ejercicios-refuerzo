package Estudio;
import java.util.Scanner;
public class Suma {
	public static void main(String[] args) {
		int numero;
		
		Scanner Suma = new Scanner(System.in);
		System.out.print("Introduce un numero:");
		numero = Suma.nextInt();
		
		int i = 0;
		while(numero >= 0) {
			
			if(numero > 0) {
				i += numero;
				System.out.print("Introduce otro numero:");
				numero = Suma.nextInt();
		
}
		}
		
		System.out.println("La suma total es: " + i);
	}
}
