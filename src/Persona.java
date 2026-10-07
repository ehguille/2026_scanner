
public class Persona {

	private String nombre, apellidos;
	
	public Persona(String nombre, String apellidos) {
		this.nombre=nombre;
		this.apellidos=apellidos;
	}
	
	public void presentarse() {
		System.out.println("Buenos días, soy "+nombre+" "+apellidos+".");
	}
	
}
