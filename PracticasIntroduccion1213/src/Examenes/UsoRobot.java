package Examenes;

public class UsoRobot {

	public static void main(String[] args) {
		
		int sumaFotos;
		int sumaPersonas;
		
		Robot robot1 = new Robot(new Coordenadas(1, 2));
		Robot robot2 = new Robot(new Coordenadas(1, 3));
		Robot robot3 = new Robot(new Coordenadas(1, 4));
		Robot robot4 = new Robot(new Coordenadas(1, 5));
		Coordenadas desplaza = new Coordenadas(0, 1);
		
		Robot.setVelocidad(100);
		
		System.out.println("\nLa velocidad de los robots es: "+Robot.getVelocidad()+"\n");
		
		if(Robot.getVelocidad()>0){
		
			do {
			
				robot1.desplazamiento(desplaza);
				robot2.desplazamiento(desplaza);
				robot3.desplazamiento(desplaza);
				robot4.desplazamiento(desplaza);
		
			} while (robot1.desplazamiento(desplaza) != false&& robot2.desplazamiento(desplaza) != false&& robot3.desplazamiento(desplaza) != false&& robot4.desplazamiento(desplaza) != false);
		
			System.out.println("\nLos robots llegaron a su destino:");
			System.out.println("\nEl robot 1 vio: \n" + robot1.toString());
			System.out.println("\nEl robot 2 vio: \n" + robot2.toString());
			System.out.println("\nEl robot 3 vio: \n" + robot3.toString());
			System.out.println("\nEl robot 4 vio: \n" + robot4.toString());
		
		
		sumaFotos=(robot1.getContadorObjetosFijos()+robot2.getContadorObjetosFijos()+robot3.getContadorObjetosFijos()+robot4.getContadorObjetosFijos());
		System.out.println("\nSuma de todas las fotos:"+sumaFotos);
		
		sumaPersonas=(robot1.getContadorObjetosMoviles()+robot2.getContadorObjetosMoviles()+robot3.getContadorObjetosMoviles()+robot4.getContadorObjetosMoviles());
		System.out.println("\nSuma de todas las parsonas:"+sumaPersonas);
		
		}else{
		
		System.out.println("Los robots estan parados.");
		}
	}	
}