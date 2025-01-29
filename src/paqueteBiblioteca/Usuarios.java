package paqueteBiblioteca;

import java.util.Objects;

public class Usuarios {
	private int ID_usuario;
	private String Nombre;
	private String Apellidos;
	private int Telefono;
	private String Correo_electronico;
	private String Nombre_usuario;
	private String Contrasena;
	private String Contrasena2;
	private boolean empleado;
	private int Total_penalizaciones;
	private String foto_perfil;
	/**
	 * @param iD_usuario
	 * @param nombre
	 * @param apellidos
	 * @param telefono
	 * @param correo_electronico
	 * @param nombre_usuario
	 * @param contrasena
	 * @param contrasena2
	 * @param nUSS
	 * @param total_penalizaciones
	 * @param foto_perfil
	 */
	public Usuarios(int iD_usuario, String nombre, String apellidos, int telefono, String correo_electronico,
			String nombre_usuario, String contrasena, String contrasena2, boolean empleado, int total_penalizaciones,
			String foto_perfil) {
		super();
		ID_usuario = iD_usuario;
		Nombre = nombre;
		Apellidos = apellidos;
		Telefono = telefono;
		Correo_electronico = correo_electronico;
		Nombre_usuario = nombre_usuario;
		Contrasena = contrasena;
		Contrasena2 = contrasena2;
		this.empleado = empleado;
		Total_penalizaciones = total_penalizaciones;
		this.foto_perfil = foto_perfil;
	};
	public int getID_usuario() {
		return ID_usuario;
	}
	public void setID_usuario(int iD_usuario) {
		ID_usuario = iD_usuario;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellidos() {
		return Apellidos;
	}
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	public int getTelefono() {
		return Telefono;
	}
	public void setTelefono(int telefono) {
		Telefono = telefono;
	}
	public String getCorreo_electronico() {
		return Correo_electronico;
	}
	public void setCorreo_electronico(String correo_electronico) {
		Correo_electronico = correo_electronico;
	}
	public String getNombre_usuario() {
		return Nombre_usuario;
	}
	public void setNombre_usuario(String nombre_usuario) {
		Nombre_usuario = nombre_usuario;
	}
	public String getContrasena() {
		return Contrasena;
	}
	public void setContrasena(String contrasena) {
		Contrasena = contrasena;
	}
	public String getContrasena2() {
		return Contrasena2;
	}
	public void setContrasena2(String contrasena2) {
		Contrasena2 = contrasena2;
	}
	public boolean getempleado() {
		return empleado;
	}
	public void setNUSS(boolean empleado) {
		this.empleado = empleado;
	}
	public int getTotal_penalizaciones() {
		return Total_penalizaciones;
	}
	public void setTotal_penalizaciones(int total_penalizaciones) {
		Total_penalizaciones = total_penalizaciones;
	}
	public String getFoto_perfil() {
		return foto_perfil;
	}
	public void setFoto_perfil(String foto_perfil) {
		this.foto_perfil = foto_perfil;
	}
	@Override
	public String toString() {
		return "Usuarios [ID_usuario=" + ID_usuario + ", Nombre=" + Nombre + ", Apellidos=" + Apellidos + ", Telefono="
				+ Telefono + ", Correo_electronico=" + Correo_electronico + ", Nombre_usuario=" + Nombre_usuario
				+ ", Contrasena=" + Contrasena + ", Contrasena2=" + Contrasena2 + ", empleado=" + empleado
				+ ", Total_penalizaciones=" + Total_penalizaciones + ", foto_perfil=" + foto_perfil + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(Apellidos, Contrasena, Contrasena2, Correo_electronico, ID_usuario, empleado, Nombre,
				Nombre_usuario, Telefono, Total_penalizaciones, foto_perfil);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuarios other = (Usuarios) obj;
		return Objects.equals(Apellidos, other.Apellidos) && Objects.equals(Contrasena, other.Contrasena)
				&& Objects.equals(Contrasena2, other.Contrasena2)
				&& Objects.equals(Correo_electronico, other.Correo_electronico) && ID_usuario == other.ID_usuario
				&& empleado == other.empleado && Objects.equals(Nombre, other.Nombre)
				&& Objects.equals(Nombre_usuario, other.Nombre_usuario) && Telefono == other.Telefono
				&& Total_penalizaciones == other.Total_penalizaciones && Objects.equals(foto_perfil, other.foto_perfil);
	}
	public String EncriptarContraseña() {
		return Contrasena;
	}
	/**
	 * @param iD_usuario
	 * @param nombre
	 * @param apellidos
	 * @param telefono
	 * @param correo_electronico
	 * @param nombre_usuario
	 * @param contrasena
	 * @param contrasena2
	 * @param empleado
	 * @param total_penalizaciones
	 * @param foto_perfil
	 */

	
	
}	
