package paqueteBiblioteca;

import java.util.Objects;

class Autor {
		    private int id_autor;
		    private String nombre;
		    private String apellidos;

		    public Autor(int id, String nombre, String apellidos) {
		        this.id_autor = id;
		        this.nombre = nombre;
		        this.apellidos = apellidos;
		    }

		    public int getId() {
		        return id_autor;
		    }

		    public void setId(int id) {
		        this.id_autor = id;
		    }

		    public String getNombre() {
		        return nombre;
		    }

		    public void setNombre(String nombre) {
		        this.nombre = nombre;
		    }

		    public String getApellidos() {
		        return apellidos;
		    }

		    public void setApellidos(String apellidos) {
		        this.apellidos = apellidos;
		    }

			@Override
			public String toString() {
				return "Autor [id_autor=" + id_autor + ", nombre=" + nombre + ", apellidos=" + apellidos + "]";
			}

			@Override
			public int hashCode() {
				return Objects.hash(apellidos, id_autor, nombre);
			}

			@Override
			public boolean equals(Object obj) {
				if (this == obj)
					return true;
				if (obj == null)
					return false;
				if (getClass() != obj.getClass())
					return false;
				Autor other = (Autor) obj;
				return Objects.equals(apellidos, other.apellidos) && id_autor == other.id_autor
						&& Objects.equals(nombre, other.nombre);
			}
	}


