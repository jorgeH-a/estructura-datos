package edu.udelp.operaciones;
import edu.udelp.estructura.stack.*;

public class VerificarParentesis {
int tamañoEc=0;
String ecuacion=null;
	public VerificarParentesis(String ecuacion) {
		tamañoEc=ecuacion.length();
		this.ecuacion=ecuacion;
		ArrayStack funcion=new ArrayStack(tamañoEc);
	}
	public boolean contarParentesis(ArrayStack funcion) {
		boolean parentesis=false;
		String simbolo;
		int contador=0;
		int contador1=0;
		for(int i=0;i<tamañoEc;i++) {
			simbolo=String.valueOf(ecuacion.charAt(i));
			
			if(simbolo.equals("(")) {
				funcion.push(simbolo);			
				contador++;
				
			}
				if(simbolo.equals(")")) {
					funcion.pop();
					contador1++;
				}	
		}
		if(!funcion.isEmpty()) {
			parentesis=false;
		}

		if(funcion.isEmpty()&&contador==contador1) {
			parentesis=true;
		}
		return parentesis;
	}

}