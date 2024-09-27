package edu.udelp.dispensador;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer=new Scanner(System.in);
		String prodCoca="Coca";String prodFanta="Fanta";String prodSprite="Sprite";
		String prodSidral="Sidral";String prodSabritas="Sabritas";String prodDoritos="Doritos";
		String prodRuffles="Ruffles";String prodOreos="Oreos";String prodArcoiris="Arcoiris";
		String prodEmperador="Emperador";
		Dinero dinero=new Dinero();
		Productos productos=new Productos();
		int menu=1;
		int cantidad=0;
		int producto=0;
		int menu2=0;
		String productoElegido=null;
		//coca, fanta, sprite, sidral 17 pesos
		//sabritas, doritos, ruffles  12 pesos
		//oreos, arcoiris, emoerador  15 pesos
		
		
		
		
		productos.estadoInicialProductos();
		
		
		productos.imprimirEstado();
		
		
		
		do {
		
		
		
		
		System.out.println("\n");
		System.out.println("\n");
			System.out.println("Que producto quieres:"
					+ "\nA1: Coca Cola: precio 17"
					+ "\nA2: Fanta: precio 17"
					+ "\nA3: Sprite: precio 17"
					+ "\nA4: Sidral: precio 17"
					+ "\nB1: Sabritas: precio 12"
					+ "\nB2: Doritos: precio 12"
					+ "\nB3: Ruffles: precio 12"
					+ "\nC1: Oreos: precio 15"
					+ "\nC2: Arcoiris: precio 15"
					+ "\nC3: Emperador: precio 15"
					+ "\nD1: Imprimir estado"
					+ "\nD2: Reabastecer Producto"
					+ "\nD3: Reabastecer Dinero");

			productoElegido=leer.nextLine();

			if(productoElegido.contains("A1")) {
				productos.venderProducto(prodCoca);
				System.out.println("\n");
			}else if(productoElegido.contains("A2")) {
				productos.venderProducto(prodFanta);
				System.out.println("\n");
			}else if(productoElegido.contains("A3")) {
				productos.venderProducto(prodSprite);
				System.out.println("\n");
			}else if(productoElegido.contains("A4")) {
				productos.venderProducto(prodSidral);
				System.out.println("\n");
			}else if(productoElegido.contains("B1")) {
				productos.venderProducto(prodSabritas);
				System.out.println("\n");
			}else if(productoElegido.contains("B2")) {
				productos.venderProducto(prodDoritos);
				System.out.println("\n");
			}else if(productoElegido.contains("B3")) {
				productos.venderProducto(prodRuffles);
				System.out.println("\n");
			}else if(productoElegido.contains("C1")) {
				productos.venderProducto(prodOreos);
				System.out.println("\n");
			}else if(productoElegido.contains("C2")) {
				productos.venderProducto(prodArcoiris);
				System.out.println("\n");
			}else if(productoElegido.contains("C3")) {
				productos.venderProducto(prodEmperador);
				System.out.println("\n");
			}else if(productoElegido.contains("D1")) {
				productos.imprimirEstado();
				dinero.imprimirEstado();
				System.out.println("\n");
			}else if(productoElegido.contains("D2")) {
				System.out.println("Que producto quieres reabastecer:"
						+ "\n1: Coca Cola"
						+ "\n2: Fanta"
						+ "\n3: Sprite"
						+ "\n4: Sidral"
						+ "\n5: Sabritas"
						+ "\n6: Doritos"
						+ "\n7: Ruffles"
						+ "\n8: Oreos"
						+ "\n9: Arcoiris"
						+ "\n10: Emperador");
				producto=leer.nextInt();
				System.out.println("Cual es la cantidad del producto elegido que quieres agregar");
				cantidad=leer.nextInt();
				productos.reabastecerProducto(producto,cantidad );
			}else if(productoElegido.contains("D3")) {
				System.out.println("1 para sacar dinero"
						+ "\n2 para reabastecer dinero");
				menu2=leer.nextInt();
				System.out.println("Que tipo de moneda quieres reabastecer o sacar:"
						+ "\n10"
						+ "\n5"
						+ "\n2"
						+ "\n1"
						+ "\n.5");
				producto=leer.nextInt();
				System.out.println("Cual es la cantidad de monedas que quieres agregar o quitar");
				cantidad=leer.nextInt();
				productos.manipularDinero(menu,cantidad ,producto );
			}else{
				System.out.println("La opción no es valida, escoge bien");
			}

		}while(menu!=0);

		
		
		
		
		
	}

}
