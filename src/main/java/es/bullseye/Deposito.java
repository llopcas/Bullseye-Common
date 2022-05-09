package es.bullseye;

import java.util.Collection;

public class Deposito {

	private int codigoDeposito;
	private Collection<Arma> armas;

	// GETTERS Y SETTERS
	public int getCodigoDeposito() {
		return codigoDeposito;
	}

	public void setCodigoDeposito(int codigoDeposito) {
		this.codigoDeposito = codigoDeposito;
	}

	public Collection<Arma> getArmas() {
		return armas;
	}

	public void setArmas(Collection<Arma> armas) {
		this.armas = armas;
	}

	// CONSTRUCTORES
	public Deposito() {
		super();
	}

	public Deposito(int codigoDeposito, Collection<Arma> armas) {
		super();
		this.codigoDeposito = codigoDeposito;
		this.armas = armas;
	}

}