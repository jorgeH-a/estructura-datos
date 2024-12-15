import java.util.Random;
public class Cosas {
	Random r=new Random();
	static Principal p=new Principal();
	public void medicinaExpirada(ArrayList vid, int ronda) {
		int num=0;
		num=r.nextInt(2);
		if(ronda==1) {
			if(num==0) {
				
				vid.add(1);
				vid.add(1);
			}
			if(num==1) {
				vid.remove(0);
			}
			while(vid.size()>5) {
				vid.remove(0);
			}
		}
		System.out.println("Vidas:");
		System.out.println(vid.toString());
	}
	
	public void inverter(ArrayList camara) {
		
		if((int)camara.get(0)==1) {
			camara.set(0, 0);
		}
		if((int)camara.get(0)==0) {
			camara.set(0, 1);
		}
		
	}
	
	public void cigarro(ArrayList vid, int ronda) {

		if(ronda==1) {
			vid.add(1);
			while(vid.size()>5) {
				vid.remove(0);
			}
		}
		System.out.println("Vidas:");
		System.out.println(vid.toString());

	}
	public void telefono(ArrayList camara) {
		int carga=0;
		
		if(camara.size()>2) {
			int num=r.nextInt(2,camara.size()+1);
			carga=(int)camara.get(num-1);
			System.out.println((int)camara.get(num-1));
			if(carga==0) {
				System.out.println("Carga falsa");
			}
			if(carga==1) {
				System.out.println("Carga activa");
			}
		}else {
			System.out.println("Que pena");
		}
		
		
	}
	public static void adrenalinaJugador(int elegir,String[]cosasJugador,String[]cosasDealer) {
		String eleccion=null;
		;
		if(null==cosasDealer[elegir-2]) {
			System.out.println("No hay que tomar aqui");
		}else {
			for(int i=0;i<cosasJugador.length;i++) {
				if(null==cosasJugador[i]) {
					cosasJugador[i]=cosasDealer[elegir-2];
					cosasDealer[elegir-2]=null;
					
				}
			}//fin for
			p.imprimirCosas(cosasJugador,cosasDealer);
		}
		
		
	}
	public static int adrenalinaDealer(int elegir,String[]cosasJugador,String[]cosasDealer) {
		String eleccion=null;
		int tt=0;
		if(null==cosasJugador[elegir-2]) {
			System.out.println("No hay que tomar aqui");
		}else {
			for(int i=0;i<cosasDealer.length;i++) {
				if(null==cosasDealer[i]) {
					cosasDealer[i]=cosasJugador[elegir-2];
					cosasJugador[elegir-2]=null;
					
				}
			}//fin for
			p.imprimirCosas(cosasJugador,cosasDealer);
		}
		
		return tt;
	}
	public void lupa(ArrayList camara) {
		
		System.out.println(camara.get(0));
		
	}
	
	public void beer(ArrayList camara) {
		
		System.out.println(camara.remove(0));
		
	}
	
	
	
}











