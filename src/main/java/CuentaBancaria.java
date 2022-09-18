public abstract class CuentaBancaria {
	private int numeroCuenta;
	private String fechaApertura;
	private int saldo;
	private Cliente cliente;

	public int getNumeroCuenta() {
		return this.numeroCuenta;
	}

	public String getFechaApertura() {
		return this.fechaApertura;
	}

	public int getSaldo() {
		return this.saldo;
	}

	public abstract String getTipo();
}