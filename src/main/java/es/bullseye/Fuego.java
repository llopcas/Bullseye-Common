package es.bullseye;

public class Fuego extends Arma implements FuegoInterfaz {

	
	private double calibreEnMilimetros;
	private String nombre;
	private String sistemaAccion;

	// GETTERS Y SETTERS


	@Override
	public double getCalibreEnMilimetros() {
		return calibreEnMilimetros;
	}

	public String getSistemaAccion() {
		return sistemaAccion;
	}

	public void setSistemaAccion(String sistemaAccion) {
		this.sistemaAccion = sistemaAccion;
	}

	@Override
	public void setCalibreEnMilimetros( double calibreEnMilimetros) {
		this.calibreEnMilimetros = calibreEnMilimetros;
	}

	@Override
	public String getNombre() {
		return nombre;
	}

	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// CONSTRUCTORES
	public Fuego() {
		super();
	}

	public Fuego( double calibreEnMilimetros, String nombre, String sistemaAccion) {
		super();
		this.nombre = nombre;
		this.calibreEnMilimetros = calibreEnMilimetros;
		this.sistemaAccion = sistemaAccion;
	}

}
