package ar.edu.unlam.pb2;

public class Televisor extends Electrodomestico {

	// (3, "Serie Dorada", 42, 12, "Samsung", 200000.0)

	private String descripcion;
	private Integer pulgadas;
	private String marca;
	private Double precio;

	public Televisor(Integer id, String descripcion, Integer pulgadas, Integer garantia, String marca, Double precio) {
		super(id, garantia, precio);

		this.descripcion = descripcion;
		this.pulgadas = pulgadas;
		this.marca = marca;

	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(Integer pulgadas) {
		this.pulgadas = pulgadas;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	

}
