package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Supermercado {

	String nombre; // Nombre del supermercado
	private Set<Producto> productosExistentes; // Listado de productos que se comercializan
	private List<Producto> productosDisponibles; // Detalle de cada producto ingresado
	private Map<Integer, Venta> ventasRealizadas; // Listado de ventas realizadas (identificadas por el número de venta)
	Integer contadorDeVentas; // Identificador del número de venta

	public Supermercado(String nombre) {
		this.nombre = nombre;
		this.productosExistentes = new HashSet<>();
		this.productosDisponibles = new ArrayList<>();
	}

	public void ingresarProducto(Producto nuevo) {
		// Ingresa un nuevo producto
		productosDisponibles.add(nuevo);
	}

	public Set<Producto> getOfertaDeProductos() {
		// Devuelve el conjunto de productos que se comercializan
		for (Producto producto : productosDisponibles) {
			productosExistentes.add(producto);
		}
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
			} else {
				throw new ProductoInexistente();
			}
		}
		return existe;
	}

	private Producto getProductoPorCodigo(Integer id) throws ProductoSinStock {
		// Busca la disponibilidad de un producto
		for (Producto producto : productosDisponibles) {
			if (producto.getId().equals(id))
				return producto;
			throw new ProductoSinStock();
		}
		return null;
	}

	public Integer registrarNuevaVenta(Integer dniDelComprador, String nombreDelComprador) {
		// Registra una nueva venta
		ventasRealizadas.put(++contadorDeVentas, new Venta(dniDelComprador, nombreDelComprador));
		return contadorDeVentas;
	}

	public Venta getVenta(Integer nueroDeVenta) {
		// Devuelve una venta en función de su número identificatorio
		return null;
	}

	public void agregarAlCarrito(Integer numeroDeVenta, Integer codigoDeProducto)
			throws ProductoSinStock, ProductoInexistente {
		// Incorpora al carrito de compras de la venta identificada por el
		// "numeroDeVenta", el producto identificado por el "codigoDeProducto"
	}

}
