package edu.udelp.ordenamientos;
import java.util.Random;

public class seleccion {
	private int[]stack=new int[100];
	Random aleatorio=new Random();
	public void arreglo(){

		for(int i=0;i<stack.length;i++){
			stack[i]=aleatorio.nextInt(100);  
		}

	}
	public void ordenar(){
		int num1=0;
		int num2=0;
		for(int i=0;i<stack.length;i++){
			for(int j=0;j<stack.length;j++){
				if(stack[i]>stack[j]){
					num1=stack[i];
					num2=stack[j];
					stack[i]=num2;
					stack[j]=num1;
				} 
			}         
		}       
	}
	public String toString (){
		String s="";

		for (int i=0;i<stack.length;i++){
			s=s+", "+stack[i];  

		}
		return s;
	}
}
