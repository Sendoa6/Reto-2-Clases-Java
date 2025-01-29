package paqueteBiblioteca;

public class Bajo extends Tipos_penalizaciones {

	public Bajo(int iD_tipo, String nombre_tipo, String motivo, String castigo) {
		super(iD_tipo, nombre_tipo, motivo, castigo);
		// TODO Auto-generated constructor stub
	}
	
	public void Penalizar() {
		System.out.println("Devolver un libro levemente roto");
	}
}
