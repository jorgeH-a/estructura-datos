package edu.udelp.dispensador;
import java.util.Scanner;
public class Dinero {
	QueueCircular diez=new QueueCircular(15);
	QueueCircular cinco=new QueueCircular(15);
	QueueCircular dos=new QueueCircular(15);
	QueueCircular uno=new QueueCircular(15);
	QueueCircular puntoCinco=new QueueCircular(15);
	double MONDIEZ=10;
	double MONCINCO=5;
	double MONDOS=2;
	double MONUNO=1;
	double MONPUNTOCINCO=.5;
	Scanner leer=new Scanner(System.in);
	//coca, fanta, sprite, sidral 17 pesos
	//sabritas, doritos, ruffles  12 pesos
	//oreos, arcoiris, emoerador  15 pesos
	
	public void estadoInicialDinero() {

		for(int i=0;i<7;i++) {
			diez.enqueue(MONDIEZ);
			cinco.enqueue(MONCINCO);
			dos.enqueue(MONDOS);
			uno.enqueue(MONUNO);
			puntoCinco.enqueue(MONPUNTOCINCO);	
		}
	}

	public void cambioDineroUS() {
		int sumaMonedas=0;
		double moneda=0;
		double faltante=0;
		int META=17;
		int i=0;
		String[] cambioDiez=new String[15];
		String[] cambioCinco=new String[15];
		String[] cambioDos=new String[15];
		String[] cambioUno=new String[15];
		String[] cambioPuntoCinco=new String[15];
		String totalDiez="";String totalCinco="";String totalDos="";String totalUno="";String totalPuntoCinco="";
			
			//aqui ira la suma de monedas para luego devolver el cambio
		while(sumaMonedas<META) {
			System.out.println("Vas "+sumaMonedas+"/"+META);
			moneda=leer.nextDouble();
			if(moneda==MONDIEZ||moneda==MONCINCO||moneda==MONDOS||moneda==MONUNO||moneda==MONPUNTOCINCO) {
			if(moneda==MONDIEZ) {
				if(!diez.isFull()) {
					diez.enqueue(moneda);
					sumaMonedas+=moneda;
				}else {
					System.out.println("No hay espacio para este tipo de monedas");
				}
				
			}
			if(moneda==MONCINCO) {
				if(!cinco.isFull()) {
					cinco.enqueue(moneda);
					sumaMonedas+=moneda;
				}else {
					System.out.println("No hay espacio para este tipo de monedas");
				}
				
			}
			if(moneda==MONDOS) {
				if(!dos.isFull()) {
					dos.enqueue(moneda);
					sumaMonedas+=moneda;
				}else {
					System.out.println("No hay espacio para este tipo de monedas");
				}
				
			}
			if(moneda==MONUNO) {
				if(!uno.isFull()) {
					uno.enqueue(moneda);
					sumaMonedas+=moneda;
				}else {
					System.out.println("No hay espacio para este tipo de monedas");
				}
				
			}
			if(moneda==MONPUNTOCINCO) {
				if(!puntoCinco.isFull()) {
					puntoCinco.enqueue(moneda);
					sumaMonedas+=moneda;
				}else {
					System.out.println("No hay espacio para este tipo de monedas");
				}
				
			}
			
			
			}else {
				System.out.println("Moneda no permitida, solo se pueden monedas de 10, 5, 2, 1, .5");
			}
			
			
		}//fin ciclo while
		
		
		
		System.out.println("Vas "+sumaMonedas+"/"+META);
		if(sumaMonedas==META) {
			System.out.println("Cantidad exacta, gracias por su compra");
		}
		
		
		if(sumaMonedas>META) {
			do{
				
				faltante=sumaMonedas-META;
				System.out.println(faltante);
				while(faltante-MONDIEZ>=0) {
					faltante=faltante-MONDIEZ;
					cambioDiez[i]=","+diez.dequeue();
					i++;
				}
				i=0;
				while(faltante-MONCINCO>=0) {
					faltante=faltante-MONCINCO;
					cambioCinco[i]=","+cinco.dequeue();
					i++;
				}
				i=0;
				while(faltante-MONDOS>=0) {
					faltante=faltante-MONDOS;
					cambioDos[i]=","+dos.dequeue();
					i++;
				}
				i=0;
				while(faltante-MONUNO>=0) {
					faltante=faltante-MONUNO;
					cambioUno[i]=","+uno.dequeue();
					i++;
				}
				i=0;
				while(faltante-MONPUNTOCINCO>=0) {
					faltante=faltante-MONPUNTOCINCO;
					cambioPuntoCinco[i]=","+puntoCinco.dequeue();
					i++;
				}
				
				
				
			}while(faltante!=0);
			
			for(int j=0;j<cambioDiez.length;j++) {
				if(cambioDiez[j]!=null) {
				totalDiez=totalDiez+cambioDiez[j];
			}
				
			}
			System.out.println("Cambio monedas 10:"+totalDiez);
			for(int j=0;j<cambioCinco.length;j++) {
				if(cambioCinco[j]!=null) {
					totalCinco=totalCinco+cambioCinco[j];
					
				}
			}
			System.out.println("Cambio monedas 5:"+totalCinco);
			for(int j=0;j<cambioDos.length;j++) {
				if(cambioDos[j]!=null) {
					totalDos=totalDos+cambioDos[j];
					
				}
			}
			System.out.println("Cambio monedas 2:"+totalDos);
			for(int j=0;j<cambioUno.length;j++) {
				if(cambioUno[j]!=null) {
					totalUno=totalUno+cambioUno[j];
					
				}
			}
			System.out.println("Cambio monedas 1:"+totalUno);
			for(int j=0;j<cambioPuntoCinco.length;j++) {
				if(cambioPuntoCinco[j]!=null) {
					totalPuntoCinco=totalPuntoCinco+cambioPuntoCinco[j];
					
				}
			}
			
				System.out.println("Cambio monedas .5:"+totalPuntoCinco);
			
			
		}
		
		
		
	}
	public void cambioDineroUC() {
		int sumaMonedas=0;
		double moneda=0;
		double faltante=0;
		int META=15;
		int i=0;
		String[] cambioDiez=new String[15];
		String[] cambioCinco=new String[15];
		String[] cambioDos=new String[15];
		String[] cambioUno=new String[15];
		String[] cambioPuntoCinco=new String[15];
		String totalDiez="";String totalCinco="";String totalDos="";String totalUno="";String totalPuntoCinco="";
			
			//aqui ira la suma de monedas para luego devolver el cambio
		while(sumaMonedas<META) {
			System.out.println("Vas "+sumaMonedas+"/"+META);
			moneda=leer.nextDouble();
			
			if(moneda==MONDIEZ||moneda==MONCINCO||moneda==MONDOS||moneda==MONUNO||moneda==MONPUNTOCINCO) {
			if(moneda==MONDIEZ) {
				if(!diez.isFull()) {
					diez.enqueue(moneda);
					sumaMonedas+=moneda;
				}else {
					System.out.println("No hay espacio para este tipo de monedas");
				}
				
			}
			if(moneda==MONCINCO) {
				if(!cinco.isFull()) {
					cinco.enqueue(moneda);
					sumaMonedas+=moneda;
				}else {
					System.out.println("No hay espacio para este tipo de monedas");
				}
				
			}
			if(moneda==MONDOS) {
				if(!dos.isFull()) {
					dos.enqueue(moneda);
					sumaMonedas+=moneda;
				}else {
					System.out.println("No hay espacio para este tipo de monedas");
				}
				
			}
			if(moneda==MONUNO) {
				if(!uno.isFull()) {
					uno.enqueue(moneda);
					sumaMonedas+=moneda;
				}else {
					System.out.println("No hay espacio para este tipo de monedas");
				}
				
			}
			if(moneda==MONPUNTOCINCO) {
				if(!puntoCinco.isFull()) {
					puntoCinco.enqueue(moneda);
					sumaMonedas+=moneda;
				}else {
					System.out.println("No hay espacio para este tipo de monedas");
				}
				
			}
			
			
			}else {
				System.out.println("Moneda no permitida, solo se pueden monedas de 10, 5, 2, 1, .5");
			}
			
			
		}//fin ciclo while
		
		
		
		System.out.println("Vas "+sumaMonedas+"/"+META);
		if(sumaMonedas==META) {
			System.out.println("Cantidad exacta, gracias por su compra");
		}
		
		
		if(sumaMonedas>META) {
			do{
				
				faltante=sumaMonedas-META;
				System.out.println(faltante);
				while(faltante-MONDIEZ>=0) {
					faltante=faltante-MONDIEZ;
					cambioDiez[i]=","+diez.dequeue();
					i++;
				}
				i=0;
				while(faltante-MONCINCO>=0) {
					faltante=faltante-MONCINCO;
					cambioCinco[i]=","+cinco.dequeue();
					i++;
				}
				i=0;
				while(faltante-MONDOS>=0) {
					faltante=faltante-MONDOS;
					cambioDos[i]=","+dos.dequeue();
					i++;
				}
				i=0;
				while(faltante-MONUNO>=0) {
					faltante=faltante-MONUNO;
					cambioUno[i]=","+uno.dequeue();
					i++;
				}
				i=0;
				while(faltante-MONPUNTOCINCO>=0) {
					faltante=faltante-MONPUNTOCINCO;
					cambioPuntoCinco[i]=","+puntoCinco.dequeue();
					i++;
				}
				
				
				
			}while(faltante!=0);
			
			for(int j=0;j<cambioDiez.length;j++) {
				if(cambioDiez[j]!=null) {
				totalDiez=totalDiez+cambioDiez[j];
			}
				
			}
			System.out.println("Cambio monedas 10:"+totalDiez);
			for(int j=0;j<cambioCinco.length;j++) {
				if(cambioCinco[j]!=null) {
					totalCinco=totalCinco+cambioCinco[j];
					
				}
			}
			System.out.println("Cambio monedas 5:"+totalCinco);
			for(int j=0;j<cambioDos.length;j++) {
				if(cambioDos[j]!=null) {
					totalDos=totalDos+cambioDos[j];
					
				}
			}
			System.out.println("Cambio monedas 2:"+totalDos);
			for(int j=0;j<cambioUno.length;j++) {
				if(cambioUno[j]!=null) {
					totalUno=totalUno+cambioUno[j];
					
				}
			}
			System.out.println("Cambio monedas 1:"+totalUno);
			for(int j=0;j<cambioPuntoCinco.length;j++) {
				if(cambioPuntoCinco[j]!=null) {
					totalPuntoCinco=totalPuntoCinco+cambioPuntoCinco[j];
					
				}
			}
			
				System.out.println("Cambio monedas .5:"+totalPuntoCinco);
			
			
		}
		
		
		
	}
	public void cambioDineroUD() {
		int sumaMonedas=0;
		double moneda=0;
		double faltante=0;
		int META=12;
		int i=0;
		String[] cambioDiez=new String[15];
		String[] cambioCinco=new String[15];
		String[] cambioDos=new String[15];
		String[] cambioUno=new String[15];
		String[] cambioPuntoCinco=new String[15];
		String totalDiez="";String totalCinco="";String totalDos="";String totalUno="";String totalPuntoCinco="";
			
			//aqui ira la suma de monedas para luego devolver el cambio
		while(sumaMonedas<META) {
			System.out.println("Vas "+sumaMonedas+"/"+META);
			moneda=leer.nextDouble();
			if(moneda==MONDIEZ||moneda==MONCINCO||moneda==MONDOS||moneda==MONUNO||moneda==MONPUNTOCINCO) {
			if(moneda==MONDIEZ) {
				if(!diez.isFull()) {
					diez.enqueue(moneda);
					sumaMonedas+=moneda;
				}else {
					System.out.println("No hay espacio para este tipo de monedas");
				}
				
			}
			if(moneda==MONCINCO) {
				if(!cinco.isFull()) {
					cinco.enqueue(moneda);
					sumaMonedas+=moneda;
				}else {
					System.out.println("No hay espacio para este tipo de monedas");
				}
				
			}
			if(moneda==MONDOS) {
				if(!dos.isFull()) {
					dos.enqueue(moneda);
					sumaMonedas+=moneda;
				}else {
					System.out.println("No hay espacio para este tipo de monedas");
				}
				
			}
			if(moneda==MONUNO) {
				if(!uno.isFull()) {
					uno.enqueue(moneda);
					sumaMonedas+=moneda;
				}else {
					System.out.println("No hay espacio para este tipo de monedas");
				}
				
			}
			if(moneda==MONPUNTOCINCO) {
				if(!puntoCinco.isFull()) {
					puntoCinco.enqueue(moneda);
					sumaMonedas+=moneda;
				}else {
					System.out.println("No hay espacio para este tipo de monedas");
				}
				
			}
			
			
			}else {
				System.out.println("Moneda no permitida, solo se pueden monedas de 10, 5, 2, 1, .5");
			}
			
			
		}//fin ciclo while
		
		
		
		System.out.println("Vas "+sumaMonedas+"/"+META);
		if(sumaMonedas==META) {
			System.out.println("Cantidad exacta, gracias por su compra");
		}
		
		
		if(sumaMonedas>META) {
			do{
				
				faltante=sumaMonedas-META;
				System.out.println(faltante);
				while(faltante-MONDIEZ>=0) {
					faltante=faltante-MONDIEZ;
					cambioDiez[i]=","+diez.dequeue();
					i++;
				}
				i=0;
				while(faltante-MONCINCO>=0) {
					faltante=faltante-MONCINCO;
					cambioCinco[i]=","+cinco.dequeue();
					i++;
				}
				i=0;
				while(faltante-MONDOS>=0) {
					faltante=faltante-MONDOS;
					cambioDos[i]=","+dos.dequeue();
					i++;
				}
				i=0;
				while(faltante-MONUNO>=0) {
					faltante=faltante-MONUNO;
					cambioUno[i]=","+uno.dequeue();
					i++;
				}
				i=0;
				while(faltante-MONPUNTOCINCO>=0) {
					faltante=faltante-MONPUNTOCINCO;
					cambioPuntoCinco[i]=","+puntoCinco.dequeue();
					i++;
				}
				
				
				
			}while(faltante!=0);
			
			for(int j=0;j<cambioDiez.length;j++) {
				if(cambioDiez[j]!=null) {
				totalDiez=totalDiez+cambioDiez[j];
			}
				
			}
			System.out.println("Cambio monedas 10:"+totalDiez);
			for(int j=0;j<cambioCinco.length;j++) {
				if(cambioCinco[j]!=null) {
					totalCinco=totalCinco+cambioCinco[j];
					
				}
			}
			System.out.println("Cambio monedas 5:"+totalCinco);
			for(int j=0;j<cambioDos.length;j++) {
				if(cambioDos[j]!=null) {
					totalDos=totalDos+cambioDos[j];
					
				}
			}
			System.out.println("Cambio monedas 2:"+totalDos);
			for(int j=0;j<cambioUno.length;j++) {
				if(cambioUno[j]!=null) {
					totalUno=totalUno+cambioUno[j];
					
				}
			}
			System.out.println("Cambio monedas 1:"+totalUno);
			for(int j=0;j<cambioPuntoCinco.length;j++) {
				if(cambioPuntoCinco[j]!=null) {
					totalPuntoCinco=totalPuntoCinco+cambioPuntoCinco[j];
					
				}
			}
			
				System.out.println("Cambio monedas .5:"+totalPuntoCinco);
			
			
		}
		
		
		
	}
	
	
	
