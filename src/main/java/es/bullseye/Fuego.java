package es.bullseye;

public class Fuego extends Arma implements FuegoInterfaz {

	
	private double calibreEnMilimetros;
	private String nombre;

	// GETTERS Y SETTERS


	@Override
	public double getCalibreEnMilimetros() {
		return calibreEnMilimetros;
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

	public Fuego( double calibreEnMilimetros, String nombre) {
		super();
		this.nombre = nombre;
		this.calibreEnMilimetros = calibreEnMilimetros;
	}

}
