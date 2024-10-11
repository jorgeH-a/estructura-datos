package edu.udelp.queue;
import java.time.LocalDate;
public class DatePriorityQueue {
	private DateNodo front;
	private DateNodo rear;
	private Object[] queue;
	private int size;
	
	public DatePriorityQueue() {
		front=null;
		rear=null;
		size=0;
		
		
	}
	
	public int size() {
		return size;
	}
	public boolean isEmpty() {
		return size==0;
	}
public void enqueue1(DateNodo nodo) {
		
		
		if(isEmpty()) {
			front=nodo;
			rear=nodo;
		}else {
			rear.setEnlace(nodo);
			rear=nodo;
		}
		
		
	}
public void enqueue(Object value,LocalDate prioridad) {
	DateNodo n=new DateNodo();
	n.setValor(value);
	n.setPrioridad(prioridad);
	if(isEmpty()) {
		front=n;
		rear=n;
		
	}else {
		if(prioridad.isAfter(rear.getPrioridad())||prioridad.isEqual(rear.getPrioridad()) ) {
			enqueue1(n);
		}else {
			DateNodo actual=front;
			DateNodo siguiente=front.getEnlace();
			if(prioridad.isBefore(front.getPrioridad()) ) {
				n.setEnlace(front);
				front=n;
			}else {
				while(null!=siguiente) {
					if(prioridad.isBefore(siguiente.getPrioridad()) ) {
						break;
					}
					actual=siguiente;
					siguiente=siguiente.getEnlace();
				}
				actual.setEnlace(n);
				n.setEnlace(siguiente);
				
			}
		
	}
	
	}
	size++;
}

public Object dequeue() {
	Object value=null;
	if(!isEmpty()) {
		size--;
		value=front.getValor();
		front=front.getEnlace();
		
	}
	return value;
}

public String toString() {
	String s="";
	DateNodo t=front;
	while(null!=t) {
		s+=t.getValor()+"<";
		t=t.getEnlace();
	}
	return s;
}
}
