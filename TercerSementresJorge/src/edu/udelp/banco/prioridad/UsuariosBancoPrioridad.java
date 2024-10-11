package edu.udelp.banco.prioridad;

import java.util.Random;



public class UsuariosBancoPrioridad {
	Random r=new Random();

	public void agregarPersonas(NumericPriorityQueue usuariosGeneral) {

		Thread t1=new Thread(new Runnable() {

			@Override
			public void run() {
				
				 
				
				String[] tonoto1 = {"011", "022", "042",""};
				
				int i=1;

				do {
					
					
					String numeroAl = tonoto1[r.nextInt(tonoto1.length)];
					
					

					try {
						Thread.sleep(700);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("Fila: ");

					if(numeroAl.contains("042")) {
						usuariosGeneral.enqueue("HumanoCuenta"+numeroAl+" "+i,1);
					}else if(numeroAl.contains("022")) {
						usuariosGeneral.enqueue("HumanoCuenta"+numeroAl+" "+i,2);
					}else if(numeroAl.contains("011")) {
						usuariosGeneral.enqueue("HumanoCuenta"+numeroAl+" "+i,3);
					}else if(numeroAl.contains("")){
						usuariosGeneral.enqueue("HumanoSinCuenta"+" "+i,4);
					}
					
					System.out.println(usuariosGeneral.toString());
					
					
					i++;

				}while(usuariosGeneral.size()!=20);
			}

		});

		t1.start();
		try {
			t1.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
