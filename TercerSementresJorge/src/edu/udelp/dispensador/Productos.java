package edu.udelp.dispensador;

public class Productos {
	QueueCircular coca=new QueueCircular(10);QueueCircular fanta=new QueueCircular(10);
	QueueCircular sprite=new QueueCircular(10);QueueCircular sidral=new QueueCircular(10);
	QueueCircular sabritas=new QueueCircular(10);QueueCircular doritos=new QueueCircular(10);
	QueueCircular ruffles=new QueueCircular(10);QueueCircular oreos=new QueueCircular(10);
	QueueCircular arcoiris=new QueueCircular(10);QueueCircular emperador=new QueueCircular(10);
	String prodCoca="Coca";String prodFanta="Fanta";String prodSprite="Sprite";
	String prodSidral="Sidral";String prodSabritas="Sabritas";String prodDoritos="Doritos";
	String prodRuffles="Ruffles";String prodOreos="Oreos";String prodArcoiris="Arcoiris";
	String prodEmperador="Emperador";
	Dinero dinero=new Dinero();
	//coca, fanta, sprite, sidral 17 pesos
	//sabritas, doritos, ruffles  12 pesos
	//oreos, arcoiris, emoerador  15 pesos
	
	
	public void estadoInicialProductos() {
		dinero.estadoInicialDinero();
		
		while(!coca.isFull()){
			coca.enqueue(prodCoca);
			fanta.enqueue(prodFanta);
			sprite.enqueue(prodSprite);
			sidral.enqueue(prodSidral);
			sabritas.enqueue(prodSabritas);
			doritos.enqueue(prodDoritos);
			ruffles.enqueue(prodRuffles);
			oreos.enqueue(prodOreos);
			arcoiris.enqueue(prodArcoiris);
			emperador.enqueue(prodEmperador);
		}
	}

	public void venderProducto(String producto) {
		Object prodElegido=null;
		
		if(prodCoca==producto&&!coca.isEmpty()) {
			
			prodElegido=coca.dequeue();
			dinero.cambioDineroUS();
			System.out.println("Aqui esta su producto: "+prodElegido);
			
		}else if(prodFanta==producto&&!fanta.isEmpty()) {
			prodElegido=fanta.dequeue();
			dinero.cambioDineroUS();
			System.out.println("Aqui esta su producto: "+prodElegido);
		}else if(prodSprite==producto&&!sprite.isEmpty()) {
			prodElegido=sprite.dequeue();
			dinero.cambioDineroUS();
			System.out.println("Aqui esta su producto: "+prodElegido);
		}else if(prodSidral==producto&&!sidral.isEmpty()) {
			prodElegido=sidral.dequeue();
			dinero.cambioDineroUS();
			System.out.println("Aqui esta su producto: "+prodElegido);
		}else if(prodSabritas==producto&&!sabritas.isEmpty()) {
			prodElegido=sabritas.dequeue();
			dinero.cambioDineroUD();
			System.out.println("Aqui esta su producto: "+prodElegido);
		}else if(prodDoritos==producto&&!doritos.isEmpty()) {
			prodElegido=doritos.dequeue();
			dinero.cambioDineroUD();
			System.out.println("Aqui esta su producto: "+prodElegido);
		}else if(prodRuffles==producto&&!ruffles.isEmpty()) {
			prodElegido=ruffles.dequeue();
			dinero.cambioDineroUD();
			System.out.println("Aqui esta su producto: "+prodElegido);
		}else if(prodOreos==producto&&!oreos.isEmpty()) {
			prodElegido=oreos.dequeue();
			dinero.cambioDineroUC();
			System.out.println("Aqui esta su producto: "+prodElegido);
		}else if(prodArcoiris==producto&&!arcoiris.isEmpty()) {
			prodElegido=arcoiris.dequeue();
			dinero.cambioDineroUC();
			System.out.println("Aqui esta su producto: "+prodElegido);
		}else if(prodEmperador==producto&&!emperador.isEmpty()) {
			prodElegido=emperador.dequeue();
			dinero.cambioDineroUC();
			System.out.println("Aqui esta su producto: "+prodElegido);
		}else {
			System.out.println("No hay producto");
		}



	}
	public void reabastecerProducto(int prod,int cantidad) {
		int guardado=0;
		
		
		for(int i=0;i<=cantidad;i++) {
			if(prod==1) {
				if(!coca.isFull()) {
					coca.enqueue(prodCoca);
					guardado=1;
				}
				
			}else if(prod==2) {
				if(!fanta.isFull()) {
					fanta.enqueue(prodFanta);
					guardado=1;
				}
				
			}else if(prod==3) {
				if(!sprite.isFull()) {
					sprite.enqueue(prodSprite);
					guardado=1;
				}
				
			}else if(prod==4) {
				if(!sidral.isFull()) {
					sidral.enqueue(prodSidral);
					guardado=1;
				}
			}else if(prod==5) {
				if(!sabritas.isFull()) {
					sabritas.enqueue(prodSabritas);
					guardado=1;
				}
			}else if(prod==6) {
				if(!doritos.isFull()) {
					doritos.enqueue(prodDoritos);
					guardado=1;
				}
			}else if(prod==7) {
				if(!ruffles.isFull()) {
					ruffles.enqueue(prodRuffles);
					guardado=1;
				}
			}else if(prod==8) {
				if(!oreos.isFull()) {
					oreos.enqueue(prodOreos);
					guardado=1;
				}
			}else if(prod==9) {
				if(!arcoiris.isFull()) {
					arcoiris.enqueue(prodArcoiris);
					guardado=1;
				}
			}else if(prod==10) {
				if(!emperador.isFull()) {
					emperador.enqueue(prodEmperador);
					guardado=1;
				}
			}
			
			
		}
		
		if(guardado==1) {
			System.out.println("Se guardo con exito");
			imprimirEstado();
		}else {
			System.out.println("Esta lleno");
		}
		
		
	}
	public void manipularDinero(int menu,int cantidad, int moneda) {
		dinero.manipularDinero(menu, cantidad, moneda);
	}
	
	
	public void imprimirEstado() {
		System.out.println(coca.toString());
		System.out.println(fanta.toString());
		System.out.println(sprite.toString());
		System.out.println(sidral.toString());
		System.out.println(sabritas.toString());
		System.out.println(doritos.toString());
		System.out.println(ruffles.toString());
		System.out.println(oreos.toString());
		System.out.println(arcoiris.toString());
		System.out.println(emperador.toString());
		System.out.println("\n");
		dinero.imprimirEstado();
	}
	
	
	
	



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
