public class CuentaAhorro extends CuentaBancaria {
	private double reajusteAnual;

	public double getReajusteAnual() {
		return this.reajusteAnual;
	}

	public String getTipo() {
		throw new UnsupportedOperationException();
	}
}