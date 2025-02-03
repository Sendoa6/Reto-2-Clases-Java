package paqueteBiblioteca;

import java.util.Date;
import java.util.Objects;

public class Penalizacion {
	

	class ejemplar {
		private int id_penalizacion;
    	private Date fecha_inicio;
    	private int id_tipo;
    	private int id_prestamo;
    	private Date fecha_fin;
	
    	public ejemplar(int id_penalizacion, Date fecha_inicio, int id_tipo, int id_prestamo, Date fecha_fin) {
        	this.id_penalizacion = id_penalizacion;
        	this.fecha_inicio = fecha_inicio;
        	this.id_tipo = id_tipo;
        	this.id_prestamo = id_prestamo;
        	this.fecha_fin = fecha_fin;
	    }

		public int getId_penalizacion() {
			return id_penalizacion;
		}

		public void setId_penalizacion(int id_penalizacion) {
			this.id_penalizacion = id_penalizacion;
		}

		public Date getFecha_inicio() {
			return fecha_inicio;
		}

		public void setFecha_inicio(Date fecha_inicio) {
			this.fecha_inicio = fecha_inicio;
		}

		public int getId_tipo() {
			return id_tipo;
		}

		public void setId_tipo(int id_tipo) {
			this.id_tipo = id_tipo;
		}

		public int getId_prestamo() {
			return id_prestamo;
		}

		public void setId_prestamo(int id_prestamo) {
			this.id_prestamo = id_prestamo;
		}

		public Date getFecha_fin() {
			return fecha_fin;
		}

		public void setFecha_fin(Date fecha_fin) {
			this.fecha_fin = fecha_fin;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getEnclosingInstance().hashCode();
			result = prime * result + Objects.hash(fecha_fin, fecha_inicio, id_penalizacion, id_prestamo, id_tipo);
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			ejemplar other = (ejemplar) obj;
			if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
				return false;
			return Objects.equals(fecha_fin, other.fecha_fin) && Objects.equals(fecha_inicio, other.fecha_inicio)
					&& id_penalizacion == other.id_penalizacion && id_prestamo == other.id_prestamo
					&& id_tipo == other.id_tipo;
		}

		private Penalizacion getEnclosingInstance() {
			return Penalizacion.this;
		}

		@Override
		public String toString() {
			return "ejemplar [id_penalizacion=" + id_penalizacion + ", fecha_inicio=" + fecha_inicio + ", id_tipo="
					+ id_tipo + ", id_prestamo=" + id_prestamo + ", fecha_fin=" + fecha_fin + "]";
		}


    }
}
