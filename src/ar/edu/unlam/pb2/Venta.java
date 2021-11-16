package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class Venta {

	private Integer dniDelComprador;
	private String nombreDelComprador;
	private Double importe;
	private List<Producto> carritoDeCompras;

	public Venta(Integer dniDelComprador, String nombreDelComprador) {
		this.dniDelComprador = dniDelComprador;
		this.nombreDelComprador = nombreDelComprador;
		this.importe = 0.0;
		this.carritoDeCompras= new ArrayList<>();

	}
	
	
	public List<Producto> getCarritoDeCompras(){
		return this.carritoDeCompras;
	}
	public void ingresarCompra(Producto producto) {
		//carritoDeCompras.add(producto);
		carritoDeCompras.add(producto);
		
	}
	
	private Double calcularImporte() {
		Double precio = 0.0;
		for (Producto producto : carritoDeCompras) {
			precio += producto.getPrecio();
		}
		
		this.importe = precio;
		return precio;
	}
	
	public Double getImporte() {
		return calcularImporte();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dniDelComprador == null) ? 0 : dniDelComprador.hashCode());
		result = prime * result + ((nombreDelComprador == null) ? 0 : nombreDelComprador.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Venta other = (Venta) obj;
		if (dniDelComprador == null) {
			if (other.dniDelComprador != null)
				return false;
		} else if (!dniDelComprador.equals(other.dniDelComprador))
			return false;
		if (nombreDelComprador == null) {
			if (other.nombreDelComprador != null)
				return false;
		} else if (!nombreDelComprador.equals(other.nombreDelComprador))
			return false;
		return true;
	}


	public Integer getDniDelComprador() {
		return dniDelComprador;
	}


	public void setDniDelComprador(Integer dniDelComprador) {
		this.dniDelComprador = dniDelComprador;
	}


	public String getNombreDelComprador() {
		return nombreDelComprador;
	}


	public void setNombreDelComprador(String nombreDelComprador) {
		this.nombreDelComprador = nombreDelComprador;
	}
	
	
	

}
