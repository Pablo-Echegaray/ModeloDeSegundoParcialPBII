package ar.edu.unlam.pb2;

public class Electrodomestico extends Producto {
	private Integer garantia;

	public Electrodomestico(Integer id, Integer garantia, Double precio) {
		super(id, precio);
		this.garantia = garantia;
	}

	public Integer getGarantia() {
		return garantia;
	}

	public void setGarantia(Integer garantia) {
		this.garantia = garantia;
	}

}
