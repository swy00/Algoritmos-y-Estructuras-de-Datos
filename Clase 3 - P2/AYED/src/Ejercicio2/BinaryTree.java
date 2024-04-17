package Ejercicio2;


public class BinaryTree <T> {
	
	private T data;
	private BinaryTree<T> leftChild;   
	private BinaryTree<T> rightChild; 

	
	public BinaryTree() {
		super();
	}

	public BinaryTree(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	/**
	 * Preguntar antes de invocar si hasLeftChild()
	 * @return
	 */
	public BinaryTree<T> getLeftChild() {
		return leftChild;
	}
	/**
	 * Preguntar antes de invocar si hasRightChild()
	 * @return
	 */
	public BinaryTree<T> getRightChild() {
		return this.rightChild;
	}

	public void addLeftChild(BinaryTree<T> child) {
		this.leftChild = child;
	}

	public void addRightChild(BinaryTree<T> child) {
		this.rightChild = child;
	}

	public void removeLeftChild() {
		this.leftChild = null;
	}

	public void removeRightChild() {
		this.rightChild = null;
	}

	public boolean isEmpty(){
		return (this.isLeaf() && this.getData() == null);
	}

	public boolean isLeaf() {
		return (!this.hasLeftChild() && !this.hasRightChild());

	}
		
	public boolean hasLeftChild() {
		return this.leftChild!=null;
	}

	public boolean hasRightChild() {
		return this.rightChild!=null;
	}
	@Override
	public String toString() {
		return this.getData().toString();
	}

	public  int contarHojas() {
	   //Cuando un NODO no tiene hijos se considera HOJA
		int cantH=0;
		
		if (this.isLeaf()) {
			cantH = 1;
		}else {
			if(this.hasLeftChild()) {
				cantH+= this.getLeftChild().contarHojas();
			}else if(this.hasRightChild()) {
				cantH+= this.getRightChild().contarHojas();
			}
		}
		return cantH;
	}
		
		
    	 
	public BinaryTree<T> espejo() {
	    BinaryTree<T> espejo = new BinaryTree<>();
	    //Para armar la rama izquierda le paso el nodo derecho, etc
	    espejo.leftChild = crearEspejo(this.rightChild);
	    espejo.rightChild = crearEspejo(this.leftChild);
	    return espejo;
	}
    
    public BinaryTree<T> crearEspejo(BinaryTree<T> t) {
    	
    	//Como voy a llamar la funcion recursivamente, cuando llegue a una hoja que no tenga hijos, retorno null
    	if (t == null) {
    		return null;
    	}
    	//Creo un arbol nuevo copiando el nodo principal
    	BinaryTree<T> espejo=new BinaryTree<T>(this.getData());
    	//Armo recursivamente lo demas
    	espejo.leftChild=crearEspejo(t.getRightChild());
    	espejo.rightChild=crearEspejo(t.getLeftChild());
    	
    	return espejo;
    }

	// 0<=n<=m
    public void entreNiveles(int n, int m){
		
    	BinaryTree<T> arbolAuxiliar = null;
		Queue<BinaryTree<T>> cola = new Queue<BinaryTree<T>>();
		
		int nivel = 0;
		
		//Encolo el nodo de la raiz, y un NULL que me va a servir para ir separando los niveles, cuando llegue a uno en la cola, significa que termine de procesar el nivel.
		cola.enqueue(this);
		cola.enqueue(null);
		
		while (!cola.isEmpty() && (nivel <= m)) {
			arbolAuxiliar = cola.dequeue();
			
			//Si ArbolAuxiliar apunta a algo, significa que ya pase de nivel y tengo que procesar el valor de los hijos
			if (arbolAuxiliar != null) {
				//Imprimir nodo si (nivel >= n) y (nivel <= m)
				if (nivel >= n && nivel <= m) {
					System.out.print(arbolAuxiliar.getData());
					if (cola.head() != null) {
						System.out.print(" - ");
					} else {
						System.out.println();
					}
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
				if (nivel >= n && nivel <= m) {
					System.out.println();
				}
				cola.enqueue(null);
			}
		}
    }
}

