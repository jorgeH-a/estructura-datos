package edu.udelp.operaciones;
import edu.udelp.estructura.stack.ArrayStack;
public class EcuacionPolacaInversa {
	int tamañoEc=0;
	String ecuacion=null;
	public EcuacionPolacaInversa(String ecuacion) {
		this.ecuacion=ecuacion;
		tamañoEc=ecuacion.length();
		ArrayStack funcion=new ArrayStack(tamañoEc);
		ArrayStack numeros=new ArrayStack(tamañoEc);
		ArrayStack operandos=new ArrayStack(tamañoEc);
		ArrayStack acomodar=new ArrayStack(tamañoEc);

	}

	public void polacaInversa(ArrayStack funcion, ArrayStack numeros, ArrayStack operandos, ArrayStack acomodar) {
		String simbolo=null;
		String simbolo2=null;
		String simbolo3=null;
		String simbolo4=null;
		String simbolo5=null;
		String ecPolaca=null;
		int contador=0;
		double resultado=0;
		int verificarParentesis=0;



		for(int i=0;i<tamañoEc;i++) {
			simbolo=String.valueOf(ecuacion.charAt(i));
			funcion.push(simbolo);
			if(simbolo.equals(")")) {
				for(int j=0;j<tamañoEc;j++) {
					if(verificarParentesis!=1) {
						simbolo2=String.valueOf(funcion.pop());

						if(simbolo2.equals("(")) {
							verificarParentesis=1;

						}





						if(simbolo2.equals("1")||simbolo2.equals("2")||simbolo2.equals("3")||simbolo2.equals("4")||simbolo2.equals("5")||simbolo2.equals("6")
								||simbolo2.equals("7")||simbolo2.equals("8")||simbolo2.equals("9")||simbolo2.equals("0")) {
							numeros.push(simbolo2);



						}

						if(simbolo2.equals("+")||simbolo2.equals("-")||simbolo2.equals("*")||simbolo2.equals("/")) {


							operandos.push(simbolo2);



						}

					}

				}
				verificarParentesis=0;
			}

			for(int j=0;j<tamañoEc;j++) {


				if(j<2) {
					simbolo3=String.valueOf(numeros.pop());
					if(simbolo3!="null") {
						acomodar.push(simbolo3);
					}
				}
				if(j==2) {
					simbolo3=String.valueOf(operandos.pop());
					if(simbolo3!="null") {
						acomodar.push(simbolo3);
					}
				}


			}



		}

		System.out.println(acomodar.toString());
		ecPolaca=acomodar.toString();
		String[] cadena=ecPolaca.split(",");
		for (int i=0;i<cadena.length;i++) {

			if (cadena[i]!=null) {

				if ((cadena[i].equals("+")||cadena[i].equals("-")||cadena[i].equals("*")||cadena[i].equals("/"))&&
						(i>=2&&cadena[i-2]!=null&&cadena[i-1]!=null)){
					if(cadena[i].equals("+")){
						resultado=Double.valueOf(cadena[i-2])+Double.valueOf(cadena[i-1]);
					}else if(cadena[i].equals("-")){
						resultado=Double.valueOf(cadena[i-2])-Double.valueOf(cadena[i-1]);
					}else if(cadena[i].equals("*")){
						resultado=Double.valueOf(cadena[i-2])*Double.valueOf(cadena[i-1]);
					}else if(cadena[i].equals("/")){
						resultado=Double.valueOf(cadena[i-2])/Double.valueOf(cadena[i-1]);
					}
					cadena[i-2]=null;
					cadena[i-1]=null;
					cadena[i]=String.valueOf(resultado);
					
				}

			}

		}

		for(int i=0;i<cadena.length;i++) {
			if(cadena[i]!=null) {
				System.out.println(cadena[i]);
			}
		}


	}
}
