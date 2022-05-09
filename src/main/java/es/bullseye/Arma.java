package es.bullseye;

public class Arma {

	private String nombre;
	private int peso;

	// GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombreString(String nombreString) {
		this.nombre = nombreString;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	// CONSTRUCTORES
	public Arma() {
		super();
	}

	public Arma(String nombre, int peso) {
		super();
		this.nombre = nombre;
		this.peso = peso;
	}

}
