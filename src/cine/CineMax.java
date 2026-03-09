package cine;

import java.util.HashMap;
import usuarios.*;
import java.util.List;
import java.util.Map;

import peliculas.Documental;
import peliculas.Largometraje;
import peliculas.Pelicula;
import peliculas.PeliculaAnimada;
import usuarios.Usuario;

public class CineMax {

	private Map<String,Cine> cines;
	private Map<String, Usuario> clientes;
	private Map<String, Usuario> empleados;
	
	
	public CineMax() {
		this.cines = new HashMap<String, Cine>();
		this.clientes = new HashMap<String, Usuario>();
		this.empleados = new HashMap<String, Usuario>();
	}
	
	
	public void nuevoCine(String nombre,String direccion) throws Exception {
		
		if(this.cines.containsKey(nombre)) {
			throw new Exception("Ya existe este cine");
		} else {
			Cine cine = new Cine(nombre,direccion);
			this.cines.put(nombre, cine);
		}
		
	}
	
	public void nuevoCliente(String correoElectronico,String contraseña,String ID) throws Exception {
		
		if(this.clientes.containsKey(correoElectronico) || this.empleados.containsKey(correoElectronico)) {
			throw new Exception("Este usuario ya existe");
		} else {
			Cliente cliente = new Cliente(correoElectronico, contraseña, ID);
			this.clientes.put(correoElectronico, cliente);
		}

	}
	
	public void nuevoEmpleado(String correoElectronico,String contraseña) throws Exception {
		
		if(this.clientes.containsKey(correoElectronico) || this.empleados.containsKey(correoElectronico)) {
			throw new Exception("Este usuario ya existe");
		} else {
			Empleado empleado = new Empleado(correoElectronico, contraseña);
			this.empleados.put(correoElectronico, empleado);
		}

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


	public Map<String, Cine> getCines() {
		return cines;
	}


	public Map<String, Usuario> getClientes() {
		return clientes;
	}


	public Map<String, Usuario> getEmpleados() {
		return empleados;
	}
	
	
	
}
