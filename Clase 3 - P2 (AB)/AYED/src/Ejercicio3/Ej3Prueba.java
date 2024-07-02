package Ejercicio3;

import java.util.LinkedList;
import java.util.List;

import Ejercicio2.BinaryTree;

public class Ej3Prueba {

	public static void main(String[] args) {
		/*	  1
	       /    \
	      2      3
	     / \    /
	    6   5  4      */
		//Creo un arbol nuevo
		BinaryTree<Integer> arbol=new BinaryTree<Integer>();
		BinaryTree<Integer> hijoIzq=new BinaryTree<Integer>();
		BinaryTree<Integer> hijoDer=new BinaryTree<Integer>();
		BinaryTree<Integer> hijoDerIzq=new BinaryTree<Integer>();
		BinaryTree<Integer> hijoIzqDer=new BinaryTree<Integer>();
		BinaryTree<Integer> hijoIzqIzq=new BinaryTree<Integer>();
		
		//Inicializo el arbol asignandole un valor
		arbol.setData(1);
		
		//Le agrego los hijos
		hijoIzq.setData(2);
		hijoDer.setData(3);
		hijoDerIzq.setData(4);
		hijoIzqDer.setData(5);
		hijoIzqIzq.setData(6);
		arbol.addLeftChild(hijoIzq);
		arbol.addRightChild(hijoDer);
		hijoIzq.addLeftChild(hijoIzqIzq);
		hijoIzq.addRightChild(hijoIzqDer);
		hijoDer.addLeftChild(hijoDerIzq);
		
		//Nodos pares del arbol, los metos en la Lista
		ContadorArbol contArb = new ContadorArbol(arbol);
		List<Integer> listaPar = new LinkedList<Integer>();
		listaPar = contArb.numerosParesPost();
				
		//Leo lista
		int i = 0;
		while (!listaPar.isEmpty()) {
			System.out.print("N°" + i++ + ": " + listaPar.remove(0)+"  ");
		}
	}
}
