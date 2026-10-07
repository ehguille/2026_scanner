
public class Persona {

	private String nombre, apellidos;
	private int edad;
	
	public Persona(String nombre, String apellidos, int edad) {
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.edad=edad;
	}
	
	public void presentarse() {
		System.out.println("Buenos días, soy "+nombre+" "+apellidos+" y tengo "+edad+" años.");
	}
	
}
