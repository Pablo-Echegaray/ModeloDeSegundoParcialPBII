package ar.edu.unlam.pb2;

public class Carne extends Comestible {

	private String descripcion;
	private String marca;
	private Double precio;
	private Double kilos;

	public Carne(Integer id, String descripcion, String fechaDeElaboracion, String fechaDeVencimiento, Double kilos,
			String marca, Double precio) {
		super(id, fechaDeElaboracion, fechaDeVencimiento);

		this.descripcion = descripcion;
		this.marca = marca;
		this.precio = precio;
		this.kilos = kilos;
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

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Double getKilos() {
		return kilos;
	}

}
