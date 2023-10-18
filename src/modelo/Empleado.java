package modelo;

public class Empleado extends Persona {

	private int numeroLegajo;

	public Empleado(int id, int dni, String apellido, String nombre, int numeroLegajo) {
		super(id, dni, apellido, nombre);
		this.setNumeroLegajo(numeroLegajo);
	}

	public int getNumeroLegajo() {
		return numeroLegajo;
	}

	public void setNumeroLegajo(int numeroLegajo) {
		this.numeroLegajo = numeroLegajo;
	}

	@Override
	public String toString() {
		return "Empleado [numeroLegajo=" + numeroLegajo + super.toString() + "]";
	}

}
