package Practica1;

public class tp1Ejercicio5 {
	//Devuelve maximo minimo y promedio mediante un return, meto lo pedido en un arreglo
	
	public static int[] mecanismoA(int[] a) {
		int max = -1;
		int min = 9999;
		int suma=0;
		//Recorro el arreglo, asigno el maximo, minimo y hago la suma para poder sacar el promedio
		for (int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
			if(a[i]<min) {
				min=a[i];
			}
			suma+=a[i];
		}
		int promedio= (suma/a.length);
		return new int[] {max,min,promedio};
	}
	
	public static void mecanismoB(int [] a,int [] vectorDevolver) {
		//Para no estar repitiendo codigo, uso lo implementado en mecanismoA.
		int[] resultados = mecanismoA(a);
		
		vectorDevolver[0]=resultados[0];
		vectorDevolver[1]=resultados[1];
		vectorDevolver[2]=resultados[2];
	}
	
	public static void mecanismoC(int [] a) {
		int[] resultados = mecanismoA(a);
		
		System.out.println("Resultado inciso C:");
        System.out.println("Máximo: " + resultados[0] + " Mínimo: " + resultados[1] + " Promedio: " + resultados[2]);
	}
	
	public static void main(String[] args) {
		int arreglo1[]= {5,30,40,50,60,66,33,22,11};
		
		//Envio el arreglo y me retorna otro arreglo con el maximo, minimo y promedio.
		int[] incisoA = mecanismoA(arreglo1);
		System.out.println("Resultado inciso A:");
        System.out.println("Máximo: " + incisoA[0]+ " Mínimo: " + incisoA[1]+ " Promedio: " + incisoA[2]);
        System.out.println();
        
        //Envio el arreglo y me devuelve un vector con el maximo, minimo y promedio.
        int arreglo2[]= {0,30,40,100,60};
        int[] vector = new int[3];
        mecanismoB(arreglo2,vector);
        System.out.println("Resultado inciso B:");
        System.out.println("Máximo: " + vector[0]+ " Mínimo: " + vector[1]+ " Promedio: " + vector[2]);
        System.out.println();
        
        //Envio el arreglo y me devuelve impreso los resultados sin tener que recibir nada en el programa main
        int arreglo3[]= {77,88,66,33,22,11};
        mecanismoC(arreglo3);
	}
}
