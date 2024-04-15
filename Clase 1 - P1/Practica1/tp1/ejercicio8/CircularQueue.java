package tp1.ejercicio8;

public class CircularQueue<T> extends Queue<T>{
	//Shift va a desplazar el primer elemento de la cola al final, creando asi una cola circular
	public T shift() {
		if(!super.isEmpty()) {
			T dato=super.dequeue();
			super.enqueue(dato);
			
			return dato;
		}else
			return null;
	}
}
