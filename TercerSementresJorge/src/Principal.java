import edu.udelp.estructura.stack.ArrayStack;
import  edu.udelp.operaciones.*;
import edu.udelp.ordenamientos.*;
import udelp.edu.estructura.nodos.LinkedStack;
import edu.udelp.queue.*;

import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		
		String ecuacion=null;
		System.out.println("Porfavor deme su ecuacion");
		Scanner leer=new Scanner(System.in);
		ecuacion=leer.nextLine();
		
		ecuacion="("+ecuacion+")";
		//Solo funciona con numeros de un digito
		//De verdad que intente la jerarquia de operaciones pero no me sale, tengo mucho sueño y no se que hacer
		//Pero si funcion, solo falla jerarquia de operaciones
		
		
		ArrayStack funcion=new ArrayStack(ecuacion.length());
		ArrayStack numeros=new ArrayStack(ecuacion.length());
		ArrayStack operandos=new ArrayStack(ecuacion.length());
		ArrayStack acomodar=new ArrayStack(ecuacion.length());
		
		EcuacionPolacaInversa resolver=new EcuacionPolacaInversa(ecuacion);
		
		
		resolver.polacaInversa(funcion, numeros,operandos,acomodar);
		
		
		
		
		/*
		CircularQueue funcion=new CircularQueue(5);
		
		
		funcion.enqueue(10);
		funcion.enqueue(6);
		funcion.enqueue(7);
		funcion.enqueue(8);
		funcion.enqueue(3);
		
		
		System.out.println(funcion.front());
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		String ecuacion=null;
		
		
		Scanner leer=new Scanner(System.in);
		ecuacion=leer.nextLine();
		ArrayStack funcion=new ArrayStack(ecuacion.length());
		VerificarParentesis parentesis=new VerificarParentesis(ecuacion);
		ResolverEcuacion resolver=new ResolverEcuacion(ecuacion);
		System.out.println(parentesis.contarParentesis(funcion));
		
		
		resolver.ecuacion(funcion);
		*/
		
		/*
		No hay problemas con parentesis pero no acepta numeros negativos
		No funciona con numeros de mas de dos digitos ejemplo: 24, 64, 246
		
		
		*/
		
		
		
		
		/*
		Burbuja ordenB=new Burbuja();
		insercion ordenI=new insercion();
		seleccion ordenS=new seleccion();
		
		System.out.println("Ordenamiento Burbuja");
		ordenB.arreglo();
		System.out.println(ordenB.toString());
		ordenB.ordenar();
		System.out.println(ordenB.toString());
		
		System.out.println("\nOrdenamiento de Inserción");
		ordenI.arreglo();
		System.out.println(ordenI.toString());
		ordenI.ordenar();
		System.out.println(ordenI.toString());
		
		System.out.println("\nOrdenamiento de Selección");
		ordenS.arreglo();
		System.out.println(ordenS.toString());
		ordenS.ordenar();
		System.out.println(ordenS.toString());
		*/
	}

}
