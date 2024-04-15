package tp1.ejercicio7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import Practica1.Estudiante;

public class TestArrayList {
	
	public static void puntoC() {
		//Una lista que contenga 3 estudiantes
		List<Estudiante> listaEstudiantes = new LinkedList<>();
		Estudiante E1= new Estudiante();
		E1.setNombre("Francisco");
		E1.setApellido("Ronga");
		E1.setComision("1");
		E1.setDireccion("Calle 48");
		E1.setEmail("francisco.ronga@email.com");
		
		Estudiante E2= new Estudiante();
		E2.setNombre("Franco");
		E2.setApellido("Rodriguez");
		E2.setComision("2");
		E2.setDireccion("Calle 60");
		E2.setEmail("franco.rodriguez@email.com");
		
		Estudiante E3= new Estudiante();
		E3.setNombre("Ana");
		E3.setApellido("Martinez");
		E3.setComision("2");
		E3.setDireccion("Calle 22");
		E3.setEmail("ana.mart@email.com");
		
		listaEstudiantes.add(E1);
		listaEstudiantes.add(E2);
		listaEstudiantes.add(E3);
		
		//Generar una nueva lista que sea una copia a la de arriba
		List<Estudiante> copiaListaEstudiantes=new LinkedList<>(listaEstudiantes);
		
		//Imprimir el contenido de las 2 listas
		System.out.println("Lista Original: ");
		for (Estudiante i : listaEstudiantes) {
			System.out.println(i.tusDatos());
		}
		System.out.println("Lista Copia: ");
		for (Estudiante i : copiaListaEstudiantes) {
			System.out.println(i.tusDatos());
		}
		
		//Modifique algun dato de los estudiantes
		E1.setNombre("Ricardo");
		E1.setApellido("Darin");
		
		//Imprimir denuevo las listas
		System.out.println("Lista Original: ");
		for (Estudiante i : listaEstudiantes) {
			System.out.println(i.tusDatos());
		}
		System.out.println("Lista Copia: ");
		for (Estudiante i : copiaListaEstudiantes) {
			System.out.println(i.tusDatos());
		}
		
		//Punto E
		Estudiante E4= new Estudiante();
		E4.setNombre("Kylian");
		E4.setApellido("Martinez");
		E4.setComision("2");
		E4.setDireccion("Calle 22");
		E4.setEmail("ana.mart@email.com");
		
		//Verificar que el estudiante no esté en la lista
		//Para verificar que no existe, tengo que iterar sobre todos los objetos de la lista y comparar
		boolean encontrado = false;
		for (Estudiante i : listaEstudiantes) {
		    if (i.getNombre().equals(E4.getNombre()) && i.getApellido().equals(E4.getApellido())) {
		        encontrado = true;
		        break; // Si ya se encuentra un estudiante con el mismo nombre y apellido, salimos del bucle
		    }
		}
		if (!encontrado) {
			System.out.println("Estudiante Agregado Correctamente, no existe en lista.");
			listaEstudiantes.add(E4);
		}
	}
	

	public static boolean esCapicua(ArrayList<Integer> lista) {
        // Crear una nueva lista que sea una copia invertida de la lista original
        ArrayList<Integer> copiaReversa = new ArrayList<>();
        for (int i =(lista.size() -1) ;i >= 0 ;i--) {
            copiaReversa.add(lista.get(i));
        }
        
        // Comparar ambas listas
        for (int i = 0; i < lista.size(); i++) {
            if (!lista.get(i).equals(copiaReversa.get(i))) {
                return false; // Si los elementos no son iguales, la lista no es capicúa
            }
        }
        
        // Si no entró al IF, llego hasta aca y retorno True
        return true;
    }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> numeros =new ArrayList<>();
		
		for (String arg : args) {
			//Entra como String, lo paso a int
			int numero= Integer.parseInt(arg);
			numeros.add(numero);
		}
		
		System.out.println("Contenido de la lista:");
		for (Integer numero : numeros) {
			System.out.println(numero);
		}
		//Para que se ejecute el punto C-D y E
		puntoC();
		
		//Punto F
		System.out.println("¿Es capicua?");
		System.out.println(esCapicua(numeros));
	}

}
