
public class Principal {
static Preguntas p=new Preguntas();

static ArrayList libros=new ArrayList();
static ArrayList texto=new ArrayList();
static ArrayList textoDeshecho=new ArrayList();
static ArbolesBinarios arbol=new ArbolesBinarios();
static NumericPriorityQueue palabras=new NumericPriorityQueue();
static NumericPriorityQueue librosFecha=new NumericPriorityQueue();
static NumericPriorityQueue librosNumero=new NumericPriorityQueue();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Pregunta Uno");
		p.preguntaUno(libros,librosFecha,librosNumero);
		System.out.println();
		System.out.println();
		System.out.println("Pregunta Tres");
		p.preguntaTres(palabras);
		System.out.println();
		System.out.println();
		System.out.println("Arbol");
		p.arboles(arbol);
		System.out.println();
		System.out.println();
		
	System.out.println("Pregunta Dos");
		p.preguntaDos(texto, textoDeshecho);
		
	
	}

}
