package tp1.ejercicio7;

import java.util.LinkedList;

public class EjercicioSumarRecursivo {
	  //------ PUNTO I ------
    private int sumarRecursivo(LinkedList<Integer> lista,int s) {
    	// Si llego al final
    	if (s == lista.size()) {
            return 0; 
        }
    	return lista.get(s) + sumarRecursivo(lista, s + 1);
    }
    
    public int sumarLinkedList(LinkedList<Integer> lista) {
    	
    	return sumarRecursivo(lista,0);
    }
}
