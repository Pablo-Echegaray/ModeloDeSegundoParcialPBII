package ar.edu.unlam.pb2;

public class Indumentaria extends Producto {

	String talle;
	String color;

	public Indumentaria(Integer id, String talle, String color, Double precio) {
		super(id, precio);
		this.talle = talle;
		this.color = color;
	}

	public String getTalle() {
		return talle;
	}

	public void setTalle(String talle) {
		this.talle = talle;
	}

	public String getColor() {
		return color;
	}
}
