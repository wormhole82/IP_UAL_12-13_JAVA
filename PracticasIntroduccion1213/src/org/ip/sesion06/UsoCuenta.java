package org.ip.sesion06;
import org.ip.entradaInteractiva.*;

public class UsoCuenta {

	public static void main(String[] args) {
		//DECLARACION DE VARIABLES
		int respuesta;
		double sumar,restar,trans;
		
		//INCIAMOS LAS VARIABLES CON VALORES PREDETERMINADOS
		String saldoInsuficiente;
		restar=5000;
		trans=1000;
		sumar=150;
		saldoInsuficiente="SALDO INSUFICIENTE PARA REALIZAR LA OPERACION";
		
		
		
		//CREACION DE OBJETOS CON VALOR PREDERTERMINADO
		Cuenta cuenta1 = new Cuenta(10000);
		Cuenta cuenta2 = new Cuenta(700);
		//CREACION DE OBJETO DE REFERENCIA PARA REALIZAR LAS OPERACIONES
		Cuenta cuentaGenerica = new Cuenta();
		
		cuenta1.retirar(50);
		System.out.println("Restar "+cuenta1.saldoActual());
		
		//MOSTAR SALDO INCIAL DE LAS CUENTAS
		System.out.println("En la cuenta 1 el saldo incial es de: "+cuenta1.saldoActual()+" Û");
		System.out.println("En la cuenta 2 el saldo incial es de: "+cuenta2.saldoActual()+" Û");

		//SOLICITAR AL USUARIO CON QUE CUENTA QUIERE TRABAJAR
		System.out.println("ÀQue cuenta quieres utilizar?\nPara usar la cuenta1 *PULSA 1*\nPara usar la cuenta2 *PULSA 2*");
		//UTILIZAMOS EL TRY/CATCH PARA CONTROLAR LAS EXCEPCIONES
		try{
		respuesta=EntradaInteractiva.leerEntero();

		//UTILIZACION DE UN METODO PARA COMPROBAR QUE SOLO TIENES 2 CUENTAS OPERATIVAS
		if (comprobar(respuesta)==false){
			System.out.println("ÁSOLO TIENES 2 CUENTAS!");
		}else{
		
			//SENTENCIA PARA DISTINGUIR CON QUE CUENTA QUIERES TRABAJAR
			if (respuesta==1)
				cuentaGenerica=cuenta1;
			if (respuesta==2)
				cuentaGenerica=cuenta2;
				
				//METODO PARA INGRESAR DINERO
				cuentaGenerica.ingresar(sumar);
				System.out.println("Ingresamos "+sumar+" Û en la cuenta"+respuesta+"\n"+cuentaGenerica.toString());
				System.out.println("\nRetiramos "+restar+" Û de la cuenta"+respuesta);
				
				//METODO PARA SACAR DINERO(SI ES POSIBLE)
				if (cuentaGenerica.retirar(restar)==true){
				System.out.println("Has retirado de la cuenta"+respuesta+" "+restar+" Û \n"+cuentaGenerica.toString());
				}else{
				System.out.println(saldoInsuficiente);
				}
				System.out.println("\nTransferimos "+trans+" Û de la cuenta"+respuesta+" a la cuenta"+numeroCuenta(respuesta));
			
			//METODO PARA TRANSFERIR DINERO ENTRE CUENTAS(SI ES POSIBLE)
			if ((respuesta==1)&&(cuenta1.transferir(trans,cuenta2)==true)){
				System.out.println("Transferencia correcta");
			}else if ((respuesta==2)&&(cuenta2.transferir(trans,cuenta1)==true)){
				System.out.println("Transferencia correcta");
			}else{	
				System.out.println(saldoInsuficiente);
			}
		
		//MOSTAR POR PANTALLA EL SALDO ACTUALIZADO DE LAS 2 CUENTAS
			System.out.println("\nEl saldo actualizado de la cuenta 1 es: "+cuenta1.saldoActual()+" Û");
			System.out.println("El saldo actualizado de la cuenta 2 es: "+cuenta2.saldoActual()+" Û");
			}
	}catch (Exception e){
		System.out.println("No es un numero de cuenta valido.\nEjecuta de nuevo");
	}
}
	//METODO PARA ASIGNAR UN NUMERO DE CUENTA A UNA VARIABLE
	private static int numeroCuenta(int respuestaTemp){
		if (respuestaTemp==1){
			return respuestaTemp=2;
		}else{
			return respuestaTemp=1;
		}
	}
	//METODO PARA COMPROBAR QUE SOLO TENEMOS 2 CUENTAS PARA TRABAJAR
	private static boolean comprobar(int valor){
		if ((valor==1)||(valor==2)){
			return true;
			}else{
				return false;
		}
	}
}