package es.bullseye;

public class Fuego extends Arma implements FuegoInterfaz {

	private int cargador;
	private String sistemaAccion;
	private float calibreEnMilimetros;
	private String nombre;

	// GETTERS Y SETTERS
	@Override
	public int getCargador() {
		return cargador;
	}

	@Override
	public void setCargador(int cargador) {
		this.cargador = cargador;
	}

	@Override
	public String getSistemaAccion() {
		return sistemaAccion;
	}

	@Override
	public void setSistemaAccion(String sistemaAccion) {
		this.sistemaAccion = sistemaAccion;
	}

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

	public Fuego(int cargador, String sistemaAccion, float calibreEnMilimetros, String nombre) {
		super();
		this.nombre = nombre;
		this.cargador = cargador;
		this.sistemaAccion = sistemaAccion;
		this.calibreEnMilimetros = calibreEnMilimetros;
	}

}
