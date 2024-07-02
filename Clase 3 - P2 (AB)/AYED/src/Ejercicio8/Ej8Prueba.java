package Ejercicio8;

import Ejercicio2.BinaryTree;

public class Ej8Prueba {

    public static void main(String[] args) {
        // ÁRBOL 1
    	/*  65
         /       \ 
        37         81
          \          \
           47         93  */
        BinaryTree<Integer> arbol1 = new BinaryTree<Integer>();
        BinaryTree<Integer> hijoDer1 = new BinaryTree<Integer>();
        BinaryTree<Integer> hijoIzq1 = new BinaryTree<Integer>();
        BinaryTree<Integer> hijoIzqDer1 = new BinaryTree<Integer>();
        BinaryTree<Integer> hijoDerDer1 = new BinaryTree<Integer>();

        // Inicializo el árbol asignándole un valor
        arbol1.setData(65);

        // Le agrego los hijos
        hijoDer1.setData(81);
        hijoIzq1.setData(37);
        hijoDerDer1.setData(93);
        hijoIzqDer1.setData(47);

        arbol1.addRightChild(hijoDer1);
        arbol1.addLeftChild(hijoIzq1);
        hijoDer1.addRightChild(hijoDerDer1);
        hijoIzq1.addRightChild(hijoIzqDer1);

        // ÁRBOL 2
        /*	    65
            /       \ 
           37         81
          /  \      /   \
         22   47   76    93  
        /	\		   /	\
       11    29       86     94*/
        BinaryTree<Integer> arbol2 = new BinaryTree<Integer>();
        BinaryTree<Integer> hijoIzq2 = new BinaryTree<Integer>();
        BinaryTree<Integer> hijoDer2 = new BinaryTree<Integer>();
        BinaryTree<Integer> hijoDerIzq2 = new BinaryTree<Integer>();
        BinaryTree<Integer> hijoDerDer2 = new BinaryTree<Integer>();
        BinaryTree<Integer> hijoIzqDer2 = new BinaryTree<Integer>();
        BinaryTree<Integer> hijoIzqIzq2 = new BinaryTree<Integer>();
        BinaryTree<Integer> hijoDerDerDer2 = new BinaryTree<Integer>();
        BinaryTree<Integer> hijoDerDerIzq2 = new BinaryTree<Integer>();
        BinaryTree<Integer> hijoIzqIzqDer2 = new BinaryTree<Integer>();
        BinaryTree<Integer> hijoIzqIzqIzq2 = new BinaryTree<Integer>();

        // Inicializo el árbol asignándole un valor
        arbol2.setData(65);

        // Le agrego los hijos
        hijoIzq2.setData(37);
        hijoDer2.setData(81);
        hijoDerIzq2.setData(76);
        hijoDerDer2.setData(93);
        hijoIzqDer2.setData(47);
        hijoIzqIzq2.setData(22);
        hijoIzqIzqDer2.setData(29);
        hijoIzqIzqIzq2.setData(11);
        hijoDerDerDer2.setData(94);
        hijoDerDerIzq2.setData(85);
        
        arbol2.addLeftChild(hijoIzq2);
        arbol2.addRightChild(hijoDer2);
        hijoIzq2.addLeftChild(hijoIzqIzq2);
        hijoDer2.addLeftChild(hijoDerIzq2);
        hijoDer2.addRightChild(hijoDerDer2);
        hijoIzqIzq2.addRightChild(hijoIzqIzqDer2);
        hijoIzqIzq2.addLeftChild(hijoIzqIzqIzq2);
        hijoDerDer2.addRightChild(hijoDerDerDer2);
        hijoDerDer2.addLeftChild(hijoDerDerIzq2);

        System.out.println(ParcialArboles.esPrefijo(arbol1, arbol2));
    }
}
