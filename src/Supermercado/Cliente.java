 
package Supermercado;

import java.util.Scanner;

public class Cliente {
	
	private int id;
	private String nombre;
	private Producto [] carritoCompra;
	private boolean vip;
	
	public Cliente() {
		
	}
	
	public Cliente(int id, String nombre, boolean vip) {
		super();
		this.id = id;
		this.nombre = nombre;
		
		this.vip = vip;
	}
	public Cliente(int id, String nombre, Producto[] carritoCompra, boolean vip) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.carritoCompra = carritoCompra;
		this.vip = vip;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Producto[] getCarritoCompra() {
		return carritoCompra;
	}

	public void setCarritoCompra(Producto[] carritoCompra) {
		this.carritoCompra = carritoCompra;
	}

	public boolean isVip() {
		return vip;
	}

	public void setVip(boolean vip) {
		this.vip = vip;
	}
	
	public void aniadirProducto(Producto [] p) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Cuantos productos quieres? ");
		int valor = sc.nextInt();
		int cant = valor;
		int idx = 0;
		Producto [] miCarrito = new Producto[valor];
		for(int i = 0; i<p.length;i++) {
			System.out.println("Agregar producto al carrito? - " + p[i].getNombre() );
			String str = sc.next();
			if(cant > 0) {
				if(str.equalsIgnoreCase("si") && cant > 0) {
					miCarrito[idx] = p[i];
					idx++;
					cant--;	
				}if(cant == 0){
					System.out.println("Carrito lleno!!!");
					break;
				}
			}else {
				System.out.println("Carrito lleno!");
				break;
			}
		
		}
		this.carritoCompra = miCarrito;
	
	}
	
	public void mostrarCarrito() {
		System.out.println("El cliente " + this.getNombre() + " tiene: ");
		for(int i = 0; i<this.getCarritoCompra().length;i++) {
			System.out.println(this.getCarritoCompra()[i].getNombre());
		}
		System.out.println("~~~~~~~~~~~~");
	}
	
	public void factura() {
		System.out.print("El cliente " + this.getNombre() + " debe: ");
		int result = 0;
		for(int i = 0; i<this.getCarritoCompra().length;i++) {
			result += this.getCarritoCompra()[i].getPrecio();
		}
		System.out.println(result + " euros.");
	}

	
//public Cliente [] aniadirProductos(Producto [] p) {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		Cliente c1 = new Cliente(001,"cesar",true);
//		Cliente c2 = new Cliente(002,"fabi",false);
//
//		Cliente [] clientes = {c1,c2};
//		
//		for(int i = 0; i<clientes.length;i++) {
//			
//			System.out.println("Cliente " + clientes[i].getNombre() + " cuantos productos quieres?");
//			int cant = sc.nextInt();
//			Producto [] prod  = new Producto[cant];
//			int tamanio = cant;
//			int idx = 0;
//			
//			for(int j = 0; j<p.length;j++) {		
//				if(tamanio > 0) {
//				System.out.println("Te gustaria añadir: " + p[j].getNombre() + " ?");
//				String valor = sc.next();		
//					if(valor.equalsIgnoreCase("s")) {										
//							prod[idx] = p[j];
//							tamanio--;
//							idx++;
//					}				
//				}else{
//					System.out.println("CARRO LLENO!!");
//					break;
//				}				
//			}
//			clientes[i].setCarritoCompra(prod);
//		}
//				
//		return clientes;
//	}

//public void mostrarCarrito(Cliente [] c) {
//	
//	for(int i = 0; i<c.length;i++) {
//		System.out.print("Carrito de " + c[i].getNombre() + ": ");
//		for(int j = 0; j<c[i].getCarritoCompra().length;j++) {
//			
//			System.out.print(c[i].getCarritoCompra()[j].getNombre() + " - ");
//		}
//		System.out.println("");
//	}
//}

//public void facturas(Cliente [] c) {
//	
//	int result = 0;
//	int [] clientes = new int[c.length];
//	for(int i = 0; i<c.length;i++) {
//		
//		for(int j = 0; j<c[i].getCarritoCompra().length;j++) {
//			result += c[i].getCarritoCompra()[j].getPrecio();
//		
//		}
//		clientes[i] = result; 
//		System.out.println("El cliente: "+ c[i].getNombre() + " debe: " + result);
//		result = 0;
//	}
//}	
	
}
