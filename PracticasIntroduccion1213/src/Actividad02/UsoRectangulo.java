package Actividad02;

public class UsoRectangulo {

	public static void main(String[] args) {
		
		Rectangulo rect1 = new Rectangulo(0,0,100,200);
		Rectangulo rect2 = new Rectangulo(10,10,400,600);
		Rectangulo rect3 = new Rectangulo(rect1);
		
		//antes de desplazar rect1
		System.out.println("ANTES DE DESPLAZAR EL RECTANGULO 1");
		System.out.println("**********************************");
		System.out.println(rect1.toString());
		System.out.println(rect2.toString());
		System.out.println(rect3.toString());
		
		rect1.desplazar(20,20);
		//Despues de desplazar rect1
		System.out.println("\nDESPUES DE DESPLAZAR EL RECTANGULO 1");
		System.out.println("**********************************");
		System.out.println(rect1.toString());
		System.out.println(rect2.toString());
		System.out.println(rect3.toString());
	}
}