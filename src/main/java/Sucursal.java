import java.util.ArrayList;

public class Sucursal {
	private int codigoSucursal;
	private int codigoPostal;
	private GestionBanco gestionBanco;

	private ArrayList<CuentaBancaria> cuentas_bancarias = new ArrayList<CuentaBancaria>();

	public Sucursal(int codigoSucursal, int codigoPostal, GestionBanco gestionBanco) {
		this.codigoSucursal = codigoSucursal;
		this.codigoPostal = codigoPostal;
		this.gestionBanco = gestionBanco;
	}

	public int getCodigoSucursal() {
		return this.codigoSucursal;
	}

	public int getCodigoPostal() {
		return this.codigoPostal;
	}
}