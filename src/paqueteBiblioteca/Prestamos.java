package paqueteBiblioteca;

import java.util.Date;
import java.util.Objects;

public class Prestamos {
	

	class Ejemplar {
	    private int id_prestamo;
	    private Date fecha_prestamo;
	    private Date fecha_limite;
		private Date fecha_devolucion;
		private int id_usuario;
		private int id_ejemplar;
		private int id_penalizacion;
	
	    public Ejemplar(int id, Date fecha_prestamo, Date fecha_limite,Date fecha_devolucion, int id_usuario, int id_ejemplar, int id_penalizacion) {
	        this.id_prestamo = id;
	        this.fecha_prestamo = fecha_prestamo;
	        this.fecha_limite = fecha_limite;
	        this.fecha_devolucion = fecha_devolucion;
	        this.id_usuario = id_usuario;
	        this.id_ejemplar = id_ejemplar;
	        this.id_penalizacion = id_penalizacion;
	    }

		public int getId_prestamo() {
			return id_prestamo;
		}

		public void setId_prestamo(int id_prestamo) {
			this.id_prestamo = id_prestamo;
		}

		public Date getFecha_prestamo() {
			return fecha_prestamo;
		}

		public void setFecha_prestamo(Date fecha_prestamo) {
			this.fecha_prestamo = fecha_prestamo;
		}

		public Date getFecha_limite() {
			return fecha_limite;
		}

		public void setFecha_limite(Date fecha_limite) {
			this.fecha_limite = fecha_limite;
		}

		public Date getFecha_devolucion() {
			return fecha_devolucion;
		}

		public void setFecha_devolucion(Date fecha_devolucion) {
			this.fecha_devolucion = fecha_devolucion;
		}

		public int getId_usuario() {
			return id_usuario;
		}

		public void setId_usuario(int id_usuario) {
			this.id_usuario = id_usuario;
		}

		public int getId_ejemplar() {
			return id_ejemplar;
		}

		public void setId_ejemplar(int id_ejemplar) {
			this.id_ejemplar = id_ejemplar;
		}

		public int getId_penalizacion() {
			return id_penalizacion;
		}

		public void setId_penalizacion(int id_penalizacion) {
			this.id_penalizacion = id_penalizacion;
		}

		@Override
		public String toString() {
			return "Ejemplar [id_prestamo=" + id_prestamo + ", fecha_prestamo=" + fecha_prestamo + ", fecha_limite="
					+ fecha_limite + ", fecha_devolucion=" + fecha_devolucion + ", id_usuario=" + id_usuario
					+ ", id_ejemplar=" + id_ejemplar + ", id_penalizacion=" + id_penalizacion + "]";
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getEnclosingInstance().hashCode();
			result = prime * result + Objects.hash(fecha_devolucion, fecha_limite, fecha_prestamo, id_ejemplar,
					id_penalizacion, id_prestamo, id_usuario);
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
			Ejemplar other = (Ejemplar) obj;
			if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
				return false;
			return Objects.equals(fecha_devolucion, other.fecha_devolucion)
					&& Objects.equals(fecha_limite, other.fecha_limite)
					&& Objects.equals(fecha_prestamo, other.fecha_prestamo) && id_ejemplar == other.id_ejemplar
					&& id_penalizacion == other.id_penalizacion && id_prestamo == other.id_prestamo
					&& id_usuario == other.id_usuario;
		}

		private Prestamos getEnclosingInstance() {
			return Prestamos.this;
		}
	    
	
	}
}
