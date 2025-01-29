package paqueteBiblioteca;

public class Muy_alta extends Tipos_penalizaciones {

	public Muy_alta(int iD_tipo, String nombre_tipo, String motivo, String castigo) {
		super(iD_tipo, nombre_tipo, motivo, castigo);
		// TODO Auto-generated constructor stub
	}

	public void Penalizar() {
		System.out.println("No devolver un libro");
	}
}
