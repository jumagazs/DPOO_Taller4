package usuarios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cine.Asiento;
import cine.Funcion;
import cine.Sala;

public class Cliente extends Usuario {

	private String ID;
	private List<Transaccion> transacciones;
	private int puntosMembresia;
	
	public Cliente(String correoElectronico,String contraseña,String ID) {
		super(correoElectronico, contraseña);
		this.transacciones = new ArrayList<Transaccion>();
		this.ID = ID;
	}
	
	
	public void comprarBoletasFuncion(String fechaTransaccion,List<Integer> asientos, Funcion funcion, String tipoTarjeta, Sala sala) throws Exception {
		
		List<Asiento> sillasCompradas = new ArrayList<Asiento>(); 
		int monto = asientos.size()*funcion.getPrecioBoleta();
		List<Asiento> asientosOcupados = funcion.getAsientosOcupados();
		
		/// Ver si ocupado
		for(Asiento asiento: asientosOcupados) {
			if(asientos.contains(asiento.getNumeroAsiento())) {
				throw new Exception("Asiento ocupado");
			}
		}
		
		
		
		Map<Integer, Asiento> asientosSala = sala.getAsientos();
		//Ocuparlos
		for(int asiento : asientos) {
			Asiento asientoSala = asientosSala.get(asiento);
			funcion.ocuparAsiento(asientoSala);
			sillasCompradas.add(asientoSala);
		}
		
		//Guardar transaccion
		this.transacciones.add(new Transaccion(tipoTarjeta,fechaTransaccion, monto, sillasCompradas));
		
	}
	
	public void imprimirTransacciones() {
		
		if(this.transacciones.isEmpty()) {
			System.out.println("No hay transacciones");
		} else {
			for(Transaccion transaccion:this.transacciones) {
				System.out.println(transaccion);
			}
		}
	}

}
