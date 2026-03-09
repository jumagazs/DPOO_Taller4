package peliculas;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public abstract class Pelicula {
	
	private String titulo;
	private String genero;
	private int duracion;
	private String clasificacion;
	private int edad;
	private String fechaEstreno;
	private String director;
	private List<String> actores;
	
	
	public Pelicula(String titulo, String genero, int duracion, String clasificacion, int edad, String fechaEstreno,
			String director, List<String> actores) {
		super();
		this.titulo = titulo;
		this.genero = genero;
		this.duracion = duracion;
		this.clasificacion = clasificacion;
		this.edad = edad;
		this.fechaEstreno = fechaEstreno;
		this.director = director;
		this.actores = actores;
	}


	public String getTitulo() {
		return titulo;
	}


	public String getGenero() {
		return genero;
	}


	public int getDuracion() {
		return duracion;
	}


	public String getClasificacion() {
		return clasificacion;
	}


	public int getEdad() {
		return edad;
	}


	public String getFechaEstreno() {
		return fechaEstreno;
	}


	public String getDirector() {
		return director;
	}


	public List<String> getActores() {
		return actores;
	}
	
	
	
	
	

}
