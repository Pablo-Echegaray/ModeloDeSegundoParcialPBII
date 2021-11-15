package ar.edu.unlam.pb2;

public class ProductoInexistente extends Exception {

	public ProductoInexistente() {
		super("El producto ingresado no existe");
	}

}
