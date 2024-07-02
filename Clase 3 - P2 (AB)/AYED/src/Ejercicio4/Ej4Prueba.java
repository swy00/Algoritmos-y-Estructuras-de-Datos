package Ejercicio4;

import Ejercicio2.BinaryTree;

public class Ej4Prueba {

	public static void main(String[] args) {
		//Creo un arbol nuevo
		/*	  1
	       /    \
	      2      3
	     / \    /  \
	    6   5  4    10  */
		BinaryTree<Integer> arbol=new BinaryTree<Integer>();
		BinaryTree<Integer> hijoIzq=new BinaryTree<Integer>();
		BinaryTree<Integer> hijoDer=new BinaryTree<Integer>();
		BinaryTree<Integer> hijoDerIzq=new BinaryTree<Integer>();
		BinaryTree<Integer> hijoDerDer=new BinaryTree<Integer>();
		BinaryTree<Integer> hijoIzqDer=new BinaryTree<Integer>();
		BinaryTree<Integer> hijoIzqIzq=new BinaryTree<Integer>();
		
		//Inicializo el arbol asignandole un valor
		arbol.setData(1);
		
		//Le agrego los hijos
		hijoIzq.setData(2);
		hijoDer.setData(3);
		hijoDerIzq.setData(4);
		hijoDerDer.setData(10);
		hijoIzqDer.setData(5);
		hijoIzqIzq.setData(6);
		arbol.addLeftChild(hijoIzq);
		arbol.addRightChild(hijoDer);
		hijoIzq.addLeftChild(hijoIzqIzq);
		hijoIzq.addRightChild(hijoIzqDer);
		hijoDer.addLeftChild(hijoDerIzq);
		hijoDer.addRightChild(hijoDerDer);
		
		
		RedBinariaLlena redBin=new RedBinariaLlena(arbol);
		System.out.println(redBin.retardoReenvio());

	}
}
