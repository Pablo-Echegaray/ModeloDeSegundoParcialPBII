package ar.edu.unlam.pb2;

public class Zapatilla extends Indumentaria {

	// (6, "De running", 42, "Nike", "Blancas", 5000.0)

	String descripcion;
	String marca;

	Double precio;

	public Zapatilla(Integer id, String descripcion, String talle, String marca, String color, Double precio) {
		// TODO Auto-generated constructor stub
		super(id, talle, color);

		this.descripcion = descripcion;
		this.marca = marca;
		this.precio = precio;
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

	@Override
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

}
