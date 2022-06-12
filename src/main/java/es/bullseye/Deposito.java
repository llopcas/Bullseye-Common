package es.bullseye;

public class Deposito {

	private int codigoDeposito;
	private long idDeposito;

	// GETTERS Y SETTERS
	public int getCodigoDeposito() {
		return codigoDeposito;
	}

	public void setCodigoDeposito(int codigoDeposito) {
		this.codigoDeposito = codigoDeposito;
	}

	public long getIdDeposito() {
		return idDeposito;
	}

	public void setIdDeposito(long idDeposito) {
		this.idDeposito = idDeposito;
	}

	// CONSTRUCTORES
	public Deposito() {

	}

	public Deposito(int codigoDeposito) {
		super();
		this.codigoDeposito = codigoDeposito;

	}

}