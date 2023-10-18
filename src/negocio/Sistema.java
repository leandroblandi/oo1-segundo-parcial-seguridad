package negocio;

import java.time.LocalDate;
import java.util.ArrayList;

import modelo.Empleado;
import modelo.Persona;
import modelo.Seguridad;
import modelo.Visita;

public class Sistema {

	private ArrayList<Persona> personas;
	private ArrayList<Seguridad> seguridades;

	public Sistema() {
		this.personas = new ArrayList<Persona>();
		this.seguridades = new ArrayList<Seguridad>();
	}

	// CU1:
	public boolean agregarEmpleado(int dni, String apellido, String nombre, int numeroLegajo) {

		int id = calcularAutoIncremental();

		return personas.add(new Empleado(id, dni, apellido, nombre, numeroLegajo));
	}

	// CU2:
	public boolean agregarVisita(int dni, String apellido, String nombre, String empresa) {

		int id = calcularAutoIncremental();

		return personas.add(new Visita(id, dni, apellido, nombre, empresa));
	}

	// CU3:
	public Persona traerPersona(int id) {

		Persona personaBuscada = null;
		int i = 0;

		while ((i < personas.size()) && (personaBuscada == null)) {

			Persona personaActual = personas.get(i);

			if (personaActual.getId() == id) {
				personaBuscada = personaActual;
			}

		}
		return personaBuscada;
	}

	// CU4:
	public Seguridad traerSeguridad(LocalDate fecha, Persona persona) {

	}

	// CU: Auxiliar
	public int calcularAutoIncremental() {
		int id = 1;
		if (!personas.isEmpty()) {
			id = personas.get(personas.size() - 1).getId() + 1;
		}
		return id;
	}

	public ArrayList<Persona> getPersonas() {
		return personas;
	}

	public ArrayList<Seguridad> getSeguridades() {
		return seguridades;
	}
}
