import java.util.Scanner;

public class Aplicacion {
	
	public Aplicacion() {
		Scanner s=new Scanner(System.in);
		System.out.println("¿Cómo te llamas?");
		String nombre=s.next();
		saludar(nombre);
	}
	
	public void saludar(String persona) {
		System.out.println("Hola, "+persona);
	}

	public static void main(String[] args) {
		Aplicacion app=new Aplicacion();
	}

}
