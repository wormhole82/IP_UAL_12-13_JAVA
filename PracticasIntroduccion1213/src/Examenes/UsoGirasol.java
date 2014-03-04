package Examenes;

public class UsoGirasol {

	public static void main(String[] args) {
		Girasol girasol1 = new Girasol(new Coordenadas(1,2),3);
		Girasol girasol2 = new Girasol(new Coordenadas(1,3),5);
		Girasol girasol3 = new Girasol(new Coordenadas(1,4),7);
		Girasol girasol4 = new Girasol(new Coordenadas(1,5),1);
		Coordenadas sol = new Coordenadas(1, 8);
		Girasol.setModo(true);

		do {
			if (Math.random() * 2 < 1) {
				Girasol.setModo(true);
				sol.setX(1);

				System.out.println("La posicion de destino es (" + sol.getX()+ " , " + sol.getY() + ")");
				System.out.println("Las horas del luz en las que el girasol1 a estado expuesto son: "+ girasol1.getContadorLuz()+ " "+ girasol1.giro(sol.getX()));
				System.out.println("Las horas del luz en las que el girasol2 a estado expuesto son: "+ girasol2.getContadorLuz()+ " "+ girasol2.giro(sol.getX()));
				System.out.println("Las horas del luz en las que el girasol3 a estado expuesto son: "+ girasol3.getContadorLuz()+ " "+ girasol3.giro(sol.getX()));
				System.out.println("Las horas del luz en las que el girasol4 a estado expuesto son: "+ girasol4.getContadorLuz()+ " "+ girasol4.giro(sol.getX()));
			
			}else {
				
				Girasol.setModo(false);
			}
		}while (!(girasol1.validarContador() == false&& girasol2.validarContador() == false&& girasol3.validarContador() == false && girasol4.validarContador() == false));
		
		System.out.println("Todos los girasoles estan listos para ser recolectados");
	}
}