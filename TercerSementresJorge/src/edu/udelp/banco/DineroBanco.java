package edu.udelp.banco;
import java.util.Random;
public class DineroBanco {
	
	double BILLETE1000=1000;
	double BILLETE500=500;
	double BILLETE200=200;
	double BILLETE100=100;
	double MON20=20;
	double MON10=10;
	double MON5=5;
	double MON2=2;
	double MON1=1;
	double MONPUNTO5=.5;
	Random r=new Random();
	
	public void estadoInicial(LinkedQueue billetes1000,LinkedQueue billetes500,LinkedQueue billetes200,
			LinkedQueue billetes100,LinkedQueue monedas20,LinkedQueue monedas10,LinkedQueue monedas5,
			LinkedQueue monedas2,LinkedQueue monedas1,	LinkedQueue monedasPunto5) {
		
		for(int i=0;i<400;i++) {
			billetes1000.enqueue(BILLETE1000);
			billetes500.enqueue(BILLETE500);
			billetes200.enqueue(BILLETE200);
			billetes100.enqueue(BILLETE100);
			monedas20.enqueue(MON20);
			monedas10.enqueue(MON10);
			monedas5.enqueue(MON5);
			monedas2.enqueue(MON2);
			monedas1.enqueue(MON1);
			monedasPunto5.enqueue(MONPUNTO5);	
		}		
	}
	
