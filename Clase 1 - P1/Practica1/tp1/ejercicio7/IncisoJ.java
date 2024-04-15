package tp1.ejercicio7;

import java.util.ArrayList;

public class IncisoJ {
	
	public ArrayList<Integer> combinarOrdenado(ArrayList<Integer> lista1,ArrayList<Integer> lista2){
		
		ArrayList<Integer> resultado = new ArrayList<>();
        int i = 0, j = 0;

        //Recorro las 2 listas, y voy agregando a resultado
        
        while (i < lista1.size() && j < lista2.size()) {
            if (lista1.get(i) < lista2.get(j)) {
                resultado.add(lista1.get(i));
                i++;
            } else {
                resultado.add(lista2.get(j));
                j++;
            }
        }

        //Me fijo si quedaron elementos de alguna lista
        if (lista1.size() > lista2.size()) {
        	while (i < lista1.size()) {
                resultado.add(lista1.get(i));
                i++;
            }
        }else if(lista2.size() > lista1.size()) {
        	while (j < lista2.size()) {
                resultado.add(lista2.get(j));
                j++;
            }
        }

        return resultado;
	}
}
