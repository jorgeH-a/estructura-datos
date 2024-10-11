package edu.udelp.banco.prioridad;

import java.util.Random;





public class MainBancoPrioridad {
	static NumericPriorityQueue billetes1000=new NumericPriorityQueue();
	static NumericPriorityQueue billetes500=new NumericPriorityQueue();
	static NumericPriorityQueue billetes200=new NumericPriorityQueue();
	static NumericPriorityQueue billetes100=new NumericPriorityQueue();
	static NumericPriorityQueue monedas20=new NumericPriorityQueue();
	static NumericPriorityQueue monedas10=new NumericPriorityQueue();
	static NumericPriorityQueue monedas5=new NumericPriorityQueue();
	static NumericPriorityQueue monedas2=new NumericPriorityQueue();
	static NumericPriorityQueue monedas1=new NumericPriorityQueue();
	static NumericPriorityQueue monedasPunto5=new NumericPriorityQueue();
	static boolean reDe;
	static int contador;
	static int caja=1;
	
	static NumericPriorityQueue usuariosGeneral=new NumericPriorityQueue();
	static int si=0;
	static Random r=new Random();
	static String persona=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UsuariosBancoPrioridad funcion=new UsuariosBancoPrioridad();
		DineroBancoPrioridad funcion1=new DineroBancoPrioridad();

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
			funcion.agregarPersonas(usuariosGeneral);
			Thread t1=new Thread(new Runnable() {

				@Override
				public void run() {
					// TODO Auto-generated method stub
					do {

						

						persona=String.valueOf(usuariosGeneral.dequeue()) ;
						

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
								Thread.sleep(301);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
						
					}while(!usuariosGeneral.isEmpty());
				}
			});

			t1.start();
			try {
				Thread.sleep(5001);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			funcion1.estadoBanco(billetes1000, billetes500, billetes200, billetes100, monedas20, monedas10, monedas5, monedas2, monedas1, monedasPunto5);
			
		}while(si==0);
	}

}
