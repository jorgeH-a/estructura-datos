import java.util.Random;


public class Preguntas {
	
	public void preguntaUno() {
		LinkedList arreglo=new LinkedList();
		Random aleatorio=new Random();
		for(int i=0;i<50;i++){
			arreglo.add(aleatorio.nextInt(100));
			
		}
		System.out.println(arreglo.toString());
		media(arreglo);
		moda(arreglo);
		mediana(arreglo);
		
	}
	public void media(LinkedList arreglo) {
		int suma=0;
		double total=0;
		for(int i=0;i<arreglo.size();i++) {
			suma+=(int)arreglo.get(i);
		}
		
		System.out.println("Suma: "+suma);
		System.out.println( "Media: "+(total=(double)suma/arreglo.size()));
		
		
	}
	public void moda(LinkedList arreglo) {
		int moda=0;
		int contador=0;
		int contadorAnterior=0;
		for(int i=0;i<arreglo.size();i++) {
			moda=(int)arreglo.get(i);
			for(int j=0;j<arreglo.size();i++) {
				if(moda==(int)arreglo.get(j)) {
					contador++;
					
				}
				
			}
			if(contadorAnterior<contador) {
				contadorAnterior=contador;
			}else {
				contadorAnterior=contadorAnterior;
				
			}
			
			
		}
		
		
	}
	
	public void mediana(LinkedList arreglo) {
		int mediana=arreglo.size()/2;
		System.out.println("Mediana: "+arreglo.get(mediana-1));
		
		
	}
	
	public void preguntaDos() {
		LinkedQueue desarreglo=new LinkedQueue();
		LinkedList arreglo=new LinkedList();
		Random aleatorio=new Random();
		int[] lista=new int[50];
		int numero=0;
		int contador=0;
		for(int i=0;i<50;i++){
			desarreglo.enqueue(aleatorio.nextInt(50));
		}
		System.out.println(desarreglo.toString());
		for(int i=0;i<50;i++) {
			lista[i]=(int)desarreglo.dequeue();
		}
		for(int i=0;i<lista.length;i++) {
			numero=lista[i];
			contador=0;
			
			for(int j=0;j<lista.length;j++) {
				if(numero==lista[j]) {
					contador++;
				}
			}
			if(contador==1) {
					arreglo.add(numero);
			}
			
		}
		
		System.out.println("Numeros que no se repiten: "+arreglo.toString());
		
	}
	
	
	public void preguntaTres(String palabra) {
		LinkedList arreglo=new LinkedList();
		//amoraroma
		
	}
	
	
	
	public void preguntaCuatro() {
		
		LinkedQueue arreglo=new LinkedQueue();
		Random aleatorio=new Random();
		int contador25=0;
		int numero=0;
		for(int i=0;arreglo.size()<50;i++){
			numero=aleatorio.nextInt(50);
			arreglo.enqueue(numero);
			if(numero==25) {
				System.out.println(arreglo.toString());
				arreglo.dequeue();
				arreglo.dequeue();
				arreglo.dequeue();
				
				contador25++;
				
			}
		}
		
		System.out.println(arreglo.toString());
		System.out.println("El numero 25 se repitio: "+contador25);
		
	}



}


















