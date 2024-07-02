package Ejercicio7;

import Ejercicio2.BinaryTree;
import Ejercicio2.Queue;

public class ParcialArboles {

	BinaryTree<Integer> parcialArbol;

	public ParcialArboles(BinaryTree<Integer> arbol) {
		this.parcialArbol = arbol;
	}
	
	public boolean isLeftTree(int num) {
		//Si el árbol de raiz -num- no tiene una rama, considero que en esa rama hay -1 árboles con único hijo
		int arbolesIzq = -1;
		int arbolesDer = -1;
		BinaryTree<Integer> nodoRaiz = encontrarNodo(num);
		
		//si encontrarNodo lo encontró
		if (nodoRaiz != null) {
			if (nodoRaiz.hasLeftChild()) {
				arbolesIzq = cantidadSubArboles(nodoRaiz.getLeftChild());
			}
			if (nodoRaiz.hasRightChild()) {
				arbolesDer = cantidadSubArboles(nodoRaiz.getRightChild());
			}
		}
		
		return (arbolesIzq > arbolesDer);
	}
	
	private BinaryTree<Integer> encontrarNodo(int valorRaiz) {
		
		BinaryTree<Integer> nodoActual = null;
		Queue<BinaryTree<Integer>> cola = new Queue<BinaryTree<Integer>>();
		boolean encontrado = false;
		
		//Recorro por niveles
		cola.enqueue(parcialArbol);
		
		while (!cola.isEmpty() && !encontrado) {
			nodoActual = cola.dequeue();
			if (nodoActual != null) {
				//Si es el nodo que busco
				if (nodoActual.getData() == valorRaiz) {
					encontrado = true;
				} else {
					//Anexo sus hijos si existen
					if (nodoActual.hasLeftChild()) {
						cola.enqueue(nodoActual.getLeftChild());
					}
					if (nodoActual.hasRightChild()) {
						cola.enqueue(nodoActual.getRightChild());
					}
				}
			} else if (!cola.isEmpty()) {
				cola.enqueue(null);
			}
		}
		
		return nodoActual;
	}
	
	private int cantidadSubArboles(BinaryTree<Integer> arb) {
		int cantidad = 0;
		if (!arb.isLeaf()) {
			if (arb.hasLeftChild() && !arb.hasRightChild()) {
				cantidad = 1 + cantidadSubArboles(arb.getLeftChild());
			} else if (!arb.hasLeftChild() && arb.hasRightChild()) {
				cantidad = 1 + cantidadSubArboles(arb.getRightChild());
			} else {
				cantidad += cantidadSubArboles(arb.getLeftChild());
				cantidad += cantidadSubArboles(arb.getRightChild());
			}
		}
		return cantidad;
	}
}
