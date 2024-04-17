package Ejercicio5;

import Ejercicio2.BinaryTree;
import Ejercicio2.Queue;

public class ProfundidadDeArbolBinario {

	private BinaryTree<Integer> arbol;

	public ProfundidadDeArbolBinario(BinaryTree<Integer> arbol) {
		this.arbol = arbol;
	}
	
	public int sumaElementosProfundidad(int p) {
		
		BinaryTree<Integer> arbolAuxiliar = null;
		Queue<BinaryTree<Integer>> cola = new Queue<BinaryTree<Integer>>();
		int suma=0;
		int nivel = 0;
		cola.enqueue(arbol);
		cola.enqueue(null);
		
		while (!cola.isEmpty() && (nivel <= p)) {
			arbolAuxiliar = cola.dequeue();
			
			//Si ArbolAuxiliar apunta a algo, significa que ya pase de nivel y tengo que procesar el valor de los hijos
			if (arbolAuxiliar != null) {
				//Imprimir nodo si (nivel >= n) y (nivel <= m)
				if (nivel == p ) {
					suma+=(arbolAuxiliar.getData());
				}
				//Si el nodo tiene hijos, los encolo
				if (arbolAuxiliar.hasLeftChild()) {
					cola.enqueue(arbolAuxiliar.getLeftChild());
				}
				if (arbolAuxiliar.hasRightChild()) {
					cola.enqueue(arbolAuxiliar.getRightChild());
				}
			} else if (!cola.isEmpty()) {   //Cuando llego al NULL, significando que termine el nivel, aumento al proximo y encolo otro NULL
				nivel++;
				cola.enqueue(null);
			}
		}
		
		return suma;
	}
	
	
}
