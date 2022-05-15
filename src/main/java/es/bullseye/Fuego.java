package es.bullseye;

public class Fuego extends Arma implements FuegoInterfaz {

	private int cargador;
	private String sistemaAccion;
	private float calibreEnMilimetros;
	private String nombre;

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

	@Override
	public String getNombre() {

		return super.getNombre();
	}

	@Override
	public void setNombreString(String nombreString) {

		super.setNombreString(nombreString);
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
