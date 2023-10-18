package modelo;

public class Visita extends Persona {

	private String empresa;

	public Visita(int id, int dni, String apellido, String nombre, String empresa) {
		super(id, dni, apellido, nombre);
		this.setEmpresa(empresa);

	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	@Override
	public String toString() {
		return "Visita [empresa=" + empresa + super.toString() + "]";
	}

}
