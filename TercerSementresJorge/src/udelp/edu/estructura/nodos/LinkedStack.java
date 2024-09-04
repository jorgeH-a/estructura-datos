package udelp.edu.estructura.nodos;

public class LinkedStack {
private Nodo apuntador;
private int size;
public LinkedStack() {
	this.apuntador=null;
	this.size=0;
}
public boolean isEmpty() {
	return size==0;
}
public int size() {
	return size;
}

public void push(Object valor) {
	Nodo nodo=new Nodo();
	nodo.setValor(valor);
	if(!isEmpty()) {
		nodo.setEnlace(apuntador);
	}
	apuntador=nodo;
	size++;
}
public Object pop() {
	Object valor=null;
	if(!isEmpty()) {
		valor=apuntador.getValor();
		Nodo nodo=apuntador.getEnlace();
		apuntador=nodo;
		size--;
	}
	return valor;
}
public String toString() {
	String s="";
	Nodo temp=apuntador;
	while(null!=temp) {
		s+=""+temp.getValor();
		temp=temp.getEnlace();
	}
	return s;
}

}
