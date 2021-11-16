package ar.edu.unlam.interfaz;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import ar.edu.unlam.pb2.Carne;
import ar.edu.unlam.pb2.Galletitas;
import ar.edu.unlam.pb2.Heladera;
import ar.edu.unlam.pb2.Producto;
import ar.edu.unlam.pb2.ProductoInexistente;
import ar.edu.unlam.pb2.ProductoSinStock;
import ar.edu.unlam.pb2.Remera;
import ar.edu.unlam.pb2.Supermercado;
import ar.edu.unlam.pb2.Televisor;
import ar.edu.unlam.pb2.Zapatilla;

public class MainSupermercado {

	public static void main(String[] args) {
		final Integer PRODUCTO_A_COMPRAR_1 = 1;
		final Integer PRODUCTO_A_COMPRAR_2 = 2;

		Supermercado vital = new Supermercado("Vital");

		vital.ingresarProducto(new Galletitas(1, "Cerealitas", "22/06/2021", "31/01/2022", "Arcor", 120.0));
		vital.ingresarProducto(new Galletitas(1, "Cerealitas", "22/06/2021", "31/01/2022", "Arcor", 120.0));
		vital.ingresarProducto(new Carne(2, "Tapa de nalga", "07/07/2021", "15/07/2021", 2.0, "La Estancia", 600.0));
		vital.ingresarProducto(new Televisor(3, "Serie Dorada", 42, 12, "Samsung", 200000.0));
		vital.ingresarProducto(new Heladera(4, "Nuevo Modelo", true, 12, "Samsung", 150000.0));
		vital.ingresarProducto(new Remera(5, "Básica", "XL", "Lacoste", "Azul", 2000.0));
		vital.ingresarProducto(new Zapatilla(6, "De running", "42", "Nike", "Blancas", 5000.0));
		vital.ingresarProducto(new Zapatilla(7, "Diarias", "45", "Topper", "Blancas", 2500.0));
		vital.ingresarProducto(new Televisor(8, "3D", 75, 12, "LG", 500000.0));
		vital.ingresarProducto(new Remera(9, "Básica", "L", "Lacoste", "Azul", 2000.0));
		vital.ingresarProducto(new Remera(9, "Básica", "M", "Lacoste", "Roja", 2000.0));
		vital.ingresarProducto(new Remera(9, "Básica", "S", "Lacoste", "Roja", 2000.0));
		vital.ingresarProducto(new Galletitas(10, "Oreo", "05/05/2021", "30/03/2022", "Arcor", 150.0));
		
		Integer numeroDeVenta = vital.registrarNuevaVenta(28923812, "Camila Ganzo");
		Boolean agrego1=false;
		Boolean agrego2=false;
		try {
		 vital.agregarAlCarrito(numeroDeVenta, PRODUCTO_A_COMPRAR_1);
		 vital.agregarAlCarrito(numeroDeVenta, PRODUCTO_A_COMPRAR_2);
		}catch(ProductoSinStock e) {
			e.getMessage();
		}catch (ProductoInexistente e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
		
		Double importeDeLaCompra = vital.getVenta(numeroDeVenta).getImporte();
		
		List<Producto> productos = new ArrayList<>();
		productos = vital.getProductosDisponibles();
		
		for (Producto producto : productos) {
			System.out.println(producto.getId());
		}
		
		productos = vital.getVenta(numeroDeVenta).getCarritoDeCompras();
		
		for (Producto producto : productos) {
			System.out.println(producto.getPrecio());
		}
		
		System.out.println(vital.getVenta(numeroDeVenta).getNombreDelComprador());
		try {
		System.out.println(vital.getProductoPorCodigo(PRODUCTO_A_COMPRAR_2).getPrecio());
		}
	catch(ProductoSinStock e) {
		e.getMessage();
	}
		
		List <Producto> productosDisponibles = new ArrayList<>();
		productosDisponibles = vital.getProductosDisponibles();
		
		Set<Producto> productosExistentes = new HashSet<>();
		productosExistentes = vital.getOfertaDeProductos();
		
		for(Producto producto : productosDisponibles) {
			System.out.println(producto.getId());
		}
		System.out.println("**************************************************************");
		for(Producto producto : productosExistentes) {
			System.out.println(producto.getId());
		}
	}
	
	

}
