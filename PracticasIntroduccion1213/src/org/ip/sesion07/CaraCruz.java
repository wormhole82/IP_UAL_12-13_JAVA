package org.ip.sesion07;

public class CaraCruz {
	
	public static void main(String[] args) {
		int cara,cruz,lanzamientos;
		lanzamientos=1000;
		cara=0;
		cruz=0;
		
		for (int i=1;i<=lanzamientos;i++){
			int tirada = (int)(Math.random()*2);
			if (tirada==1){
				cara += 1;
			} else {
				cruz += 1;
			}
		}
		cara=(cara*100)/lanzamientos;
		cruz=(cruz*100)/lanzamientos;
		
		System.out.println("Cara= "+cara+" %");
		System.out.println("Cruz= "+cruz+" %");
	}	
}