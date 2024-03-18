package Practica1;
import java.util.Scanner;
public class tp1Ejercicio2 {

	public static int[] multiplosEnteros(int n) {
		int k=n;
		int[] arr = new int[n];
		
		for (int i=0;i<k;i++) {
			arr[i]=n*(i+1);
		}	
		return arr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in) ;
		System.out.print("Ingrese un numero:");
		// Necesito transformar el input guardado en s en un INT
		int n = s.nextInt();
		int arreglo[]=multiplosEnteros(n);
		for (int i=0; i<n; i++) {
			System.out.print(arreglo[i]+" ");
		}
	}

}
