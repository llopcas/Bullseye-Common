package es.bullseye;

public class Blanca extends Arma{

	private String forma;
	private String filo;
	private float longitudEnMilimetros;
	public String getForma() {
		return forma;
	}
	public void setForma(String forma) {
		this.forma = forma;
	}
	public String getFilo() {
		return filo;
	}
	public void setFilo(String filo) {
		this.filo = filo;
	}
	public float getLongitudEnMilimetros() {
		return longitudEnMilimetros;
	}
	public void setLongitudEnMilimetros(float longitudEnMilimetros) {
		this.longitudEnMilimetros = longitudEnMilimetros;
	}
	public Blanca(String forma, String filo, float longitudEnMilimetros) {
		super();
		this.forma = forma;
		this.filo = filo;
		this.longitudEnMilimetros = longitudEnMilimetros;
	}
	
	
}
