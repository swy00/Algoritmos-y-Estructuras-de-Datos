package Ejercicio9;

import Ejercicio2.BinaryTree;

public class ParcialArboles {
	
	private BinaryTree<sumAndDif> arbolSumDif(BinaryTree<Integer> arbol, int sumAcum, int valorPadre) {
		
		BinaryTree<sumAndDif> retorno = new BinaryTree<sumAndDif>();
		int valorArbol = arbol.getData();
		
		//Recorrido pre-orden
		sumAndDif sd = new sumAndDif(valorArbol + sumAcum, valorArbol - valorPadre);
		retorno.setData(sd);
		
		if (arbol.hasLeftChild()) {
			retorno.addLeftChild(arbolSumDif(arbol.getLeftChild(), valorArbol + sumAcum, valorArbol));
			}
		if (arbol.hasRightChild()) {
			retorno.addRightChild(arbolSumDif(arbol.getRightChild(), valorArbol + sumAcum, valorArbol));
			}
		
		return retorno;
	}
	
	public BinaryTree<sumAndDif> sumAndDif(BinaryTree<Integer> arbol) {
		BinaryTree<sumAndDif> nuevoArbol = null;
		
		if (!arbol.isEmpty()) {
			nuevoArbol = arbolSumDif(arbol, 0, 0);
			}
		
		return nuevoArbol;
	}
	
	public static void main(String[] args) {
		//Crear un arbol
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
		
		ParcialArboles parcialArb = new ParcialArboles();
		BinaryTree<sumAndDif> arbolCompuesto = parcialArb.sumAndDif(arbol2);
	}
}
