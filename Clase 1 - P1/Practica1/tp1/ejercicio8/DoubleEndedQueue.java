package tp1.ejercicio8;

public class DoubleEndedQueue<T> extends Queue<T> {
	//Como es privada la lista
		public void enqueueFirst (T data) {
			Queue<T> temp=new Queue<T>();
			//Vacio la cola original y lo meto a la temporal, para poder agregar un elemento al principio
			while(!super.isEmpty())
				temp.enqueue(super.dequeue());
			//Agrego a la cola original vacia el elemento que queria agregar, asegurandome que quede ultimo
			super.enqueue(data);
			//Vacio la temporal agregando los elementos a la original
			while(!temp.isEmpty())
				super.enqueue(temp.dequeue());
		}
	}
