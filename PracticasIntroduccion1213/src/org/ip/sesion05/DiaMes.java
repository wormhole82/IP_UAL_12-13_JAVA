package org.ip.sesion05;
import org.ip.entradaInteractiva.*;

public class DiaMes {

	public static void main(String[] args) {
		
		//declaracion de variables
		int año, mes;
		
		//solicitamos entrada de datos por teclado
		System.out.print("Introduce el mes:");
		mes=EntradaInteractiva.leerEntero();
		System.out.print("Introduce el a�o:");
		año=EntradaInteractiva.leerEntero();
		
		//ejectumos las sentencias segun los datos introducidos
		if (año<0){
			System.out.println("El mes "+mes+" del a�o "+año+" A.C. tiene "+calcularDias(mes,año)+" d�as.");
	    }else if ((mes<1)||(mes>12)){
		System.out.println("���ERROR. Un a�o tiene 12 meses!!!");
			}else 
			System.out.println("El mes "+mes+" del a�o "+año+" tiene "+calcularDias(mes,año)+" d�as.");
	}
	
	//metodo para calcular los dias que tiene un mes
		private static int calcularDias(int mesTemp, int annioTemp) {
			int totalDias;

			if ((mesTemp==1)||(mesTemp==3)||(mesTemp==5)||(mesTemp==7)||(mesTemp==8)||(mesTemp==10)||(mesTemp==12))
				totalDias=31;
			else if (mesTemp==2)
				if (bisiesto(annioTemp)==true)
					totalDias=29;
						else
						totalDias=28;
							else
							totalDias=30;
			return totalDias;
			}	
	
		//metodo para calcular si un mes es bisiesto
		private static boolean bisiesto (int año){
			return ((año%4==0)&&(año%100!=0))||(año%400==0);
		}
	}