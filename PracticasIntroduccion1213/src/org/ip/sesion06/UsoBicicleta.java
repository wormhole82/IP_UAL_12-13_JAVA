package org.ip.sesion06;
public class UsoBicicleta {

	public static void main(String[] args) {
		
		//Creacion de objetos definidos 
		Bicicleta biciIndurain = new Bicicleta(3,5,2);
		Bicicleta biciCarlos = new Bicicleta(4,2,8);
		Bicicleta biciRamon = new Bicicleta(6,4,1);
		//mostramos con el metodo toString todos los atributos de las bicicletas
		System.out.println("La bici de Indurain tiene estas caracteristicas:\n"+biciIndurain.toString());
		System.out.println("\nLa bici de Carlos tiene estas caracteristicas:\n"+biciCarlos.toString());
		System.out.println("\nLa bici de Ramon tiene estas caracteristicas:\n"+biciRamon.toString());
		//mostramos datos varios
		System.out.println("\nLa cadencia de la bici de Indurain es: "+biciIndurain.getCadencia());
		System.out.println("La velocidad de la bici de Carlos es: "+biciCarlos.getMarcha());
		System.out.println("La marcha de la bici de Ramon es: "+biciRamon.getVelocidad());
		//mostramos el numero total de bicicletas
		System.out.println("\nEl numero total de bicicletas es: "+Bicicleta.getNumeroBicicletas());
		//mostramos el id asignado a una bici determinada
		System.out.println("El numero de la bicicleta de Indurain es: "+biciIndurain.getId());
		//utilizamos el metodo para frenar
		biciCarlos.frenar(2);
		//mostramos el resultado tras frenar
		System.out.println("\nLa bici de Carlos frena 2, ahora su velocidad es : "+biciCarlos.getVelocidad());
		//utilizamos el metodo acelerar 
		biciRamon.acelerar(3);
		//mostramos el resultado tras acelerar
		System.out.println("La bici de Ramon acelera 3, ahora su velocidad es : "+biciRamon.getVelocidad());	
	}
}