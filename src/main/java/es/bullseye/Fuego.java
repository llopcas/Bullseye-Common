package es.bullseye;

public class Fuego extends Arma implements FuegoInterfaz {

	
	private float calibreEnMilimetros;
	private String nombre;

	// GETTERS Y SETTERS


	@Override
	public float getCalibreEnMilimetros() {
		return calibreEnMilimetros;
	}

	@Override
	public void setCalibreEnMilimetros(float calibreEnMilimetros) {
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

	public Fuego( float calibreEnMilimetros, String nombre) {
		super();
		this.nombre = nombre;
		this.calibreEnMilimetros = calibreEnMilimetros;
	}

}
