
import java.util.ArrayList;
import java.util.List;
import java.util.logging.XMLFormatter;

public class GestionBanco {
    private List<Sucursal> sucursales;
	private List<Cliente> clientes;
	
	private List<CuentaBancaria> cuentasBancarias;


	public GestionBanco() {
		this.clientes = new ArrayList<Cliente>();
		this.sucursales = new ArrayList<Sucursal>();
	}

	private void add(List<CuentaBancaria> cuentasBancarias) {
	}

	public List<Cliente> getClientes(){
		return clientes;
	}
	public List<Sucursal> getSucursales(){
		return sucursales;
	}

	public Cliente agregarCliente(Cliente clientes) {
		this.clientes.add(clientes);
		return clientes;
	}


	public Sucursal agregarSucursalesBancarias(Sucursal sucursales) {
		this.sucursales.add(sucursales);
		return sucursales;
	}

	public List<CuentaBancaria> agregarCuentasBancarias(CuentaBancaria cuentasBancaria) {
		this.add(cuentasBancarias);
		return cuentasBancarias;
	}
	public List<Sucursal> obtenerCuentaAhorro() {
		throw new UnsupportedOperationException();
	}

	public List<Sucursal> obtenerCuentaCorriente() {
		throw new UnsupportedOperationException();
	}
}