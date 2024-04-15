package tp1.ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class EjercicioSucesion {
    //------ PUNTO G ------
	//Para calcular la sucesion necesito el numero, y la lista donde estoy almacenando los numeros
    private void calcularSucesionRecursiva(int n, List<Integer> sucesion) {
        
    	sucesion.add(n); // Añade el número actual a la sucesión
    	// Si llego o empiezo en 1, termino la recursión
        if (n == 1) {
            return;
        }
        if (n % 2 == 0) {
            calcularSucesionRecursiva((n / 2), sucesion); 
        } else {
            calcularSucesionRecursiva(((3 * n) + 1), sucesion); 
        }
    }
	public List<Integer> calcularSucesion(int n) {
        List<Integer> sucesion = new ArrayList<>();
        calcularSucesionRecursiva(n, sucesion);
        return sucesion;
    }
}