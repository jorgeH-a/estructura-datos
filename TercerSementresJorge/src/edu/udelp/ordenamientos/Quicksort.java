package edu.udelp.ordenamientos;

import java.util.Random;



public class Quicksort {
	static Random aleatorio=new Random();
	static int[] desarreglo=new int[100];
	static LinkedList arreglo=new LinkedList();

	public static LinkedList ordenar(int[] desarreglo) {
		ordenar(desarreglo,0,desarreglo.length-1);
		for(int i=0;i<desarreglo.length;i++) {
			arreglo.add(desarreglo[i]);
		}
		
		
		return arreglo;
	}

	private static void ordenar(int[] desarreglo, int inicio, int fin) {
		if (inicio<fin) {
			int num;
			int pivote=desarreglo[inicio];
			int i=inicio+1;

			for (int j=inicio;j<=fin;j++) {
				if (desarreglo[j]<pivote) {
					num=desarreglo[i];
					desarreglo[i]=desarreglo[j];
					desarreglo[j]=num;
					i++;
				}
			}
			num=pivote;
			desarreglo[inicio]=desarreglo[i-1];
			desarreglo[i-1]=num;

			ordenar(desarreglo,inicio,i-1);
			ordenar(desarreglo,i,fin);
			
		}
		
	}

	public static int[] arreglo() {
		for (int i = 0; i < desarreglo.length; i++) {

			desarreglo[i] = aleatorio.nextInt(100);
		}
		return desarreglo;
	}

	public String toString() {
		String s = "";

		for (int i = 0; i < desarreglo.length; i++) {
			s = s + ", " + desarreglo[i];

		}
		return s;
	}

}
