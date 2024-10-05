package edu.udelp.banco;

import java.util.Random;

public class UsuariosBanco {
	
	Random r=new Random();

	public void agregarPersonas(LinkedQueue usuariosCuenta,LinkedQueue usuariosSinCuenta) {
		
		Thread t1=new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				boolean tonoto;
				int i=1;
				
				do {
					tonoto=r.nextBoolean();

					try {
						Thread.sleep(700);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("Fila: ");
					
					if(tonoto) {
						usuariosCuenta.enqueue("HumanoCuenta"+i);
					}else {
						usuariosSinCuenta.enqueue("HumanoSinCuenta"+i);
					}
					
					
					System.out.println(usuariosCuenta.toString());
					System.out.println(usuariosSinCuenta.toString());
					
					i++;
					
				}while(usuariosCuenta.size()!=20&&usuariosSinCuenta.size()!=20);
			}
			
		});
		
				t1.start();

			
try {
	t1.sleep(2300);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	


}
