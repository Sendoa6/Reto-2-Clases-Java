package paqueteBiblioteca;

import java.util.Objects;

abstract class Tipos_penalizaciones {
	private int ID_tipo;
	private String Nombre_tipo;
	private String Motivo;
	private String Castigo;
	/**
	 * @param iD_tipo
	 * @param nombre_tipo
	 * @param motivo
	 * @param castigo
	 */
	//Constructor completo
	public Tipos_penalizaciones(int iD_tipo, String nombre_tipo, String motivo, String castigo) {
		super();
		ID_tipo = iD_tipo;
		Nombre_tipo = nombre_tipo;
		Motivo = motivo;
		Castigo = castigo;
	}
	@Override
	public String toString() {
		return "Tipos_penalizaciones [ID_tipo=" + ID_tipo + ", Nombre_tipo=" + Nombre_tipo + ", Motivo=" + Motivo
				+ ", Castigo=" + Castigo + "]";
	}
	public int getID_tipo() {
		return ID_tipo;
	}
	public void setID_tipo(int iD_tipo) {
		ID_tipo = iD_tipo;
	}
	public String getNombre_tipo() {
		return Nombre_tipo;
	}
	public void setNombre_tipo(String nombre_tipo) {
		Nombre_tipo = nombre_tipo;
	}
	public String getMotivo() {
		return Motivo;
	}
	public void setMotivo(String motivo) {
		Motivo = motivo;
	}
	public String getCastigo() {
		return Castigo;
	}
	public void setCastigo(String castigo) {
		Castigo = castigo;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Castigo, ID_tipo, Motivo, Nombre_tipo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tipos_penalizaciones other = (Tipos_penalizaciones) obj;
		return Objects.equals(Castigo, other.Castigo) && ID_tipo == other.ID_tipo
				&& Objects.equals(Motivo, other.Motivo) && Objects.equals(Nombre_tipo, other.Nombre_tipo);
	}
	public abstract void Penalizar ();
	
	
}
