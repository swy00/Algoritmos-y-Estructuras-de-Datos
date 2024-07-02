package Ejercicio2;

public class Ej2PruebaArbol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	      1
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
		
		arbol.entreNiveles(0, 2);
		
	}

}
