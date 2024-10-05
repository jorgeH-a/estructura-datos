package edu.udelp.banco;
import java.util.Random;
public class MainBanco {
	static LinkedQueue billetes1000=new LinkedQueue();
	static LinkedQueue billetes500=new LinkedQueue();
	static LinkedQueue billetes200=new LinkedQueue();
	static LinkedQueue billetes100=new LinkedQueue();
	static LinkedQueue monedas20=new LinkedQueue();
	static LinkedQueue monedas10=new LinkedQueue();
	static LinkedQueue monedas5=new LinkedQueue();
	static LinkedQueue monedas2=new LinkedQueue();
	static LinkedQueue monedas1=new LinkedQueue();
	static LinkedQueue monedasPunto5=new LinkedQueue();
	static boolean reDe;
	static int contador;
	static int caja=1;
	static LinkedQueue usuariosCuenta=new LinkedQueue();
	static LinkedQueue usuariosSinCuenta=new LinkedQueue();
	static int si=0;
	static Random r=new Random();
	static String persona=null;
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		/*
		String[] numbers = {"1000", "500", "042"};
		int randomIndex = r.nextInt(numbers.length);
		 String randomNumber = numbers[randomIndex];
		 System.out.println("Número aleatorio: " + randomNumber);
		 System.out.println(randomIndex);
		 */
		 UsuariosBanco funcion=new UsuariosBanco();
		DineroBanco funcion1=new DineroBanco();
		 
		 funcion1.estadoInicial(billetes1000,billetes500,billetes200 ,billetes100 ,monedas20 ,monedas10
				,monedas5 ,monedas2 ,monedas1 , monedasPunto5);
		System.out.println("Bienvenidos al Banco:"
					+ "\nLas personas con cuenta seran atendidas con mas prisa, las personas sin cuenta seran atendidas sin tanta prisa"
					+ "\nSolo se aceptaran los depositos o retiros de maximo 10,000$");
			try {
				Thread.sleep(800);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		do {
			
			
			funcion.agregarPersonas(usuariosCuenta,usuariosSinCuenta);
			
			
			Thread t1=new Thread(new Runnable() {

				@Override
				public void run() {
					// TODO Auto-generated method stub
					do {
			
			contador=r.nextInt(10);
		
			if(contador<=7) {
				reDe=true;
			}else {
				reDe=false;
			}
			if(reDe) {
				
				persona=String.valueOf(usuariosCuenta.dequeue()) ;
			}else {
				persona=String.valueOf(usuariosSinCuenta.dequeue()) ;
			}
			
			
			
			
		
		reDe=r.nextBoolean();
		if(persona!="null") {
			if(caja==1) {
				System.out.println();
				System.out.println("Caja 1:");
			if(reDe) {
			funcion1.retirarDinero(billetes1000, billetes500, billetes200, billetes100, monedas20, monedas10, monedas5, monedas2, monedas1, monedasPunto5,persona);
		}else {
			funcion1.depositarDinero(billetes1000, billetes500, billetes200, billetes100, monedas20, monedas10, monedas5, monedas2, monedas1, monedasPunto5,persona);
		}
			caja=2;
		}else if(caja==2) {
			System.out.println();
			System.out.println("Caja 2:");
			if(reDe) {
				funcion1.retirarDinero(billetes1000, billetes500, billetes200, billetes100, monedas20, monedas10, monedas5, monedas2, monedas1, monedasPunto5,persona);
			}else {
				funcion1.depositarDinero(billetes1000, billetes500, billetes200, billetes100, monedas20, monedas10, monedas5, monedas2, monedas1, monedasPunto5,persona);
			}
				caja=3;
		}else if(caja==3){
			System.out.println();
			System.out.println("Caja 3:");
			if(reDe) {
				funcion1.retirarDinero(billetes1000, billetes500, billetes200, billetes100, monedas20, monedas10, monedas5, monedas2, monedas1, monedasPunto5,persona);
			}else {
				funcion1.depositarDinero(billetes1000, billetes500, billetes200, billetes100, monedas20, monedas10, monedas5, monedas2, monedas1, monedasPunto5,persona);
			}
				caja=4;
		}else if(caja==4) {
			System.out.println();
			System.out.println("Caja 4:");
			if(reDe) {
				funcion1.retirarDinero(billetes1000, billetes500, billetes200, billetes100, monedas20, monedas10, monedas5, monedas2, monedas1, monedasPunto5,persona);
			}else {
				funcion1.depositarDinero(billetes1000, billetes500, billetes200, billetes100, monedas20, monedas10, monedas5, monedas2, monedas1, monedasPunto5,persona);
			}
				caja=1;
		}
		
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
			}while(!usuariosSinCuenta.isEmpty());
				}
			});
				
			t1.start();
			
			
		
		try {
			Thread.sleep(5333);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}while(si==0);
	
	}

}
