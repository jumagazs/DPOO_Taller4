package usuarios;

public abstract class Usuario {
	
	private String correoElectronico;
	private String contraseña;
	
	public Usuario(String correoElectronico,String contraseña) {
		this.contraseña  = contraseña;
		this.correoElectronico = correoElectronico;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public String getContraseña() {
		return contraseña;
	}
	
	

}
