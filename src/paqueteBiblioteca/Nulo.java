package paqueteBiblioteca;

public class Nulo extends Tipos_penalizaciones {

	public Nulo(int iD_tipo, String nombre_tipo, String motivo, String castigo) {
		super(iD_tipo, nombre_tipo, motivo, castigo);
		// TODO Auto-generated constructor stub
	}
	
	public void Penalizar() {
		System.out.println("No hay penalización por este prestamo");
	}
	
}
