package modelo;

public abstract class Persona {

	protected int id;
	protected int dni;
	protected String apellido;
	protected String nombre;

	public Persona(int id, int dni, String apellido, String nombre) {
		this.setId(id);
		this.setDni(dni);
		this.setApellido(apellido);
		this.setNombre(nombre);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "dni=" + dni + ", apellido=" + apellido + ", nombre=" + nombre;
	}

	public boolean equals(Persona persona) {
		return this.id == persona.getId();
	}

}
