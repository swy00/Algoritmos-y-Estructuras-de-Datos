package tp1.ejercicio7;

import java.util.ArrayList;

public class EjercicioInvertirRecursivo {
	//------ PUNTO H ------
	private void invertirRecursivo(ArrayList<Integer> lista,int inicio,int fin) {
    	//Como inicio lo voy a incrementar y fin decrementar, cuando se crucen o sean iguales termina
    	if (fin <= inicio) {
    		return;
    	}
    	//Lo que está en el indice de inicio lo mando al fin, y el que está en el fin al inicio
    	//Me guardo una copia del valor al inicio antes de cambiarlo
    	int copiaInicio= lista.get(inicio);
    	lista.set(inicio, lista.get(fin));
    	lista.set(fin, copiaInicio);
    	//Llamo a la funcion con inicio+1 y fin-1
    	invertirRecursivo(lista,(inicio+1),(fin-1));
    }
    
    public void invertirArrayList(ArrayList<Integer> lista) {
    	int fin=lista.size() -1;
    	invertirRecursivo(lista,0,fin);
    }
}
