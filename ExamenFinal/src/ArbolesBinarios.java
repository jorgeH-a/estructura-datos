

public class ArbolesBinarios {
	/*
	R=raiz
	I=izquierda
	D=derecha
	
	Preorden  R I D
	Inorden   I R D
	Postorden I D R
	*/
	private DobleNodo r;
	public ArbolesBinarios() {
		r=null;
	}
	public boolean isEmpty() {
		return null==r;
	}
	public void add(Object value) {
		DobleNodo n=new DobleNodo();
		n.setValor(value);
		if(isEmpty()) {
			r=n;
		}else {
			
			
			
			add(n,r);
			
		}
		
		
	}
	
	
	private void add(DobleNodo n,DobleNodo root) {
		
		if((int)n.getValor()>(int)root.getValor()) {
			if(null==root.getDerecha()) {
				root.setDerecha(n);
			}else {
				add(n,root.getDerecha());
			}
			
		}else {
			if(null==root.getIzquierda()) {
				root.setIzquierda(n);
			}else {
				add(n,root.getIzquierda());
			}
			
		}
		
		
		
	}
	
	public void preorden() {
		preorden(r);
	}
	
	private void preorden(DobleNodo actual) {
		if(null!=actual) {
			System.out.println(actual.getValor());
			preorden(actual.getIzquierda());
			preorden(actual.getDerecha());
			
		}
	}
	public void inorden() {
		inorden(r);
	}
	private void inorden(DobleNodo actual) {
		if(null!=actual) {
			inorden(actual.getIzquierda());
			System.out.println(actual.getValor());
			inorden(actual.getDerecha());
			
		}
	}
	public void postorden() {
		postorden(r);
	}
	private void postorden(DobleNodo actual) {
		if(null!=actual) {
			postorden(actual.getIzquierda());
			postorden(actual.getDerecha());
			System.out.println(actual.getValor());
			
			
		}
	}
	
	/*
	R=raiz
	I=izquierda
	D=derecha
	
	Preorden  R I D
	Inorden   I R D
	Postorden I D R
	*/
	
	
	
}
