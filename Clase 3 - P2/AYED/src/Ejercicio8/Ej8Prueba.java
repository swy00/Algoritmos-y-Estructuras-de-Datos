package Ejercicio8;

import Ejercicio2.BinaryTree;

public class Ej8Prueba {

	public static void main(String[] args) {
		//ARBOL 1
		/*	  1
	       /    \
	      2      3
	           /  
	         4      */
		BinaryTree<Integer> arbol1=new BinaryTree<Integer>();
		BinaryTree<Integer> hijoIzq1=new BinaryTree<Integer>();
		BinaryTree<Integer> hijoDer1=new BinaryTree<Integer>();
		BinaryTree<Integer> hijoDerIzq1=new BinaryTree<Integer>();
		//Inicializo el arbol asignandole un valor
		arbol1.setData(1);
				
		//Le agrego los hijos
		hijoIzq1.setData(2);
		hijoDer1.setData(3);
		hijoDerIzq1.setData(4);
		
		//ARBOL 2
		/*	  1
	       /    \
	      2      3
	     / \    /  \
	    6   5  4    10  */
		BinaryTree<Integer> arbol2=new BinaryTree<Integer>();
		BinaryTree<Integer> hijoIzq2=new BinaryTree<Integer>();
		BinaryTree<Integer> hijoDer2=new BinaryTree<Integer>();
		BinaryTree<Integer> hijoDerIzq2=new BinaryTree<Integer>();
		BinaryTree<Integer> hijoDerDer2=new BinaryTree<Integer>();
		BinaryTree<Integer> hijoIzqDer2=new BinaryTree<Integer>();
		BinaryTree<Integer> hijoIzqIzq2=new BinaryTree<Integer>();
		
		//Inicializo el arbol asignandole un valor
		arbol2.setData(1);
		
		//Le agrego los hijos
		hijoIzq2.setData(2);
		hijoDer2.setData(3);
		hijoDerIzq2.setData(4);
		hijoDerDer2.setData(10);
		hijoIzqDer2.setData(5);
		hijoIzqIzq2.setData(6);
		arbol2.addLeftChild(hijoIzq2);
		arbol2.addRightChild(hijoDer2);
		hijoIzq2.addLeftChild(hijoIzqIzq2);
		hijoIzq2.addRightChild(hijoIzqDer2);
		hijoDer2.addLeftChild(hijoDerIzq2);
		hijoDer2.addRightChild(hijoDerDer2);

		
		System.out.println(ParcialArboles.esPrefijo(arbol1, arbol2));
	}

}
