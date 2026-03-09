package consola;

import cine.*;
import peliculas.*;
import usuarios.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Principal {
	
	private CineMax cinemax;
	private BufferedReader br;

	public Principal() {
		this.cinemax = new CineMax(); 
		this.br = new BufferedReader(new InputStreamReader(System.in));
		
		/// Crear cines

		try {
			cinemax.nuevoCine("Unicentro", "Calle 1 #2");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			cinemax.nuevoCine("Metrópolis", "Calle 2 #3");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			cinemax.nuevoCine("Gran Estación", "Calle 4 #5");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			cinemax.nuevoCine("Metrópolis", "Calle 7 #4");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		/// Crear salas y peliculas
		
		Cine c;
		List<String> actores;
		Sala sala;
		Pelicula pelicula;
		c = cinemax.getCines().get("Unicentro");
		
		cinemax.nuevaSala(1, 40, "2D", c);
		cinemax.nuevaSala(2, 50, "IMAX", c);
		
		actores = Arrays.asList("Leonardo DiCaprio", "Joseph Gordon-Levitt");
		cinemax.nuevaPeliculaAnimada("El Rey León", "Animación", 88, "G", 0, "24/06/1994", "Roger Allers", actores, "2D", c);

		actores = Arrays.asList("Tom Hanks", "Tim Allen");
		cinemax.nuevoLargometraje("Toy Story", "Comedia", 81, "G", 0, "22/11/1995", "John Lasseter", actores, c);
		
		sala = c.getSalas().get(1);
		pelicula = c.buscarPelicula("El Rey León");
		cinemax.nuevaFuncion(sala, "15/03/2026", "14:00", 15000, pelicula);
		cinemax.nuevaFuncion(sala, "15/03/2026", "17:00", 15000, pelicula);

		sala = c.getSalas().get(2);
		pelicula = c.buscarPelicula("Toy Story");
		cinemax.nuevaFuncion(sala, "15/03/2026", "15:00", 20000, pelicula);
		cinemax.nuevaFuncion(sala, "16/03/2026", "18:00", 20000, pelicula);
		
		c = cinemax.getCines().get("Metrópolis");
		
		cinemax.nuevaSala(3, 40, "2D", c);
		cinemax.nuevaSala(2, 10, "IMAX", c);
		
		actores = Arrays.asList("David Attenborough");
		cinemax.nuevoDocumental("Planet Earth", "Naturaleza", 50, "G", 0, "05/03/2006", "Alastair Fothergill", actores, "Vida salvaje", "David Attenborough", c);

		actores = Arrays.asList("Keanu Reeves", "Laurence Fishburne");
		cinemax.nuevoLargometraje("Matrix", "Acción", 136, "PG-13", 13, "31/03/1999", "Lana Wachowski", actores, c);
		
		sala = c.getSalas().get(3);
		pelicula = c.buscarPelicula("Planet Earth");
		cinemax.nuevaFuncion(sala, "15/03/2026", "10:00", 12000, pelicula);
		cinemax.nuevaFuncion(sala, "16/03/2026", "11:00", 12000, pelicula);

		sala = c.getSalas().get(2);
		pelicula = c.buscarPelicula("Matrix");
		cinemax.nuevaFuncion(sala, "15/03/2026", "20:00", 18000, pelicula);
		cinemax.nuevaFuncion(sala, "16/03/2026", "22:00", 18000, pelicula);
		
		
		c = cinemax.getCines().get("Gran Estación");
		
		cinemax.nuevaSala(1, 30, "IMAX", c);
		cinemax.nuevaSala(2, 20, "IMAX", c);
		
		actores = Arrays.asList("Elijah Wood", "Ian McKellen");
		cinemax.nuevoLargometraje("El Señor de los Anillos", "Fantasía", 178, "PG-13", 13, "19/12/2001", "Peter Jackson", actores, c);

		actores = Arrays.asList("Hayao Miyazaki");
		cinemax.nuevaPeliculaAnimada("Mi Vecino Totoro", "Fantasía", 86, "G", 0, "16/04/1988", "Hayao Miyazaki", actores, "2D", c);
		
		sala = c.getSalas().get(1);
		pelicula = c.buscarPelicula("El Señor de los Anillos");
		cinemax.nuevaFuncion(sala, "15/03/2026", "16:00", 22000, pelicula);
		cinemax.nuevaFuncion(sala, "16/03/2026", "19:00", 22000, pelicula);

		sala = c.getSalas().get(2);
		pelicula = c.buscarPelicula("Mi Vecino Totoro");
		cinemax.nuevaFuncion(sala, "15/03/2026", "13:00", 16000, pelicula);
		cinemax.nuevaFuncion(sala, "16/03/2026", "15:00", 16000, pelicula);
		
		
		 

		
		/// Crear Empleados
		 
		try {
			cinemax.nuevoEmpleado("jefe@gmail.com", "jefe1234");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			cinemax.nuevoEmpleado("empleado1@gmail.com", "empleado1");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			cinemax.nuevoEmpleado("empleado2@gmail.com", "empleado2");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			cinemax.nuevoEmpleado("empleado3@gmail.com", "empleado3");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	 
		 
		/// Empleados crean salas, peliculas y funciones. Cambian hora de funcion
		/// 
		/// 
		/// 
		/// 
		/// 
		/// Menú de usuarios, crean cuentas y hacen transacciones. 
        try {
            int op;
            do {
                System.out.println("=== CINEMAX ===");
                System.out.println("1. Iniciar sesión como empleado");
                System.out.println("2. Registrarse como cliente");
                System.out.println("3. Iniciar sesión como cliente");
                System.out.println("4. Ver cines y funciones");
                System.out.println("0. Salir");

                op = leerEntero();

                if (op == 1) {
                    menuEmpleado();
                } else if (op == 2) {
                    System.out.println("Correo:");
                    String correo = leerTexto();
                    System.out.println("Contraseña:");
                    String contraseña = leerTexto();
                    System.out.println("ID:");
                    String ID = leerTexto();
                    try {
                        cinemax.nuevoCliente(correo, contraseña,ID);
                        System.out.println("Cliente creado!");
                    } catch (Exception e) { System.out.println(e.getMessage()); }

                } else if (op == 3) {
                    System.out.println("Correo:");
                    String correo = leerTexto();
                    System.out.println("Contraseña:");
                    String contrasena = leerTexto();
                    try {
                        menuCliente(correo, contrasena);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                } else if (op == 4) {
                    verFunciones();
                }
            } while (op != 0);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try { this.br.close(); } catch (IOException e) { e.printStackTrace(); }
    }

    //  Menú empleado
    private void menuEmpleado() throws Exception {
        System.out.println("Correo:");
        String correo = leerTexto();
        System.out.println("Contraseña:");
        String contraseña = leerTexto();

        Empleado emp = (Empleado) cinemax.getEmpleados().get(correo);
        if (emp == null || !emp.getContraseña().equals(contraseña)) {
            System.out.println("Credenciales inválidas");
            return;
        }

        int op;
        do {
            System.out.println("--- Menú Empleado ---");
            System.out.println("1. Crear película");
            System.out.println("2. Crear función");
            System.out.println("3. Cambiar hora de función");
            System.out.println("0. Volver");
            op = leerEntero();

            if (op == 1) {
                crearPelicula(emp);
            } else if (op == 2) {
                crearFuncion(emp);
            } else if (op == 3) {
                cambiarHora(emp);
            }
        } while (op != 0);
    }

    private void crearPelicula(Empleado emp) throws Exception {
        System.out.println("Tipo: 1.Largometraje  2.Documental  3.Animada");
        int tipo = leerEntero();
        System.out.println("Título:"); String titulo = leerTexto();
        System.out.println("Género:"); String genero = leerTexto();
        System.out.println("Duración (min):"); int duracion = leerEntero();
        System.out.println("Clasificación:"); String clasificacion = leerTexto();
        System.out.println("Edad mínima:"); int edad = leerEntero();
        System.out.println("Fecha estreno:"); String fecha = leerTexto();
        System.out.println("Director:"); String director = leerTexto();
        System.out.println("Actores (separados por coma):"); 
        String[] actoresArr = leerTexto().split(",");
        List<String> actores = Arrays.asList(actoresArr);

        System.out.println("Nombre del cine:");
        String nombreCine = leerTexto();
        Cine cine = cinemax.getCines().get(nombreCine);
        if (cine == null) { System.out.println("Cine no encontrado"); return; }

        if (tipo == 1) {
            emp.nuevoLargometraje(titulo, genero, duracion, clasificacion, edad, fecha, director, actores, cine);
        } else if (tipo == 2) {
            System.out.println("Temática:"); String tematica = leerTexto();
            System.out.println("Narrador:"); String narrador = leerTexto();
            emp.nuevoDocumental(titulo, genero, duracion, clasificacion, edad, fecha, director, actores, tematica, narrador, cine);
        } else if (tipo == 3) {
            System.out.println("Técnica animación:"); String tecnica = leerTexto();
            emp.nuevaPeliculaAnimada(titulo, genero, duracion, clasificacion, edad, fecha, director, actores, tecnica, cine);
        }
        System.out.println("Película creada!");
    }

    private void crearFuncion(Empleado emp) throws Exception {
        System.out.println("Nombre del cine:"); 
        String nombreCine = leerTexto();
        Cine cine = cinemax.getCines().get(nombreCine);
        if (cine == null) { System.out.println("Cine no encontrado"); return; }

        System.out.println("Número de sala:"); 
        int numSala = leerEntero();
        Sala sala = cine.getSalas().get(numSala);
        if (sala == null) { System.out.println("Sala no encontrada"); return; }

        System.out.println("Fecha (dd/mm/aaaa):"); String fecha = leerTexto();
        System.out.println("Hora (hh:mm):"); String hora = leerTexto();

        if (sala.getFunciones().containsKey(fecha) && sala.getFunciones().get(fecha).containsKey(hora)) {
            System.out.println("Ya existe una función en esa fecha y hora");
            return;
        }

        System.out.println("Precio boleta:"); int precio = leerEntero();
        if (precio <= 0) { System.out.println("Precio inválido"); return; }

        System.out.println("Películas disponibles:");
        for (Pelicula p : cine.getPeliculas()) {
            System.out.println("- " + p.getTitulo());
        }
        System.out.println("Título de la película:"); String tituloPeli = leerTexto();
        Pelicula pelicula = cine.buscarPelicula(tituloPeli);
        if (pelicula == null) { System.out.println("Película no encontrada"); return; }

        emp.nuevaFuncion(sala, fecha, hora, precio, pelicula);
        System.out.println("Función creada!");
    }

    private void cambiarHora(Empleado emp) throws Exception {
        System.out.println("Nombre del cine:"); 
        String nombreCine = leerTexto();
        Cine cine = cinemax.getCines().get(nombreCine);
        if (cine == null) { System.out.println("Cine no encontrado"); return; }

        System.out.println("Número de sala:"); 
        int numSala = leerEntero();
        Sala sala = cine.getSalas().get(numSala);
        if (sala == null) { System.out.println("Sala no encontrada"); return; }

        System.out.println("Fecha de la función (dd/mm/aaaa):"); 
        String fecha = leerTexto();
        if (!sala.getFunciones().containsKey(fecha)) { System.out.println("No hay funciones en esa fecha"); return; }

        System.out.println("Hora actual (hh:mm):"); 
        String hora = leerTexto();
        Funcion funcion = sala.buscarFuncionFechaHora(fecha, hora);
        if (funcion == null) { System.out.println("Función no encontrada"); return; }

        System.out.println("Nueva hora (hh:mm):"); 
        String nuevaHora = leerTexto();
        emp.cambiarHoraFuncion(funcion, nuevaHora);
        System.out.println("Hora actualizada!");
    }
    /// Menú cliente
    
    private void menuCliente(String correo, String contraseña) throws Exception {
        Cliente cliente = (Cliente) cinemax.getClientes().get(correo);
        if (cliente == null || !cliente.getContraseña().equals(contraseña)) {
            throw new Exception("Credenciales inválidas");
        }

        int op;
        do {
            System.out.println("--- Menú Cliente ---");
            System.out.println("1. Comprar boletas");
            System.out.println("2. Ver mis transacciones");
            System.out.println("0. Volver");
            op = leerEntero();

            if (op == 1) {
                comprarBoletas(cliente);
            } else if (op == 2) {
                cliente.imprimirTransacciones();
            }
        } while (op != 0);
    }

    private void comprarBoletas(Cliente cliente) throws Exception {
        verFunciones();
        
        System.out.println("Nombre del cine:"); 
        String nombreCine = leerTexto();
        Cine cine = cinemax.getCines().get(nombreCine);
        if (cine == null) { System.out.println("Cine no encontrado"); return; }

        System.out.println("Número de sala:"); 
        int numSala = leerEntero();
        Sala sala = cine.getSalas().get(numSala);
        if (sala == null) { System.out.println("Sala no encontrada"); return; }

        System.out.println("Fecha (dd/mm/aaaa):"); 
        String fecha = leerTexto();
        if (!sala.getFunciones().containsKey(fecha)) { System.out.println("No hay funciones en esa fecha"); return; }

        System.out.println("Hora (hh:mm):"); 
        String hora = leerTexto();
        Funcion funcion = sala.buscarFuncionFechaHora(fecha, hora);
        if (funcion == null) { System.out.println("No hay función a esa hora"); return; }

        System.out.println("Asientos ocupados: " + funcion.getAsientosOcupados().size() + "/" + sala.getCapacidad());
        System.out.println("Ingrese números de asientos separados por coma (ej: 1,2,3):");
        String[] nums = leerTexto().split(",");
        java.util.List<Integer> asientos = new java.util.ArrayList<>();
        try {
            for (String n : nums) asientos.add(Integer.parseInt(n.trim()));
        } catch (NumberFormatException e) {
            System.out.println("Formato de asientos inválido");
            return;
        }

        System.out.println("Tipo tarjeta (debito/credito):"); 
        String tarjeta = leerTexto();
        if (!tarjeta.equals("debito") && !tarjeta.equals("credito")) {
            System.out.println("Tipo de tarjeta inválido");
            return;
        }

        System.out.println("Fecha transacción (dd/mm/aaaa):"); 
        String fechaTrans = leerTexto();

        try {
            cliente.comprarBoletasFuncion(fechaTrans, asientos, funcion, tarjeta, sala);
            System.out.println("Compra exitosa! Total: $" + asientos.size() * funcion.getPrecioBoleta());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void verFunciones() {
        for (String nombreCine : cinemax.getCines().keySet()) {
            Cine cine = cinemax.getCines().get(nombreCine);
            System.out.println("=== " + nombreCine + " ===");
            for (int numSala : cine.getSalas().keySet()) {
                Sala sala = cine.getSalas().get(numSala);
                System.out.println("  Sala " + numSala + " (" + sala.getTipoTecnologia() + "):");
                for (String fecha : sala.getFunciones().keySet()) {
                    for (String hora : sala.getFunciones().get(fecha).keySet()) {
                        Funcion f = sala.getFunciones().get(fecha).get(hora);
                        System.out.println("    " + fecha + " " + hora + 
                            " - " + f.getPelicula().getTitulo() + 
                            " - $" + f.getPrecioBoleta());
                    }
                }
            }
        }
    }

    public int leerEntero() {
        int dato = 0;
        try {
            dato = Integer.parseInt(this.br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dato;
    }

    public String leerTexto() {
        String dato = "";
        try {
            dato = this.br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dato;
    }
    
	public static void main(String[] args) {
		new Principal();
	}

}
