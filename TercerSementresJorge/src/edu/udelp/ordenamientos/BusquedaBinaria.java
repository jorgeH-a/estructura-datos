package edu.udelp.ordenamientos;
import java.util.Random;

public class BusquedaBinaria {
	static Random aleatorio=new Random();
	public static void busqueda(LinkedList arreglo) {
		boolean val=false;
		int numElegido=(int) arreglo.get(aleatorio.nextInt(arreglo.size()));
		int num=(int) Math.ceil(((double)((arreglo.size())/2)/2));
		int numEncontrado=0;
		int fin=(arreglo.size()-1)/2;
		int inicio=0;
		
		System.out.println("Numero elegido "+numElegido);
		do {
			if(numElegido<(int)arreglo.get(num)) {
				
				fin=num;
				num=(int) Math.ceil(((double)(num/2)));
				
			}else if(numElegido>(int)arreglo.get(num)) {
				
				inicio=num;
				num=fin;
				num=(int)Math.ceil(((double)((inicio+num)/2)));
				
			}else if(numElegido==(int)arreglo.get(num)) {
				val=true;
				numEncontrado=num;
			}
			
			
		}while(val!=true);
		System.out.println("El indice va de 0 a la longitud de la lista");
		System.out.println("Numero encontrado en el indice: "+numEncontrado);
	}
}