package paqueteBiblioteca;

import java.util.Objects;

class Ejemplar {
    private int id_ejemplar;
    private String estadoFisico;
    private String tituloLibro;

    public Ejemplar(int id, String estadoFisico, String tituloLibro) {
        this.id_ejemplar = id;
        this.estadoFisico = estadoFisico;
        this.tituloLibro = tituloLibro;
    }

    public int getId() {
        return id_ejemplar;
    }

    public void setId(int id) {
        this.id_ejemplar = id;
    }

    public String getEstadoFisico() {
        return estadoFisico;
    }

    public void setEstadoFisico(String estadoFisico) {
        this.estadoFisico = estadoFisico;
    }

    public String getTituloLibro() {
        return tituloLibro;
    }

    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }

	@Override
	public String toString() {
		return "Ejemplar [id_ejemplar=" + id_ejemplar + ", Estado Fisico=" + estadoFisico + ", Titulo Libro="
				+ tituloLibro + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(estadoFisico, id_ejemplar, tituloLibro);
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
		return Objects.equals(estadoFisico, other.estadoFisico) && id_ejemplar == other.id_ejemplar
				&& Objects.equals(tituloLibro, other.tituloLibro);
	}
}
