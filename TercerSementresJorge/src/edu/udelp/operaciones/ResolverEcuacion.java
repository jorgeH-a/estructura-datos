package edu.udelp.operaciones;

import edu.udelp.estructura.stack.ArrayStack;

public class ResolverEcuacion {
	int tamañoEc=0;
	String ecuacion=null;
	public ResolverEcuacion(String ecuacion) {
		tamañoEc=ecuacion.length();
		this.ecuacion=ecuacion;
		ArrayStack funcion=new ArrayStack(tamañoEc);

	}

	public void ecuacion(ArrayStack funcion) {
		String simbolo=null;
		String[] cadena=new String[tamañoEc];
		double numeros1=0;
		double numeros2=0;
		double numeros3=0;
		String numeroGrande=null;


		for(int i=0;i<tamañoEc;i++) {
			simbolo=String.valueOf(ecuacion.charAt(i));
			
			funcion.push(simbolo);
			

			//(3+3)

			if(simbolo.equals(")")) {

				for(int j=tamañoEc-1;j>=0;j--) {
					
					if(!funcion.peak().equals("(")) {
						
						cadena[j]=String.valueOf(funcion.pop());
					
					}
					if(j==0) {
						cadena[j]="";
					}
					
					
				}
				
				for(int j=0;j<cadena.length;j++) {
					
					if(cadena[j].equals("+")) {
						numeros1=Integer.valueOf(cadena[j-1]);
						numeros2=Integer.valueOf(cadena[j+1]);
						numeros3=numeros1+numeros2;
						funcion.push(numeros3);
					}else if(cadena[j].equals("-")) {
						numeros1=Integer.valueOf(cadena[j-1]);
						numeros2=Integer.valueOf(cadena[j+1]);
						numeros3=numeros1-numeros2;
						funcion.push(numeros3);
					}else if(cadena[j].equals("*")) {
						numeros1=Integer.valueOf(cadena[j-1]);
						numeros2=Integer.valueOf(cadena[j+1]);
						numeros3=numeros1*numeros2;
						funcion.push(numeros3);
					}else if(cadena[j].equals("/")) {
						numeros1=Integer.valueOf(cadena[j-1]);
						numeros2=Integer.valueOf(cadena[j+1]);
						numeros3=numeros1/numeros2;
						funcion.push(numeros3);
					}
					
					if(j==cadena.length-1) {
						funcion.push(cadena[j]);
					}
					
				}
			}		
			

		}
		for(int i=0;i<cadena.length;i++) {
			System.out.println(funcion.pop());
		}
		
	}





}
