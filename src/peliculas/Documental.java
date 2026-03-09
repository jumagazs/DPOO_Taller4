package peliculas;

import java.util.List;

public class Documental extends Pelicula {
	
	private String tematica;
	private String narrador;
	
	public Documental(String titulo, String genero, int duracion, String clasificacion, int edad, String fechaEstreno,
			String director, List<String> actores,String tematica, String narrador) {
		super(titulo, genero, duracion, clasificacion, edad, fechaEstreno, director, actores);
		this.narrador = narrador;
		this.tematica = tematica;
	}



}
