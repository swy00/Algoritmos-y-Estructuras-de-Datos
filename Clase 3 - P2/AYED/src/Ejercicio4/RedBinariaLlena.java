package Ejercicio4;

import Ejercicio2.BinaryTree;

public class RedBinariaLlena {

	private BinaryTree<Integer> arbol;
	
	public RedBinariaLlena(BinaryTree<Integer> arbol) {
		this.arbol = arbol;
	}

	public int retardoReenvio() {
		int retardo=0;
		
		if(!this.arbol.isEmpty()) {
			retardo=calculoRetardo(this.arbol);
			
		}
		
		return retardo;
	}

	private int calculoRetardo(BinaryTree<Integer> arbol) {
		//Recorro por niveles
		int arbIzq=0;
		int arbDer=0;
		
		if(arbol.hasLeftChild()) {
			arbIzq=calculoRetardo(arbol.getLeftChild());
		}
		if(arbol.hasRightChild()) {
			arbDer=calculoRetardo(arbol.getRightChild());
		}
		//Veo cual de los 2 hijos de la raiz tuvo el mayor retardo
		int max = Math.max(arbIzq, arbDer);
		
		return arbol.getData() + max;
	}
	
	
	
	
}
