package edu.udelp.dispensador;

public class QueueCircular {
	private int f;
	private int r;
	private Object[] queue;
	private int size;
	
	public QueueCircular(int size) {
		f=0;
		r=0;
		queue=new Object[size];
		this.size=0;
	}
	
	public int size() {
		return size;
	}
	public boolean isEmpty() {
		return size==0;
	}
	public boolean isFull() {

		return size==queue.length;

	}
	public void enqueue(Object value) {

		if(!isFull()) {
			queue[f]=value;
			f++;
			size++;
			if(f==queue.length) {
				f=0;
			}

		}
	}
	public Object dequeue() {
		Object valor=null;
		if(!isEmpty()) {
			valor=queue[r];
			queue[r]=null;
			r++;
			size--;
			if(r==queue.length) {
				r=0;
			}
		}
		return valor;
	}
	
	
	public Object front() {
		Object valor=null;
		
		if(!isEmpty()) {
			int tempF=f-1;
		valor=queue[tempF];
		
		tempF=tempF==-1?queue.length-1:tempF;
		valor=queue[tempF];
		
		}
		
		
		return valor;
	}
	
	public Object rear() {
		Object valor=null;
		if(!isEmpty()) {
			valor=queue[r];
		}
		return valor;
		
	}
	
	@Override
	
	public String toString() {
		String s="";
		for(int i=0;i<size-1;i++) {
			int tempI=i+r;
			tempI=tempI==queue.length?0:tempI;
			
			s+=queue[tempI]+">";
			
				
		}
		return s;
		
		
		
	}
}
