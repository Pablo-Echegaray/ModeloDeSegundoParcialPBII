package ar.edu.unlam.pb2;

public class Heladera extends Electrodomestico {
	// (4, "Nuevo Modelo", true, 12, "Samsung", 150000.0)
	private String descripcion;
	private Boolean frost = false;
	private String marca;
	private Double precio;

	public Heladera(Integer id, String descripcion, Boolean frost, Integer garantia, String marca, Double precio) {
		super(id, garantia, precio);
		this.descripcion = descripcion;
		this.frost = frost;
		this.marca = marca;
	

	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Boolean isNoFrost() {
		return frost;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	

}
