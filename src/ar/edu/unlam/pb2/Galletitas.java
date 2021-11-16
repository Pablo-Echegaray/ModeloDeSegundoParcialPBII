package ar.edu.unlam.pb2;

public class Galletitas extends Comestible {

	// (1, "Cerealitas", "22/06/2021", "31/01/2022", "Arcor", 120.0)

	private String descripcion;
	private String marca;


	public Galletitas(Integer id, String descripcion, String fechaDeElaboracion, String fechaDeVencimiento,
			String marca, Double precio) {
		super(id, fechaDeElaboracion, fechaDeVencimiento, precio);

		this.descripcion = descripcion;
		this.marca = marca;

	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marcaString) {
		this.marca = marcaString;
	}

	

}
