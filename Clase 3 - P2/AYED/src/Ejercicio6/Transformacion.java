package Ejercicio6;

import Ejercicio2.BinaryTree;

public class Transformacion {
	private BinaryTree<Integer> arbol;

	public Transformacion(BinaryTree<Integer> arbol) {
		this.arbol = arbol;
	}
	
	public BinaryTree<Integer> suma(){
		
		if (!this.arbol.isEmpty()) {
			hacerTransformacion(arbol);
		}	
		return arbol;
	}

	public int hacerTransformacion(BinaryTree<Integer> arb) {
		
		int suma = 0;  
        
        if (arb.hasLeftChild()) {
            suma += hacerTransformacion(arb.getLeftChild());
        }
        if (arb.hasRightChild()) {
            suma += hacerTransformacion(arb.getRightChild());
        }
        // Actualizar valor del nodo actual en el árbol original
        if (!arb.isLeaf()) {
            int valorViejo = arb.getData();
            arb.setData(suma + valorViejo);
            return suma + valorViejo;
        } else {
            // Si es una hoja, simplemente devolvemos su valor
            return arb.getData();
        }
	}
}
