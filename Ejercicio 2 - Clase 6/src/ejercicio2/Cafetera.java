package ejercicio2;

public class Cafetera {
	
	// Abtributos 
	
	private int capacidadMaxima;
	private int cantidadActual;
	
	
	public Cafetera() { // constructor default
		
		capacidadMaxima = 1000;
		cantidadActual = 0;	
		
	}
	
	public void CafeteraLlena() {
		
		this.capacidadMaxima = 1000;
		this.cantidadActual = capacidadMaxima;
	}
	
	public void CafeteraRevalsada(int cantidad) {
	
		
		if (cantidad>capacidadMaxima) {
			this.cantidadActual = capacidadMaxima;
		} else {
			this.cantidadActual = cantidad;
		}
		
	}
	
	public void llenarCafetera() {
		this.cantidadActual = capacidadMaxima;
	}
	
	public void servirTaza(int servir) {
		if (cantidadActual < servir) {
			servir -= cantidadActual;
			this.cantidadActual = 0;
			System.out.println("la cantidad actual no alcanzo para toda la taza falto servir "+servir+"cc\n");
		}else {
				this.cantidadActual -= servir;
				System.out.println("se sirvio toda la taza ahora la cafetera tiene :"+cantidadActual+"cc\n");
		}
	}
	
	public void vaciarCafetera () {
		this.cantidadActual = 0;
	}
	
	public void agregarCafe(int agregar) {
		if(agregar + cantidadActual <= capacidadMaxima) {
			
			this.cantidadActual += agregar;
			System.out.println("se agrego cafe, la cafetera tiene: "+cantidadActual+"\n");
			
		}else {
			System.out.println("SE REBALZAAAA");
			this.cantidadActual = capacidadMaxima;
		}
	}
	
	public String toString() { // el toString se hace para poder mostrar el estado actual del objeto sino no lo muestra
		String estado = "<<Estado de la cafetera actualmente>>\n";
		estado += "La cafetera tiene de cafe :"+cantidadActual+"cc\n";
		return estado;
	}

}
