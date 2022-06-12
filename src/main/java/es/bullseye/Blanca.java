package es.bullseye;

public class Blanca extends Arma implements BlancaInterfaz {

	private String forma;
	private String filo;
	private double longitudEnMilimetros;

	// GETTERS Y SETTERS
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

	@Override
	public double getLongitudEnMilimetros() {
		return longitudEnMilimetros;
	}

	@Override
	public void setLongitudEnMilimetros(double longitudEnMilimetros) {
		this.longitudEnMilimetros = longitudEnMilimetros;
	}

	// CONSTRUCTORES

	public Blanca() {
		super();
	}

	public Blanca(String forma, String filo, double longitudEnMilimetros) {
		super();
		this.forma = forma;
		this.filo = filo;
		this.longitudEnMilimetros = longitudEnMilimetros;
	}

}
