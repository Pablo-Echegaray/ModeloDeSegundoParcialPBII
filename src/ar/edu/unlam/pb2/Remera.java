package ar.edu.unlam.pb2;

public class Remera extends Indumentaria {

	// (5, "Básica", "XL", "Lacoste", "Azul", 2000.0)

	String descripcion;
	String marca;

	Double precio;

	public Remera(Integer id, String descripcion, String talle, String marca, String color, Double precio) {
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

	@Override
	public String getTalle() {
		return talle;
	}

	@Override
	public void setTalle(String talle) {
		this.talle = talle;
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
