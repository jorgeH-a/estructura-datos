import java.util.Scanner;
import java.util.Random;
public class Principal {
	static Scanner leer=new Scanner(System.in);
	static Random r=new Random();
	static Cargas f=new Cargas();
	static Cosas s=new Cosas();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int menu=0;
		//vidas representadas por un 1
		do {
			ArrayList camara=new ArrayList();
		ArrayList vidJugador=new ArrayList();
		ArrayList vidDealer=new ArrayList();
			
int ganadorJ=0;int detenerD=0;
int ganadorD=0;
		int esposasJugador=0;int esposasDealer=0;
		int eleccion=9;int conT=0;
		int disparo=9;
		boolean turn=true;

		int cosaJ=0;
		int cosaD=0;
		String palabrasCosas[]= {"MedicinaExpirada","Inverter","Cigarro","Telefono","Adrenalina","Lupa","Beer","Serrucho","Esposas"};
		/*
		String med="medicinaExpirada";String inv="inverter";String cig="cigarro";String tel="telefono";String ad="adrenalina";
		String lupa="lupa";String beer="beer";String ser="serrucho";String esp="esposas";
		 */
		String cosasJugador[]=new String[8];
		String cosasDealer[]=new String[8];

		System.out.println("Bienvenido jugador"
				+ "\nCon 0 te disparas, con 1 al dealer"
				+ "\nLos 1´s representan las balas activas"
				+ "\nLos 0´s representan las balas de fogeo"
				+ "\nDel 2 al 9, para elegir objetos");
		System.out.println("Objetos:"
				+ "\nMedicina Expirada: Puede curar 2 vidas o puede quitar 1 vida, 50% de probabilidad"
				+ "\nInverter: Puede Invertir la carga de la camara"
				+ "\nCigarro: Cura 1 de vida"
				+ "\nTelefono: Puede ver el tipo de carga al azar de la camara"
				+ "\nAdrenalina: Puede robar cualquier objeto del contrincante"
				+ "\nLupa: Puede ver el tipo de carga actual de la camara"
				+ "\nBeer: Elimina la carga actual de la camara"
				+ "\nSerrucho: La carga actual si esta activa hace el doble de daño"
				+ "\nEsposas: Elimina el turno del contrincante");
		System.out.println("Solo se puden poner numeros del 0 al 9, asi que no pongan numeros de mas de 10");
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ronda1(vidJugador,vidDealer);
		do {
			cosaJ=0;
			turn=true;
			conT=0;
			esposasJugador=0;
			System.out.println("Vidas dealer:");
			System.out.println(vidDealer.toString());
			System.out.println("Vidas jugador:");
			System.out.println(vidJugador.toString());
			imprimirCosas(cosasJugador,cosasDealer);
			recargar(camara,palabrasCosas,cosasJugador,cosasDealer);
			if(esposasDealer!=2) {

				System.out.println("Turno Jugador");
				System.out.println("Del 2 al 9, para elegir objetos"
						+ "\n0 y 1 para disparar");
				//aqui va si elige un objeto o no
				eleccion=leer.nextInt();
				while(eleccion>1) {

					cosaJ=elegirCosaJugador(eleccion,cosasJugador,cosasDealer,vidJugador,1,camara);
					if(cosaJ==2) {
						esposasJugador=cosaJ;
						cosaJ=0;
					}
					
					recargar(camara,palabrasCosas,cosasJugador,cosasDealer);
					System.out.println("Turno Jugador");
					eleccion=leer.nextInt();
				}

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				while(eleccion==0&&turn==true){
					if(conT!=0) {
						imprimirCosas(cosasJugador,cosasDealer);
						recargar(camara,palabrasCosas,cosasJugador,cosasDealer);

						System.out.println("Turno Jugador");
						eleccion=leer.nextInt();
						while(eleccion>1) {
							;
							cosaJ=elegirCosaJugador(eleccion,cosasJugador,cosasDealer,vidJugador,1,camara);
							if(cosaJ==2) {
								esposasJugador=cosaJ;
								cosaJ=0;
							}
							
							recargar(camara,palabrasCosas,cosasJugador,cosasDealer);

							System.out.println("Turno Jugador");
							eleccion=leer.nextInt();
						}
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						if(eleccion==1) {
							break;
						}
					}
					disparo=disparar(camara);
					if(1==disparo) {
						if(cosaJ==0) {
							vidJugador.remove(0);
							System.out.println("Vidas jugador:");
							System.out.println(vidJugador.toString());
						}

						if(cosaJ==1) {
							vidJugador.remove(0);
							vidJugador.remove(0);
							System.out.println("Vidas jugador:");
							System.out.println(vidJugador.toString());
						}
						turn=false;
					}
					if(0==disparo) {
						System.out.println("Vidas jugador:");
						System.out.println(vidJugador.toString());

						turn=true;
					}
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					conT++;

				}
				if(eleccion==1) {
					disparo=disparar(camara);
					if(1==disparo) {

						if(cosaJ==0) {
							vidDealer.remove(0);
							System.out.println("Vidas dealer:");
							System.out.println(vidDealer.toString());
						}
						if(cosaJ==1) {
							vidDealer.remove(0);
							vidDealer.remove(0);
							System.out.println("Vidas dealer:");
							System.out.println(vidDealer.toString());
						}

					}
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
			}
			if(vidJugador.size()==0||vidDealer.size()==0) {
				if(vidJugador.size()==0) {
					ganadorD=1;
				}
				if(vidDealer.size()==0) {
					ganadorJ=1;
				}
				break;
			}
			esposasDealer=0;
			cosaD=0;
			imprimirCosas(cosasJugador,cosasDealer);
			recargar(camara,palabrasCosas,cosasJugador,cosasDealer);
			if(esposasJugador!=2) {

				System.out.println("Turno Dealer");
				//aqui va si elige un objeto o no
				eleccion=r.nextInt(2, 11)-2;
				System.out.println(eleccion);
				while(eleccion>1) {

					cosaD=elegirCosaDealer(eleccion,cosasJugador,cosasDealer,vidDealer,1,camara);
					if(cosaD==2) {
						esposasDealer=cosaD;
						cosaD=0;
					}
					
					recargar(camara,palabrasCosas,cosasJugador,cosasDealer);

					System.out.println("Turno Dealer");
					if(detenerD<3) {
						eleccion=r.nextInt(2, 11)-2;
					}else {
						eleccion=r.nextInt(0, 2);
					}
					System.out.println(eleccion);
					detenerD++;
				}
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				conT=0;detenerD=0;
				turn=true;
				while(eleccion==0&&turn==true){
					if(conT!=0) {
						imprimirCosas(cosasJugador,cosasDealer);
						recargar(camara,palabrasCosas,cosasJugador,cosasDealer);

						System.out.println("Turno Dealer");

						eleccion=r.nextInt(2, 11)-2;
						System.out.println(eleccion);
						while(eleccion>1) {
							cosaD=elegirCosaDealer(eleccion,cosasJugador,cosasDealer,vidDealer,1,camara);
							if(cosaD==2) {
								esposasDealer=cosaD;
								cosaD=0;
							}
							
							recargar(camara,palabrasCosas,cosasJugador,cosasDealer);

							System.out.println("Turno Dealer");
							if(detenerD<3) {
								eleccion=r.nextInt(2, 11)-2;
							}else {
								eleccion=r.nextInt(0, 2);
							}
							System.out.println(eleccion);
						}
detenerD=0;
						try {
							Thread.sleep(2000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						if(eleccion==1) {
							break;
						}
					}
					disparo=disparar(camara);
					if(1==disparo) {
						if(cosaD==0) {
							vidDealer.remove(0);
							System.out.println("Vidas dealer:");
							System.out.println(vidDealer.toString());
						}
						if(cosaD==1) {
							vidDealer.remove(0);
							vidDealer.remove(0);
							System.out.println("Vidas dealer:");
							System.out.println(vidDealer.toString());
						}

						turn=false;
					}
					if(0==disparo) {
						System.out.println("Vidas dealer:");
						System.out.println(vidDealer.toString());

						turn=true;
					}
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					conT++;

				}
				if(eleccion==1) {
					disparo=disparar(camara);
					if(1==disparo) {
						if(cosaD==0) {
							vidJugador.remove(0);
							System.out.println("Vidas jugador:");
							System.out.println(vidJugador.toString());
						}
						if(cosaD==1) {
							vidJugador.remove(0);
							vidJugador.remove(0);
							System.out.println("Vidas jugador:");
							System.out.println(vidJugador.toString());
						}
						try {
							Thread.sleep(2000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}

				}
			}
			if(vidJugador.size()==0||vidDealer.size()==0) {
				if(vidJugador.size()==0) {
					ganadorD=1;
				}
				if(vidDealer.size()==0) {
					ganadorJ=1;
				}
				break;
			}
		}while(vidJugador.size()!=0||vidDealer.size()!=0);
		
		
		if(ganadorJ==1) {
			System.out.println("Felicidades Jugador ganaste");
		}
		if(ganadorD==1) {
			System.out.println("Felicidades Dealer ganaste");
		}
		System.out.println("Quieres Jugar otra vez?"
				+ "\n1: si"
				+ "\n2: no");
		menu=leer.nextInt();
		}while(menu!=2);
	
	}

	public static int disparar(ArrayList camara) {
		int mmm=2;
		if((int)camara.get(0)==0) {

			System.out.println("Tipo de bala");

			System.out.println(camara.remove(0));
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			mmm=0;
			return mmm;
		}
		if((int)camara.get(0)==1) {

			System.out.println("Tipo de bala");

			System.out.println(camara.remove(0));
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			mmm=1;
			return mmm;
		}

		return mmm;

	}

	public static void recargar(ArrayList camara,String[]listaCosas,String[]cosasJugador,String[]cosasDealer) {
		if(camara.isEmpty()) {
			llenarCosas(listaCosas,cosasJugador,cosasDealer);
			f.numCargas(camara);
		}
	}

	public static void llenarCosas(String[]listaCosas,String[]cosasJugador,String[]cosasDealer) {
		int eleccion=0;
		int k=0;
		int i=0;
		System.out.println("Objetos del Jugador");
		while(k<4) {
			if(i==8) {
				break;
			}
			if(null==cosasJugador[i]) {
				eleccion=r.nextInt(0, 9);
				cosasJugador[i]=listaCosas[eleccion];
				System.out.println((i+2)+": "+listaCosas[eleccion]);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				k++;
			}
			i++;
		}
		k=0;
		i=0;
		System.out.println("Objetos del Dealer");
		while(k<4) {
			if(i==8) {
				break;
			}
			if(null==cosasDealer[i]) {
				eleccion=r.nextInt(0, 9);
				cosasDealer[i]=listaCosas[eleccion];
				System.out.println((i+2)+": "+listaCosas[eleccion]);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				k++;
			}
			i++;
		}
		imprimirCosas(cosasJugador,cosasDealer);

	}


	public static int elegirCosaJugador(int cosaE,String[]cosasJugador,String[]cosasDealer,ArrayList vidJugador, int ronda,ArrayList camara) {
		int eleccion=0;
		if(cosasJugador[cosaE-2]=="MedicinaExpirada") {
			System.out.println("Se uso Medicina Expirada");
			s.medicinaExpirada(vidJugador, ronda);
			cosasJugador[cosaE-2]=null;
			return 0;
		}else if(cosasJugador[cosaE-2]=="Inverter") {
			System.out.println("Se uso Inverter");
			s.inverter(camara);
			cosasJugador[cosaE-2]=null;
			return 0;
		}else if(cosasJugador[cosaE-2]=="Cigarro") {
			System.out.println("Se uso Cigarro");
			s.cigarro(vidJugador, ronda);
			cosasJugador[cosaE-2]=null;
			return 0;
		}else if(cosasJugador[cosaE-2]=="Telefono") {
			System.out.println("Se uso Telefono");
			s.telefono(camara);
			cosasJugador[cosaE-2]=null;
			return 0;
		}else if(cosasJugador[cosaE-2]=="Adrenalina") {
			System.out.println("Se uso Adrenalina");
			System.out.println("Elige el objeto del contrincante");
			imprimirCosas(cosasJugador, cosasDealer);
			eleccion=leer.nextInt();
			s.adrenalinaJugador(eleccion, cosasJugador, cosasDealer);
			cosasJugador[cosaE-2]=null;
			return 0;
		}else if(cosasJugador[cosaE-2]=="Lupa") {
			System.out.println("Se uso Lupa");
			s.lupa(camara);
			cosasJugador[cosaE-2]=null;
			return 0;
		}else if(cosasJugador[cosaE-2]=="Beer") {
			System.out.println("Se uso Beer");
			s.beer(camara);
			cosasJugador[cosaE-2]=null;
			return 0;
		}else if(cosasJugador[cosaE-2]=="Serrucho") {
			System.out.println("Se uso Serrucho");
			cosasJugador[cosaE-2]=null;
			return 1;
		}else if(cosasJugador[cosaE-2]=="Esposas") {
			System.out.println("Se uso Esposas");
			cosasJugador[cosaE-2]=null;
			return 2;
		}

		return 0;

	}
	public static int elegirCosaDealer(int cosaE,String[]cosasJugador,String[]cosasDealer,ArrayList vidDealer, int ronda,ArrayList camara) {
		int eleccion=0;
		if(cosasDealer[cosaE-2]=="MedicinaExpirada") {
			System.out.println("Se uso Medicina Expirada");
			s.medicinaExpirada(vidDealer, ronda);
			cosasDealer[cosaE-2]=null;
			return 0;
		}else if(cosasDealer[cosaE-2]=="Inverter") {
			System.out.println("Se uso Inverter");
			s.inverter(camara);
			cosasDealer[cosaE-2]=null;
			return 0;
		}else if(cosasDealer[cosaE-2]=="Cigarro") {
			System.out.println("Se uso Cigarro");
			s.cigarro(vidDealer, ronda);
			cosasDealer[cosaE-2]=null;
			return 0;
		}else if(cosasDealer[cosaE-2]=="Telefono") {
			System.out.println("Se uso Telefono");
			s.telefono(camara);
			cosasDealer[cosaE-2]=null;
			return 0;
		}else if(cosasDealer[cosaE-2]=="Adrenalina") {
			System.out.println("Se uso Adrenalina");
			System.out.println("Elige el objeto del contrincante");
			imprimirCosas(cosasJugador, cosasDealer);
			eleccion=r.nextInt(2, cosasJugador.length);
			s.adrenalinaDealer(eleccion, cosasJugador, cosasDealer);
			cosasDealer[cosaE-2]=null;
			return 0;
			//falta
		}else if(cosasDealer[cosaE-2]=="Lupa") {
			System.out.println("Se uso Lupa");
			s.lupa(camara);
			cosasDealer[cosaE-2]=null;
			return 0;
		}else if(cosasDealer[cosaE-2]=="Beer") {
			System.out.println("Se uso Beer");
			s.beer(camara);
			cosasDealer[cosaE-2]=null;
			return 0;
		}else if(cosasDealer[cosaE-2]=="Serrucho") {
			System.out.println("Se uso Serrucho");
			cosasDealer[cosaE-2]=null;
			return 1;
		}else if(cosasDealer[cosaE-2]=="Esposas") {
			System.out.println("Se uso Esposas");
			cosasDealer[cosaE-2]=null;
			return 2;
		}

		return 0;

	}
	public static void ronda1(ArrayList vidJugador,ArrayList vidDealer) {
		vidJugador.add(1);
		vidJugador.add(1);
		vidJugador.add(1);
		vidJugador.add(1);
		vidJugador.add(1);
		vidDealer.add(1);
		vidDealer.add(1);
		vidDealer.add(1);
		vidDealer.add(1);
		vidDealer.add(1);
	}
	public static void imprimirCosas(String[]cosasJugador,String[]cosasDealer) {
		System.out.println("Cosas Jugador:");
		for(int i=0;i<cosasJugador.length;i++) {
			if(null!=cosasJugador[i]) {

				System.out.println((i+2)+": "+cosasJugador[i]);
			}
		}
		System.out.println("Cosas Dealer:");
		for(int i=0;i<cosasDealer.length;i++) {
			if(null!=cosasDealer[i]) {
				System.out.println((i+2)+": "+cosasDealer[i]);
			}
		}
	}

}








