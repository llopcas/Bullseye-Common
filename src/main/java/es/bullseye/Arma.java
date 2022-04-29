package es.bullseye;

public class Arma {

	private String nombreString;
	private int peso;
	public String getNombreString() {
		return nombreString;
	}
	public void setNombreString(String nombreString) {
		this.nombreString = nombreString;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public Arma(String nombreString, int peso) {
		super();
		this.nombreString = nombreString;
		this.peso = peso;
	}
	
	
}
