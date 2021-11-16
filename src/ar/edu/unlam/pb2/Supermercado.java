package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Supermercado {

	String nombre; // Nombre del supermercado
	private Set<Producto> productosExistentes; // Listado de productos que se comercializan
	private List<Producto> productosDisponibles; // Detalle de cada producto ingresado
	private Map<Integer, Venta> ventasRealizadas; // Listado de ventas realizadas (identificadas por el número de venta)
	private Integer contadorDeVentas; // Identificador del número de venta

	public Supermercado(String nombre) {
		this.nombre = nombre;
		this.productosExistentes = new HashSet<>();
		this.productosDisponibles = new ArrayList<>();
		this.ventasRealizadas = new TreeMap<>();
		this.contadorDeVentas= 0;
	}

	public List<Producto> getProductosDisponibles(){
		return this.productosDisponibles;
	}
	
	public void ingresarProducto(Producto nuevo) {
		// Ingresa un nuevo producto
		productosDisponibles.add(nuevo);
	}

	public Set<Producto> getOfertaDeProductos() {
		// Devuelve el conjunto de productos que se comercializan
//		for (Producto producto : productosDisponibles) {
//			productosExistentes.add(producto);
//		}
		productosExistentes.addAll(productosDisponibles);
		return productosExistentes;
	}

	public Integer getStock(Integer id) {
		// Devuelve la cantidad de unidades de un producto determinado
		Integer cantidad = 0;
		for (Producto producto : productosDisponibles) {
			if (producto.getId().equals(id)) {
				cantidad++;
			}
		}
		return cantidad;
	}

	private Boolean productoExiste(Integer id) throws ProductoInexistente {
		// Verifica si un producto existe
		Boolean existe = false;
		for (Producto producto : productosExistentes) {
			if (producto.getId().equals(id)) {
				existe = true;
				break;
			} 
		}
		return existe;
	}

	public Producto getProductoPorCodigo(Integer id) throws ProductoSinStock {
		// Busca la disponibilidad de un producto
		for (Producto producto : productosDisponibles) {
			if (producto.getId().equals(id)) {
				return producto;
			}
		}
		return null;
	}

	public Integer registrarNuevaVenta(Integer dniDelComprador, String nombreDelComprador)  {
		// Registra una nueva venta
		ventasRealizadas.put(++contadorDeVentas, new Venta(dniDelComprador, nombreDelComprador));
		return contadorDeVentas;
	}

	public Venta getVenta(Integer nroVenta) {
		// Devuelve una venta en función de su número identificatorio
		Venta venta = null;
		for (Integer nVenta : ventasRealizadas.keySet()) {
			if(nVenta.equals(nroVenta))
				venta = ventasRealizadas.get(nVenta);
			    break;
		}
		return venta;
	}

	//ProductoInexistente
	public void agregarAlCarrito(Integer numeroDeVenta, Integer codigoDeProducto)
			throws ProductoSinStock, ProductoInexistente{
		// Incorpora al carrito de compras de la venta identificada por el
		// "numeroDeVenta", el producto identificado por el "codigoDeProducto"
		Venta venta = getVenta(numeroDeVenta);
		Producto producto = null;
		Boolean existe=false;
		
		for(Producto producto2 : getOfertaDeProductos()) {
			if(!producto2.getId().equals(codigoDeProducto)) {
				existe = false;
			}
		}
		
		for (Producto prod : productosDisponibles) {
			 if(prod.getId().equals(codigoDeProducto)){
				 producto =  getProductoPorCodigo(codigoDeProducto);
				 existe = true;
				 
				 break;
			 }
		}
		
		
		
		if(!existe) {
			throw new ProductoInexistente();
		}else {
			venta.ingresarCompra(producto);
		}
		
		
		
		//return seAgrego=true;
	}

}
