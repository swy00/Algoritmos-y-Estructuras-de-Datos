package Ejercicio8;

import Ejercicio2.BinaryTree;

public class ParcialArboles {
	
	 public static boolean esPrefijo (BinaryTree<Integer> arbol1, BinaryTree<Integer> arbol2) {
		 if (arbol1.isEmpty()) {
			 return true;
		 } else {
			 if (arbol2.isEmpty()) {
				 return false;
			 } else {
				 boolean x=verificacion(arbol1, arbol2);
				 return x;
			 	}
		}
	 }
	 
	 private static boolean verificacion (BinaryTree<Integer> arbol1, BinaryTree<Integer> arbol2) {
		 
		 if (arbol1.isLeaf()) {
			 if (arbol1.getData() != arbol2.getData()) {
				 return false;
			 } else {
				 return true;
			 }
		 } else {
			 
			 if (arbol1.getData() != arbol2.getData()) {
				 return false;
			 } else {
				 boolean aux = true;
				 if (arbol1.hasLeftChild() && arbol2.hasLeftChild()) {
					 aux = (aux && esPrefijo(arbol1.getLeftChild(), arbol2.getLeftChild()));
				 } else if (arbol1.hasLeftChild()) {
					 return false;
				 }
				 if (arbol1.hasRightChild() && arbol2.hasRightChild() && aux) {
					 aux = (aux && esPrefijo(arbol1.getRightChild(), arbol2.getRightChild()));
				 } else if (arbol1.hasRightChild()) {
					 return false;
				 }
				 return (((arbol1.isEmpty() && arbol2.isEmpty()) || (arbol1.getData() == arbol2.getData()))
						 && esPrefijo(arbol1.getLeftChild(),arbol2.getLeftChild())
						 && esPrefijo(arbol1.getRightChild(),arbol2.getRightChild()));
			 }
		 }
	 }
}
