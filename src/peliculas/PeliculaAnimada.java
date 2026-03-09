package peliculas;

import java.util.List;

public class PeliculaAnimada extends Pelicula {
	
	private String tecnicaAnimacion;

	public PeliculaAnimada(String titulo, String genero, int duracion, String clasificacion, int edad,
			String fechaEstreno, String director, List<String> actores,String tecnicaAnimacion) {
		super(titulo, genero, duracion, clasificacion, edad, fechaEstreno, director, actores);
		this.tecnicaAnimacion = tecnicaAnimacion;
	}



}
