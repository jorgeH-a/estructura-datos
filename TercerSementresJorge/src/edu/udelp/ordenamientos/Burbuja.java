package edu.udelp.ordenamientos;
import java.util.Random;
public class Burbuja {
	Random aleatorio=new Random();
	private int[]stack=new int[100];
	
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
				if(j!=99) {
					if(stack[j]>stack[j+1]){
						num1=stack[j];
						num2=stack[j+1];
						stack[j]=num2;
						stack[j+1]=num1;                     
					}
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
