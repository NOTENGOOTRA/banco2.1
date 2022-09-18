public class Cliente {
	private String nombre;
	private String rut;
	private int edad;
	private GestionBanco gestionBanco;

	public String getNombre() {
		return this.nombre;
	}

	public String getRut() {
		return this.rut;
	}

	public int getEdad() {
		return this.edad;
	}

	public Cliente(String nombre, String rut, int edad) {
		this.nombre = nombre;
		this.rut = rut;
		this.edad = edad;
	}
}