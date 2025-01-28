package paqueteBiblioteca;

class Ejemplar {
    private int id;
    private String estadoFisico;
    private String tituloLibro;

    public Ejemplar(int id, String estadoFisico, String tituloLibro) {
        this.id = id;
        this.estadoFisico = estadoFisico;
        this.tituloLibro = tituloLibro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
