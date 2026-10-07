import java.util.Scanner;

public class Aplicacion {
	
	public Aplicacion() {
		Scanner s=new Scanner(System.in);
		//Persona p=new Persona("Guillermo","González");
		//p.presentarse();
		System.out.println("Introduce tu nombre:");
		String nombre=s.nextLine();
		System.out.println("Introduce tus apellidos:");
		String apellidos=s.nextLine();
		Persona otraPersona=new Persona(nombre, apellidos);
		otraPersona.presentarse();
	}
	
	public void saludar(String persona) {
		System.out.println("Hola, "+persona);
	}

	public static void main(String[] args) {
		Aplicacion app=new Aplicacion();
	}

}
