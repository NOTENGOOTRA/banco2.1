public class CuentaCorriente extends CuentaBancaria {
	private int lineaSobregiro;

	public int getLineaSobregiro() {
		return this.lineaSobregiro;
	}

	public String getTipo() {
		throw new UnsupportedOperationException();
	}
}