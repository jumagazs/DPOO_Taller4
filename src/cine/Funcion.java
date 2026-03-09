package cine;

import java.util.ArrayList;
import java.util.List;

import peliculas.Pelicula;

public class Funcion {
	
	private String fecha;
	private String hora;
	private List<Asiento>asientosOcupados;
	private int precioBoleta;
	private Pelicula pelicula;
	
	
	public Funcion(String fecha, String hora, int precioBoleta, Pelicula pelicula) {
		this.fecha = fecha;
		this.hora = hora;
		this.precioBoleta = precioBoleta;
		this.asientosOcupados = new ArrayList<Asiento>();
		this.pelicula = pelicula;
	}


	public String getFecha() {
		return fecha;
	}


	public String getHora() {
		return hora;
	}


	public List<Asiento> getAsientosOcupados() {
		return asientosOcupados;
	}


	public int getPrecioBoleta() {
		return precioBoleta;
	}
	
	public void ocuparAsiento(Asiento asiento) {
		this.asientosOcupados.add(asiento);
	}


	public void setHora(String hora) {
		this.hora = hora;
	}


	public Pelicula getPelicula() {
		return pelicula;
	}
	
	
	
	
	
	

}
