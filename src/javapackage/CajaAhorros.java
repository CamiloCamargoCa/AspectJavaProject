package javapackage;

public class CajaAhorros {
public int balance;
	
	public void depositar(int dinero) {
		balance += dinero;
		System.out.println("Java: El deposito fue efectivo..");
	}
	
	public boolean retirar(int dinero) {
		if (balance - dinero > 0) {
			balance -= dinero;
			System.out.println("Java: El deposito fue efectivo..");
			return true;
		}else {
			System.out.println("Java: El deposito no fue efectivo..");
			return false;
		}
	}
}
