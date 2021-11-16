package ar.edu.unlam.pb2;

public class Carne extends Comestible {

	private String descripcion;
	private String marca;
	
	private Double kilos;
	//(2, "Tapa de nalga", "07/07/2021", "15/07/2021", 2.0, "La Estancia", 600.0)

	public Carne(Integer id, String descripcion, String fechaDeElaboracion, String fechaDeVencimiento, Double kilos,
			String marca, Double precio) {
		super(id, fechaDeElaboracion, fechaDeVencimiento, precio);

		this.descripcion = descripcion;
		this.marca = marca;
		
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

	

	public Double getKilos() {
		return kilos;
	}

}
