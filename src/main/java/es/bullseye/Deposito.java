package es.bullseye;

import java.util.Collection;

public class Deposito {

	private int codigoDeposito;

	// GETTERS Y SETTERS
	public int getCodigoDeposito() {
		return codigoDeposito;
	}

	public void setCodigoDeposito(int codigoDeposito) {
		this.codigoDeposito = codigoDeposito;
	}

	// CONSTRUCTORES
	public Deposito() {
		super();
	}

	public Deposito(int codigoDeposito, Collection<Arma> armas) {
		super();
		this.codigoDeposito = codigoDeposito;

	}

}