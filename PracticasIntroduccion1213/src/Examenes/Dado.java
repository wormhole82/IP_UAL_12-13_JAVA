package Examenes;

public class Dado {

	public static void main(String[] args) {
		int[] caras = new int[6];
		int tirada;
		
		for (int i = 0; i < 1000000; i++) {
			tirada = (int) (Math.random()*6);
			caras[tirada]++;
		}
		for (int j = 0; j < 6; j++) {

			System.out.println("El numero de caras con " + (j+1) + " es " + caras[j] +" "+ caras[j]/10000 +"%");
		}
	}
}