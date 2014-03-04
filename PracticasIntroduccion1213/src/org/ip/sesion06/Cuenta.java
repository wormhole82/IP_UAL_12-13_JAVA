package org.ip.sesion06;

public class Cuenta {
	
	//DECLARAMOS LA VARIABLE
	private double saldo;
	
	//CREAMOS EL OBJETO
	public Cuenta(){
	}
	//CREAMOS EL OBJETO REFERENTE PARA LAS OPERACIONES
	public Cuenta(Cuenta copia){
		this.saldo=copia.saldo;
	}
	//ASIGNAMOS AL OBJETO SU ATRIBUTO
	public Cuenta(double dinero){
		this.saldo=dinero;
	}
	//METODO PARA SABER EL SALDO ACTUALIZADO
	public double saldoActual() {
		return saldo;
	}
	//METODO PARA INGRESAR DINERO
	public void ingresar(double dinero) {
			saldo+= dinero;
	}
	//METODO PARA RETIRAR DINERI SI SE DISPONE DE SALDO
	public boolean retirar(double dinero) {
				if(saldo<dinero){
					return false;
				}else{
					saldo-=dinero;
					return true;
			}	
	}
	//METODO PARA TRANSFERIR DINERO ENTRE CUENTAS SI FUERA POSIBLE
	public boolean transferir(double dinero, Cuenta transferencia) {
			if(retirar(dinero)==true){
				transferencia.saldo+=dinero;
				return true;
			}else{
			return false;
		}
	}
	//METODO TOSTRING PARA MOSTRAR EL SALDO ACTUALIZADO
	public String toString(){
		return new String ("Saldo Actualizado: "+saldo+" Û");
	}
}