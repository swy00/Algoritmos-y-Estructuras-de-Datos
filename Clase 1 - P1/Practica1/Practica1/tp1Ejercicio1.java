package Practica1;

public class tp1Ejercicio1 {

	public static void main(String[] args) {
		int a = 10;
		int b = 15;

		//IMPRIMIR NUMEROS COMPRENDIDOS ENTRE A y B
		//Con un --FOR--
		System.out.println("Impresión con FOR:");
		iterar.conFor(a,b);
		//Con --WHILE--
		System.out.println("Impresión con WHILE:");
		iterar.conWhile(a, b);
		//SIN estructuras de control
		System.out.println("Impresion SIN estructuras de control:");
		iterar.sinEstructuras(a, b);
	}
}
