package ejercicio2;

public class Main {

	public static void main(String args[]){
		
		Cafetera cafetera = new Cafetera (); // creo el objeto cafetera de la clase Cafetera
		
		//cafetera.CafeteraLlena(); // ejecuto el metodo - lleno la cafetera
		
		cafetera.CafeteraRevalsada(650);
		
		System.out.println(cafetera);
		
		//cafetera.llenarCafetera();
		
		cafetera.servirTaza(250);
		
		cafetera.servirTaza(250);
		
		cafetera.servirTaza(250);
		
		System.out.println(cafetera);
		
		cafetera.agregarCafe(550);
		
		System.out.println(cafetera);
		
		cafetera.agregarCafe(100);
		System.out.println(cafetera);
		
	}

}
