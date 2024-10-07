/**
 * Rubén Bernal Ramos, CSI1
 */

package controladores;

import java.util.Scanner;

/**
 * Clase controladora de la aplicación
 * rbr - 071024
 */
public class Inicio {

	/**
	 * Método de entrada de la aplicación
	 * rbr - 071024
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Variable
		int numeroDia;
		
		//Variable Scanner
		Scanner sc = new Scanner(System.in);
		
		//Pido al usuario que introduzca un número del 1 al 7
		System.out.println("Introduzca un número entero del 1 al 7: ");
		numeroDia = sc.nextInt();
		
		//Controlo si el número introducido es correcto
		if(numeroDia >= 1 && numeroDia <=7) {
			//Se ha verificado que el numero está dentro del rango correcto
			//Ahora muestro el dia de la semana dependiendo del número introducido
			if(numeroDia == 1) {
				System.out.println("Lunes");
			}else if(numeroDia == 2) {
				System.out.println("Martes");
			}else if(numeroDia == 3) {
				System.out.println("Miércoles");
			}else if(numeroDia == 4) {
				System.out.println("Jueves");
			}else if(numeroDia == 5) {
				System.out.println("Viernes");
			}else if(numeroDia == 6) {
				System.out.println("Sábado");
			}else if(numeroDia == 7) {
				System.out.println("Domingo");
			}
		}else {
			//Se ha verificado que el número introducido no está dentro del rango correcto
			System.err.println("El número introducido no está entre 1 y 7");
		}

	}

}