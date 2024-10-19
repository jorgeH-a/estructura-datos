package edu.udelp.ordenamientos;

import java.util.Random;




public class Shellsort {
	static Random aleatorio=new Random();
	static int[] desarreglo=new int[100];
	static LinkedList arreglo=new LinkedList();

	public LinkedList ordenar() {
		int num=desarreglo.length/2;
		double num2;
		int it;
		do {
			for(int i=0;i<desarreglo.length;i++) {
				for(int j=desarreglo.length-1;j>=num;j--){
					if(j!=0){
						if(desarreglo[j]<desarreglo[j-num]){
							it=desarreglo[j];
							desarreglo[j]=desarreglo[j-num];
							desarreglo[j-num]=it;
						}
					} 
				}
			}
			num2=num/2;
			num=(int) Math.ceil(num2);
		}while(num>0);
		for(int i=0;i<desarreglo.length;i++) {
			arreglo.add(desarreglo[i]);
		}
		return arreglo;
	}
	
	public static void arreglo(){
		for(int i=0;i<desarreglo.length;i++){
			desarreglo[i]=aleatorio.nextInt(100);
		}

	}
	public String toString (){
		String s="";

		for (int i=0;i<desarreglo.length;i++){
			s=s+", "+desarreglo[i];  

		}
		return s;
	}

}
