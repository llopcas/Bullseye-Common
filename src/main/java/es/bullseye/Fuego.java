package es.bullseye;

public class Fuego extends Arma implements FuegoInterfaz {

	private int cargador;
	private String sistemaAccion;
	private float calibreEnMilimetros;

	// GETTERS Y SETTERS
	public int getCargador() {
		return cargador;
	}

	public void setCargador(int cargador) {
		this.cargador = cargador;
	}

	public String getSistemaAccion() {
		return sistemaAccion;
	}

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

	// CONSTRUCTORES
	public Fuego() {
		super();
	}

	public Fuego(int cargador, String sistemaAccion, float calibreEnMilimetros) {
		super();
		this.cargador = cargador;
		this.sistemaAccion = sistemaAccion;
		this.calibreEnMilimetros = calibreEnMilimetros;
	}

}
