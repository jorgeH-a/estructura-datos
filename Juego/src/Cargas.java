import java.util.Random;

public class Cargas {
	Random r=new Random();
	
	public void numCargas(ArrayList camara) {
		int cargas=0;
		int falsas=0;
		int verdaderas=0;
		int num=0;
		int contadorF=0;
		int contadorV=0;
		// falsas==0 y verdaderas==1
		cargas=r.nextInt(2, 9);
		System.out.println("Cargas");
		
		
		if(cargas==2) {
			camara.add(1);
			camara.add(0);
			verdaderas=1;
			falsas=1;
			
			
		}else {
			verdaderas=r.nextInt(1, cargas);
			falsas=cargas-verdaderas;
			for(int i=0;i<verdaderas;i++) {
				camara.add(1);
			}
			for(int i=0;i<falsas;i++) {
				camara.add(0);
			}
			
		}
		
		System.out.println(camara.toString());
		while(!camara.isEmpty()) {
			camara.remove(0);
		}
		
		while(camara.size()!=cargas) {
			num=r.nextInt(2);
			if(num==1&&verdaderas!=contadorV) {
				camara.add(1);
				contadorV++;
			}
			if(num==0&&falsas!=contadorF) {
				camara.add(0);
				contadorF++;
			}
				
		}
		
	}
	/*
	public void vidas(ArrayList vid,ArrayList camara) {	
	}
	*/
	
	
	
}

















