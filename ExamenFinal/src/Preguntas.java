import java.util.Random;
import java.util.Scanner;
public class Preguntas {
	Random r=new Random();
	Scanner leer=new Scanner(System.in);
	
	
	public void preguntaUno(ArrayList libros,NumericPriorityQueue librosFecha, NumericPriorityQueue librosNumero) {
		int fecha=0;
		int numero=0;
		int seguir=0;int a=0;
		String libro="";
		String[] libroD=new String[3];
		String numS="";
		do {
			System.out.println("Quiere agregar libros de forma manual o automatica"
					+ "\nManual: 1   Automatica: 2");
			a=leer.nextInt();
			if(a==1) {
				do {
		System.out.println("Agregue la fecha");
		fecha=leer.nextInt();
		}while(fecha<1990||fecha>2007);
		do {
		System.out.println("Agregue el numero");
		numero=leer.nextInt();
		}while(numero>9999);
		numS=Integer.toString(numero);
		if(numS.length()==1) {
			numS="0"+"0"+"0"+numS;
		}
		if(numS.length()==2) {
			numS="0"+"0"+numS;
		}
		if(numS.length()==3) {
			numS="0"+numS;
		}
		System.out.println("ISBN-"+fecha+"-"+numS);
		libros.add("ISBN-"+fecha+"-"+numS);
			}else {
				preguntaUnoAleatorio(libros);
			}
		
		
		System.out.println("Quiere seguir agregando libros?"
				+ "\nno:2 si: cualquier otro numero");
		seguir=leer.nextInt();
		
		System.out.println();
		}while(seguir!=2);
		
		a=0;
		System.out.println(libros.toString());
		
		
		do {
			
			libro=(String) libros.get(a);
			libroD=libro.split("-");
			
			librosFecha.enqueue(libro,Integer.parseInt(libroD[1]));		
			librosNumero.enqueue(libro,Integer.parseInt(libroD[2]));
			a++;
		}while(a!=libros.size());
		System.out.println();
		System.out.println("Ordenado por fecha: "+librosFecha.toString());
		System.out.println("Ordenado por numero: "+librosNumero.toString());
		
		
	}
	public void preguntaUnoAleatorio(ArrayList libros) {
		int fecha=0;
		int numero=0;
		int seguir=0;
		int con=0;
		String numS="";
		System.out.println("¿Cuantos libros quiere agregar?");
		seguir=leer.nextInt();
		do{
		fecha=r.nextInt(1990, 2008);
		
		numero=r.nextInt(0, 10000);
		numS=Integer.toString(numero);
		if(numS.length()==1) {
			numS="0"+"0"+"0"+numS;
		}
		if(numS.length()==2) {
			numS="0"+"0"+numS;
		}
		if(numS.length()==3) {
			numS="0"+numS;
		}
		System.out.println("ISBN-"+fecha+"-"+numS);
		libros.add("ISBN-"+fecha+"-"+numS);
		con++;
		}while(seguir!=con);
		
	}
	
	public void preguntaDos(ArrayList texto,ArrayList textoDeshecho) {
		String oracion="";
		String oracionAn="";
		
		int accion=0;
		int con=0;
		System.out.println("Para deshacer lo escrito presione 1, para rehacer presione 2"
				+ "\nPara dejar de escribir presione 3"
				+ "\nPara seguir escribiendo cualquier otro numero");
		do {
			con++;
			System.out.println("Escriba");
			oracion=leer.nextLine();
			oracion=leer.nextLine();
			texto.add(oracion);
			System.out.println(texto.toString());
			do {
			System.out.println("¿Quiere hacer una acción?");
			accion=leer.nextInt();
			if(accion==1) {
				con--;
				oracionAn=(String) texto.remove(con);
				textoDeshecho.add(oracionAn);
				System.out.println(texto.toString());
			}else if(accion==2&&!textoDeshecho.isEmpty()) {
				con++;
				oracionAn=(String) textoDeshecho.remove(0);
				texto.add(oracionAn);
				System.out.println(texto.toString());
			}else {
				System.out.println(texto.toString());
			}
			}while(accion==1||accion==2);
			
		}while(accion!=3);
		
		
		
	}
	public void preguntaTres(NumericPriorityQueue lPalabras) {
		int numVocal=0;
		int conPalabras=0;
		String palabra="";
		char letra;
		int conUno=0;
		String[]palabras= {"Menos","Nabucodonosor","Bebida","Angelópolis","Corleone","Avión","Planta",
				"Centro comercial","Ana","Cthulhu"};
		
		do {
			palabra=palabras[conPalabras];
			conUno=0;
			numVocal=0;
			do {
				
				letra=palabra.charAt(conUno);
				if(letra=='a'||letra=='e'||letra=='i'||letra=='o'||letra=='u'||letra=='á'||letra=='é'||letra=='í'||letra=='ó'||letra=='ú'||letra=='A'||letra=='E'||letra=='I'||letra=='O'||letra=='U'||letra=='Á'||letra=='É'||letra=='Í'||letra=='Ó'||letra=='Ú') {
					numVocal++;
				}
				
				conUno++;
			}while(conUno!=palabra.length());
			lPalabras.enqueue(palabra, numVocal);
			conPalabras++;
		}while(conPalabras!=palabras.length);
		
		System.out.println(lPalabras.toString());
		
	}
	public void arboles(ArbolesBinarios arbol) {
		
		arbol.add(67);
		
		arbol.add(43);
		arbol.add(80);
		
		arbol.add(11);
		arbol.add(55);
		arbol.add(70);
		arbol.add(92);
		
		arbol.add(5);
		arbol.add(13);
		arbol.add(50);
		arbol.add(56);
		arbol.add(68);
		arbol.add(74);
		arbol.add(90);
		arbol.add(95);
		System.out.println("Ordenamiento Preorden:");
		arbol.preorden();
		System.out.println("Ordenamiento Postorden:");
		arbol.postorden();
		System.out.println("Ordenamiento Inorden:");
		arbol.inorden();
		/*
		R=raiz
		I=izquierda
		D=derecha
		
		Preorden  R I D
		Inorden   I R D
		Postorden I D R
		*/
	}
	
}