	public void retirarDinero(LinkedQueue billetes1000,LinkedQueue billetes500,LinkedQueue billetes200,
			LinkedQueue billetes100,LinkedQueue monedas20,LinkedQueue monedas10,LinkedQueue monedas5,
			LinkedQueue monedas2,LinkedQueue monedas1,	LinkedQueue monedasPunto5,String persona) {
		
		Thread t1=new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				double cantidad=0;
				int i=0;
				String[] num1000=new String[20];
				String[] num500=new String[30];
				String[] num200=new String[60];
				String[] num100=new String[200];
				String[] num20=new String[200];
				String[] num10=new String[200];
				String[] num5=new String[200];
				String[] num2=new String[200];
				String[] num1=new String[200];
				String[] numPunto5=new String[100];
				
				
				
				
					String total1000="";String total500="";String total200="";String total100="";String total20="";
				String total10="";String total5="";String total2="";String total1="";String totalPunto5="";
				for(int j=0;j<num1000.length;j++) {
					num1000[j]=null;
				}
				for(int j=0;j<num500.length;j++) {
					num500[j]=null;
				}
				for(int j=0;j<num200.length;j++) {
					num200[j]=null;
				}
				for(int j=0;j<num100.length;j++) {
					num100[j]=null;
				}
				for(int j=0;j<num20.length;j++) {
					num20[j]=null;
				}
				for(int j=0;j<num10.length;j++) {
					num10[j]=null;
				}
				for(int j=0;j<num5.length;j++) {
					num5[j]=null;
				}
				for(int j=0;j<num2.length;j++) {
					num2[j]=null;
				}
				for(int j=0;j<num1.length;j++) {
					num1[j]=null;
				}
				for(int j=0;j<numPunto5.length;j++) {
					numPunto5[j]=null;
				}
				
					
						cantidad=r.nextInt(5000);
						do {
							
							//guiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii
							
							System.out.println("Retiro de: "+cantidad+" a "+persona);
							
							if(!billetes1000.isEmpty()) {
								while(cantidad-BILLETE1000>=0) {
								cantidad=cantidad-BILLETE1000;
								num1000[i]=","+billetes1000.dequeue();
								
								i++;
								}
								i=0;
							}
							if(!billetes500.isEmpty()) {
								while(cantidad-BILLETE500>=0) {
									cantidad=cantidad-BILLETE500;
									num500[i]=","+billetes500.dequeue();
									
									i++;
									}
								i=0;
							}
							
							
							if(!billetes200.isEmpty()) {
								while(cantidad-BILLETE200>=0) {
									cantidad=cantidad-BILLETE200;
									num200[i]=","+billetes200.dequeue();
									
									i++;
									}
								i=0;
							}
							if(!billetes100.isEmpty()) {
								while(cantidad-BILLETE100>=0) {
									cantidad=cantidad-BILLETE100;
									num100[i]=","+billetes100.dequeue();
									
									i++;
									}
								i=0;
							}
							if(!monedas20.isEmpty()) {
								while(cantidad-MON20>=0) {
									cantidad=cantidad-MON20;
									num20[i]=","+monedas20.dequeue();
									
									i++;
									}
								i=0;
							}
							if(!monedas10.isEmpty()) {
								while(cantidad-MON10>=0) {
									cantidad=cantidad-MON10;
									num10[i]=","+monedas10.dequeue();
									
									i++;
									}
								i=0;
							}
							if(!monedas5.isEmpty()) {
								while(cantidad-MON5>=0) {
									cantidad=cantidad-MON5;
									num5[i]=","+monedas5.dequeue();
									
									i++;
									}
								i=0;
							}
							if(!monedas2.isEmpty()) {
								while(cantidad-MON2>=0) {
									cantidad=cantidad-MON2;
									num2[i]=","+monedas2.dequeue();
									
									i++;
									}
								i=0;
							}
							if(!monedas1.isEmpty()) {
								while(cantidad-MON1>=0) {
									cantidad=cantidad-MON1;
									num1[i]=","+monedas1.dequeue();
									
									i++;
									}
								i=0;
							}
							if(!monedasPunto5.isEmpty()) {
								while(cantidad-MONPUNTO5>=0) {
									cantidad=cantidad-MONPUNTO5;
									numPunto5[i]=","+monedasPunto5.dequeue();
									
									i++;
									}
								i=0;
							}
							
							
							
							
							
							
						}while(cantidad!=0);
						
						
						for(int j=0;j<num1000.length;j++) {
							if(num1000[j]!=null) {
							total1000=total1000+num1000[j];
						}
							
						}
						
						for(int j=0;j<num500.length;j++) {
							if(num500[j]!=null) {
								total500=total500+num500[j];
								
							}
						}
						
						for(int j=0;j<num200.length;j++) {
							if(num200[j]!=null) {
								total200=total200+num200[j];
								
							}
						}
						
						for(int j=0;j<num100.length;j++) {
							if(num100[j]!=null) {
								total100=total100+num100[j];
								
							}
						}
						
						for(int j=0;j<num20.length;j++) {
							if(num20[j]!=null) {
								total20=total20+num20[j];
								
							}
						}
											
						
						
						for(int j=0;j<num10.length;j++) {
							if(num10[j]!=null) {
							total10=total10+num10[j];
						}
							
						}
						
						for(int j=0;j<num5.length;j++) {
							if(num5[j]!=null) {
								total5=total5+num5[j];
								
							}
						}
						
						for(int j=0;j<num2.length;j++) {
							if(num2[j]!=null) {
								total2=total2+num2[j];
								
							}
						}
						
						for(int j=0;j<num1.length;j++) {
							if(num1[j]!=null) {
								total1=total1+num1[j];
								
							}
						}
						
						for(int j=0;j<numPunto5.length;j++) {
							if(numPunto5[j]!=null) {
								totalPunto5=totalPunto5+numPunto5[j];
								
							}
						}
						System.out.println("Cantidad de retiro de "+persona);
						System.out.println("Retiro de billetes de 1000: "+total1000);
						System.out.println("Retiro de billetes de 500: "+total500);
						System.out.println("Retiro de billetes de 200: "+total200);
						System.out.println("Retiro de billetes de 100: "+total100);
						System.out.println("Retiro de monedas de 20: "+total20);	
						System.out.println("Retiro de monedas de 10: "+total10);
						System.out.println("Retiro de monedas de 5: "+total5);
						System.out.println("Retiro de monedas de 2: "+total2);
						System.out.println("Retiro de monedas de 1: "+total1);
						System.out.println("Retiro monedas de .5: "+totalPunto5);	

				
			}
			
		});
		
		t1.start();
		
		
		
	}
	
	




	public void depositarDinero(LinkedQueue billetes1000,LinkedQueue billetes500,LinkedQueue billetes200,
			LinkedQueue billetes100,LinkedQueue monedas20,LinkedQueue monedas10,LinkedQueue monedas5,
			LinkedQueue monedas2,LinkedQueue monedas1,	LinkedQueue monedasPunto5,String persona) {
		Thread t1=new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				double cantidad=0;
				
				
				int num1000=0;int num500=0;int num200=0;int num100=0;int num20=0;int num10=0;int num5=0;int num2=0;int num1=0;int numPunto5=0;


				do {
					String total1000="";String total500="";String total200="";String total100="";String total20="";
					String total10="";String total5="";String total2="";String total1="";String totalPunto5="";


					cantidad=r.nextInt(10000);

					System.out.println("Deposito de: "+cantidad+" de "+persona);


					while(cantidad-BILLETE1000>=0) {
						cantidad=cantidad-BILLETE1000;
						num1000++;
					}
					while(cantidad-BILLETE500>=0) {
						cantidad=cantidad-BILLETE500;
						num500++;
					}
					while(cantidad-BILLETE200>=0) {
						cantidad=cantidad-BILLETE200;
						num200++;
					}
					while(cantidad-BILLETE100>=0) {
						cantidad=cantidad-BILLETE100;
						num100++;
					}
					while(cantidad-MON20>=0) {
						cantidad=cantidad-MON20;
						num20++;
					}
					while(cantidad-MON10>=0) {
						cantidad=cantidad-MON10;
						num10++;
					}
					while(cantidad-MON5>=0) {
						cantidad=cantidad-MON5;
						num5++;
					}
					while(cantidad-MON2>=0) {
						cantidad=cantidad-MON2;
						num2++;
					}
					while(cantidad-MON1>=0) {
						cantidad=cantidad-MON1;
						num1++;
					}
					while(cantidad-MONPUNTO5>=0) {
						cantidad=cantidad-MONPUNTO5;
						numPunto5++;
					}
					
					for(int j=0;j<num1000;j++) {
						billetes1000.enqueue(BILLETE1000);
						total1000=total1000+","+BILLETE1000;
					}
					for(int j=0;j<num500;j++) {
						billetes500.enqueue(BILLETE500);
						total500=total500+","+BILLETE500;
					}
					for(int j=0;j<num200;j++) {
						billetes200.enqueue(BILLETE200);
						total200=total200+","+BILLETE200;
					}
					for(int j=0;j<num100;j++) {
						billetes100.enqueue(BILLETE100);
						total100=total100+","+BILLETE100;
					}
					for(int j=0;j<num20;j++) {
						monedas20.enqueue(MON20);
						total20=total20+","+MON20;
					}
					for(int j=0;j<num10;j++) {
						monedas10.enqueue(MON10);
						total10=total10+","+MON10;
					}
					for(int j=0;j<num5;j++) {
						monedas5.enqueue(MON5);
						total5=total5+","+MON5;
					}
					for(int j=0;j<num2;j++) {
						monedas2.enqueue(MON2);
						total2=total2+","+MON2;
					}
					for(int j=0;j<num1;j++) {
						monedas1.enqueue(MON1);
						total1=total1+","+MON1;
					}
					for(int j=0;j<numPunto5;j++) {
						monedasPunto5.enqueue(MONPUNTO5);
						totalPunto5=totalPunto5+","+MONPUNTO5;
					}
					
					System.out.println("Cantidad de deposito de "+persona);
					System.out.println("Deposito de billetes de 1000: "+total1000);
					System.out.println("Deposito de billetes de 500: "+total500);
					System.out.println("Deposito de billetes de 200: "+total200);
					System.out.println("Deposito de billetes de 100: "+total100);
					System.out.println("Deposito de monedas de 20: "+total20);	
					System.out.println("Deposito de monedas de 10: "+total10);
					System.out.println("Deposito de monedas de 5: "+total5);
					System.out.println("Deposito de monedas de 2: "+total2);
					System.out.println("Deposito de monedas de 1: "+total1);
					System.out.println("Deposito monedas de .5: "+totalPunto5);	
					
					
					
				} while (cantidad!=0);
				
				
				
			}
			
			
			
		});
		t1.start();
		
		
		
		
		
	}
	public void agregarDinero() {
		
	}
	
}
