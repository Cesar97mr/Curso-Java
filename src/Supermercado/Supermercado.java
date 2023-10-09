package Supermercado;

import java.util.Scanner;

public class Supermercado {
	
	private String nombre;
	private Cajera [] cajeras;
	
	public static void main(String[] args) {
		
		Cajera cj1 = new Cajera(111,"fatima");
		Cajera cj2 = new Cajera(222,"ruben");
		
		Cajera [] cajeras = {cj1,cj2};
	
		Supermercado sp  = new Supermercado();
		Producto [] productos = sp.abrirSuper();
		Cliente c1 = sp.generarCliente();
		
		c1.aniadirProducto(productos);
		c1.mostrarCarrito();
		c1.factura();
	
		
	}
	public Cliente generarCliente() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa el nombre del cliente: ");
		String name = sc.next();
		Cliente cli = new Cliente(001,name,false);
		
		return cli;
	}
	
//	public Cliente [] generarClientes(int cant) {
//		
//		Scanner sc = new Scanner(System.in);
//		int idx = 0;
//		Cliente [] clientes = new Cliente[cant];
//		
//		for(int i = 0; i<clientes.length; i++) {
//			
//			
//			System.out.println("Ingresa el nombre del cliente: " + i);
//			String name = sc.next();
//			idx++;
//			
//			Cliente cliente = new Cliente(idx,name,false);
//			clientes[i] = cliente;
//			
//		}
//		return clientes;
//	}
	public Producto [] abrirSuper() {
		Producto p1 = new Producto(01,"arroz", 3, "comida");
		Producto p2 = new Producto(02,"pimienta", 3, "especias");
		Producto p3 = new Producto(03,"ordenador", 3, "electro");
		Producto p4 = new Producto(04,"pescado", 3, "comida");
		Producto p5 = new Producto(05,"monitor", 3, "electro");
		Producto p6 = new Producto(06,"pasta", 3, "comida");
		
		Producto [] productos = {p1,p2,p3,p4,p5,p6};
		
		System.out.println("Bienvenido al SUPER, se han generado los siguientes productos");
		for(Producto p : productos) {
			System.out.println( p.getNombre() + " = " + p.getPrecio() + " euros");
		}
		return productos;
		
	}
}

