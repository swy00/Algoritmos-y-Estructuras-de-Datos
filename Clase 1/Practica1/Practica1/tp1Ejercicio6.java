package Practica1;

public class tp1Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*6. Análisis de las estructuras de listas provistas por la API de Java.
			a. ¿En qué casos ArrayList ofrece un mejor rendimiento que LinkedList?
			
			El acceso aleatorio a elementos (obtener un elemento por su índice) es más rápido en ArrayList, 
			ya que los elementos están almacenados de forma contigua en la memoria, lo que permite un acceso directo mediante 
			índices.
			
			ArrayList es más eficiente en términos de memoria para almacenar grandes cantidades de elementos, ya que no tiene el 
			sobrecoste de los nodos adicionales como en LinkedList.
			Las operaciones de inserción y eliminación en ArrayList son más rápidas en promedio cuando se realizan al final 
			de la lista, ya que no hay necesidad de reorganizar la estructura de datos como en LinkedList.
			
			b. ¿Cuándo LinkedList puede ser más eficiente que ArrayList?
			
			LinkedList puede ser más eficiente que ArrayList para inserciones y eliminaciones frecuentes en el medio de la 
			lista, ya que no requiere reorganizar grandes bloques de memoria como en ArrayList.
			Si se están realizando operaciones frecuentes de inserción y eliminación al principio o al final de la lista, 
			LinkedList puede ser más eficiente que ArrayList, ya que estas operaciones son O(1) en LinkedList pero O(n) en ArrayList.
			
			c. ¿Qué diferencia encuentra en el uso de la memoria en ArrayList y LinkedList?
			
			En ArrayList, se reserva un bloque contiguo de memoria para almacenar los elementos, lo que resulta en un uso más 
			eficiente de la memoria y un acceso más rápido a los elementos mediante índices.
			
			En LinkedList, cada elemento se almacena en un nodo que contiene una referencia al siguiente nodo, lo que resulta 
			en un uso de memoria menos eficiente debido al espacio adicional requerido por las referencias de nodo. 
			Sin embargo, las inserciones y eliminaciones pueden ser más eficientes que en ArrayList en ciertos casos.
			
			d. ¿En qué casos sería preferible usar un ArrayList o un LinkedList?
			
			Preferir ArrayList:
			Cuando se necesita un acceso rápido a elementos mediante índices.
			Cuando se va a almacenar una gran cantidad de elementos y el espacio de memoria es una preocupación.
			Cuando las operaciones de inserción y eliminación se realizan principalmente al final de la lista.
			
			Preferir LinkedList:
			Cuando se van a realizar operaciones frecuentes de inserción y eliminación en el medio de la lista.
			Cuando las operaciones de inserción y eliminación se realizan principalmente al principio o al final de la
		 	lista y la eficiencia del tiempo de ejecución es más importante que la eficiencia del uso de la memoria.
		 */
	}

}