	public void manipularDinero(int menu,int cantidad, int moneda) {
		int sacar=0;
		switch(menu) {
		case 1:
			//Sacar dinero
			for(int i=0;i<=cantidad;i++) {
				if(MONDIEZ==moneda) {
					if(!diez.isEmpty()) {
						diez.dequeue();
					}else {
						sacar=1;
						break;
					}
				
			}else if(MONCINCO==moneda) {
				if(!cinco.isEmpty()) {
					cinco.dequeue();
				}else {
					sacar=1;
					break;
				}
				
			}else if(MONDOS==moneda) {
				if(!dos.isEmpty()) {
					dos.dequeue();
				}else {
					sacar=1;
					break;
				}
				
			}else if(MONUNO==moneda) {
				if(!uno.isEmpty()) {
					uno.dequeue();
				}else {
					sacar=1;
					break;
				}
				
			}else if(MONPUNTOCINCO==moneda) {
				if(!puntoCinco.isEmpty()) {
					puntoCinco.dequeue();
				}else {
					sacar=1;
					break;
				}
				
			}else {
				System.out.println("Moneda no permitida");
			}
			}
			if(sacar==1) {
				System.out.println("Ya no hay mas monedas de este tipo");
			}
			
			break;
		case 2:
			//Agregar dinero
			for(int i=0;i<=cantidad;i++) {
				if(MONDIEZ==moneda) {
					if(!diez.isFull()) {
						diez.enqueue(MONDIEZ);
					}else {
						sacar=1;
						break;
					}
				
			}else if(MONCINCO==moneda) {
				if(!cinco.isFull()) {
					cinco.enqueue(MONCINCO);
				}else {
					sacar=1;
					break;
				}
				
			}else if(MONDOS==moneda) {
				if(!dos.isFull()) {
					dos.enqueue(MONDOS);
				}else {
					sacar=1;
					break;
				}
				
			}else if(MONUNO==moneda) {
				if(!uno.isFull()) {
					uno.enqueue(MONUNO);
				}else {
					sacar=1;
					break;
				}
				
			}else if(MONPUNTOCINCO==moneda) {
				if(!puntoCinco.isFull()) {
					puntoCinco.enqueue(MONPUNTOCINCO);
				}else {
					sacar=1;
					break;
				}
				
			}
			}
			if(sacar==1) {
				System.out.println("Esta llenp");
			}
			
			
			break;
		default:
				System.out.println("Escoge bien");
				break;
		}
		
		imprimirEstado();
	}
	
	
	
	
	
	
	
	
	
	
	
	public void imprimirEstado() {
		
		System.out.println(diez.toString());
		System.out.println(cinco.toString());
		System.out.println(dos.toString());
		System.out.println(uno.toString());
		System.out.println(puntoCinco.toString());
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
