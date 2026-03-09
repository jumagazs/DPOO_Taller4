package cine;

import java.util.HashMap;
import java.util.Map;

public class Sala {
	
	private int numeroSala;
	private int capacidad;
	private String tipoTecnologia;
	private Map<Integer,Asiento> asientos;
	private Map<String, Map<String,Funcion> > funciones;



	public Sala(int numeroSala, int capacidad, String tipoTecnologia) {
		this.numeroSala = numeroSala;
		this.capacidad = capacidad;
		this.tipoTecnologia = tipoTecnologia;

		this.asientos = new HashMap<Integer, Asiento>();
		this.funciones = new HashMap<String, Map<String,Funcion>>();
	
	}

	public int getNumeroSala() {
		return numeroSala;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public String getTipoTecnologia() {
		return tipoTecnologia;
	}

	public Map<Integer, Asiento> getAsientos() {
		return asientos;
	}

	public Map<String, Map<String,Funcion>> getFunciones() {
		return funciones;
	}
	
	public void nuevaFuncion(Funcion funcion) {
		String fecha = funcion.getFecha();
		String hora = funcion.getHora();
		
		
		if (!this.funciones.containsKey(fecha)) {
			this.funciones.put(fecha, new HashMap<String,Funcion>());
		} 
		
		this.funciones.get(fecha).put(hora,funcion);
		
	}
	
	public Funcion buscarFuncionFechaHora(String fecha, String hora) {
		return this.funciones.get(fecha).get(hora);
	}
	
	public void cambiarHoraFuncion(String fecha, String horaVieja, String horaNueva) {
	    Funcion funcion = this.funciones.get(fecha).get(horaVieja);
	    funcion.setHora(horaNueva);
	    this.funciones.get(fecha).remove(horaVieja);
	    this.funciones.get(fecha).put(horaNueva, funcion);
	}
	

	


}
