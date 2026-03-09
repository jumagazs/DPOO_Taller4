package usuarios;


import java.util.List;
import peliculas.*;
import cine.*;

import cine.Funcion;
import cine.Sala;

public class Empleado extends Usuario {

	public Empleado(String correoElectronico,String contraseña) {
		super( correoElectronico, contraseña);
	}
	
	public void cambiarHoraFuncion(Funcion funcion, String hora) {
		funcion.setHora(hora);
	}
	
	public void nuevaFuncion(Sala sala, String fecha, String hora, int precioBoleta, Pelicula pelicula) {
		Funcion funcion = new Funcion( fecha,  hora,  precioBoleta, pelicula);
		sala.nuevaFuncion(funcion);
	}
	
	public void nuevaPeliculaAnimada(String titulo, String genero, int duracion, String clasificacion, int edad,
			String fechaEstreno, String director, List<String> actores,String tecnicaAnimacion, Cine cine) {
		Pelicula pelicula = new PeliculaAnimada( titulo,  genero,  duracion,  clasificacion,  edad,  fechaEstreno,
			 director, actores,tecnicaAnimacion);
		cine.nuevaPelicula(pelicula);
		
	}
	
	public void nuevoDocumental(String titulo, String genero, int duracion, String clasificacion, int edad, String fechaEstreno,
			String director, List<String> actores,String tematica, String narrador,Cine cine) {
		Pelicula pelicula = new Documental( titulo,  genero,  duracion,  clasificacion,  edad,  fechaEstreno,
			 director, actores,tematica,narrador);
		cine.nuevaPelicula(pelicula);
		
	}
	
	public void nuevoLargometraje(String titulo, String genero, int duracion, String clasificacion, int edad, String fechaEstreno,
			String director, List<String> actores,Cine cine) {
		Pelicula pelicula = new Largometraje( titulo,  genero,  duracion,  clasificacion,  edad,  fechaEstreno,
			 director, actores);
		cine.nuevaPelicula(pelicula);
		
	}
	
	public void nuevaSala(int numeroSala, int capacidad, String tipoTecnologia, Cine cine) {
		Sala sala = new Sala(numeroSala, capacidad,  tipoTecnologia);
		cine.nuevaSala(sala);
		
	}
}
