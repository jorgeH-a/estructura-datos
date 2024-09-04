package edu.udelp.ordenamientos;
import java.util.Random;
public class insercion {
	private int[]stack=new int[100];
	Random aleatorio=new Random();
	public void arreglo(){

		for(int i=0;i<stack.length;i++){
			stack[i]=aleatorio.nextInt(100);  
		}

	}
	public void ordenar(){
		int num1=0;
		for(int i=1;i<stack.length;i++){
			
				for(int j=i;j>0;j--){
					if(j!=0){
						if(stack[j]<stack[j-1]){
							num1=stack[j];
							stack[j]=stack[j-1];
							stack[j-1]=num1;
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