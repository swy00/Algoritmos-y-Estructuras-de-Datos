package Practica1;

public class tp1Ejercicio3Test {

	public static void main(String[] args) {
		//ESTUDIANTES
		Estudiante estudiantes[] = new Estudiante[2];
		Estudiante E1= new Estudiante();
		E1.setNombre("Francisco");
		E1.setApellido("Ronga");
		E1.setComision("1");
		E1.setDireccion("Calle 48");
		E1.setEmail("francisco.ronga@email.com");
		estudiantes[0]=E1;
		Estudiante E2= new Estudiante();
		E2.setNombre("Franco");
		E2.setApellido("Rodriguez");
		E2.setComision("2");
		E2.setDireccion("Calle 60");
		E2.setEmail("franco.rodriguez@email.com");
		estudiantes[1]=E2;
		
		//PROFESORES
		Profesor profesores[] = new Profesor[3];
		Profesor P1= new Profesor();
		P1.setNombre("Pablo");
		P1.setApellido("Arias");
		P1.setCatedra("1");
		P1.setEmail("pablo.arias@email.com");
		P1.setFacultad("UNLP");
		Profesor P2 = new Profesor();
		P2.setNombre("María");
		P2.setApellido("Gómez");
		P2.setCatedra("2");
		P2.setEmail("maria.gomez@email.com");
		P2.setFacultad("UBA");
		Profesor P3 = new Profesor();
		P3.setNombre("Carlos");
		P3.setApellido("López");
		P3.setCatedra("3");
		P3.setEmail("carlos.lopez@email.com");
		P3.setFacultad("UNC");

		profesores[0]=P1;
		profesores[1]=P2;
		profesores[2]=P3;
		
		for (int i=0;i<2;i++) {
			System.out.println(estudiantes[i].tusDatos());
		}
		
		for (int i=0;i<3;i++) {
			System.out.println(profesores[i].tusDatos());
		}
	}
}
