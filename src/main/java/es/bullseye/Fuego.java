package es.bullseye;

public class Fuego extends Arma{

	private int cargador;
	private String sistemaAccion;
	private float calibreEnMilimetros;
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
	public float getCalibreEnMilimetros() {
		return calibreEnMilimetros;
	}
	public void setCalibreEnMilimetros(float calibreEnMilimetros) {
		this.calibreEnMilimetros = calibreEnMilimetros;
	}
	public Fuego(int cargador, String sistemaAccion, float calibreEnMilimetros) {
		super();
		this.cargador = cargador;
		this.sistemaAccion = sistemaAccion;
		this.calibreEnMilimetros = calibreEnMilimetros;
	}
	
	
}
