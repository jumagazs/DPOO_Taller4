package usuarios;

import java.util.ArrayList;
import java.util.List;

import cine.Asiento;

public class Transaccion {
	
	private String tipoTarjeta;
	private String fechaTransaccion;
	private int monto;
	private List<Asiento> sillasCompradas;
	
	public Transaccion(String tipoTarjeta, String fechaTransaccion, int monto, List<Asiento> sillasCompradas) {

		this.tipoTarjeta = tipoTarjeta;
		this.fechaTransaccion = fechaTransaccion;
		this.monto = monto;
		this.sillasCompradas = sillasCompradas;
	}
	
	@Override
	public String toString() {
		return "Tarjeta: " + this.tipoTarjeta + " \t Fecha: " + this.fechaTransaccion + 
		           " \t Monto: $" + this.monto + " \t Sillas: " + this.sillasCompradas.size();
	}
}
