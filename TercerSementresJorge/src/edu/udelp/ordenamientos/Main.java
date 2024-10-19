package edu.udelp.ordenamientos;
import java.util.Random;

public class Main {
	
	static Quicksort funcion=new Quicksort();
	static Shellsort funcion1=new Shellsort();
	static BusquedaBinaria funcion2= new BusquedaBinaria();
	static int[] arreglo=new int[20];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Shellsort:");
		funcion1.arreglo();
		
		System.out.println(funcion1.toString());
		System.out.println(funcion1.ordenar());
		funcion2.busqueda(funcion1.ordenar());
		
		System.out.println();
		System.out.println();
		
		System.out.println("Quicksort:");
		arreglo=funcion.arreglo();
		
		System.out.println(funcion.toString());
		System.out.println(funcion.ordenar(arreglo));
		
		funcion2.busqueda(funcion.ordenar(arreglo));
		
		
	}
	
	
}
