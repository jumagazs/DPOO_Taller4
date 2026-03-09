package cine;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import peliculas.*;

import java.util.Map;

public class Cine {
	
	private String nombre;
	private String direccion;
	private Map<Integer, Sala> salas;
	private List<Pelicula> peliculas;

	public Cine(String nombre,String direccion) {
		this.salas = new HashMap<Integer,Sala>();
		this.peliculas = new ArrayList<Pelicula>();
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	
	public void nuevaPelicula(Pelicula pelicula) {
		this.peliculas.add(pelicula);
	}
	
	public void nuevaSala(Sala sala) {
		this.salas.put(sala.getNumeroSala(), sala);
	}


	public String getNombre() {
		return nombre;
	}


	public String getDireccion() {
		return direccion;
	}


	public Map<Integer, Sala> getSalas() {
		return salas;
	}


	public List<Pelicula> getPeliculas() {
		return peliculas;
	}
	
	public Pelicula buscarPelicula(String nombre) {
		Pelicula peliculaEncontrada = null;
		for (Pelicula pelicula: this.peliculas) {
			if(pelicula.getTitulo().equals(nombre)) {
				peliculaEncontrada = pelicula;
			}
		}
		
		return peliculaEncontrada;
		
	}

}
