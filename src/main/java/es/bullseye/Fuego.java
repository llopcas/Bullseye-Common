package es.bullseye;

public class Fuego extends Arma implements FuegoInterfaz {

	private double calibreEnMilimetros;

	private String sistemaAccion;
	private int cargador;

	// GETTERS Y SETTERS

	public int getCargador() {
		return cargador;
	}

	public void setCargador(int cargador) {
		this.cargador = cargador;
	}

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
	public void setCalibreEnMilimetros(double calibreEnMilimetros) {
		this.calibreEnMilimetros = calibreEnMilimetros;
	}

	// CONSTRUCTORES
	public Fuego() {
		super();
	}

	public Fuego(double calibreEnMilimetros, String sistemaAccion, int cargador) {
		super();

		this.calibreEnMilimetros = calibreEnMilimetros;
		this.sistemaAccion = sistemaAccion;
		this.cargador = cargador;
	}

	

}
