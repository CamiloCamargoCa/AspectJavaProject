package javapackage;

public class Main {

	public static void main(String[] args) {
		CajaAhorros objCajaAhorro = new CajaAhorros();
		
		objCajaAhorro.depositar(1000);
		objCajaAhorro.retirar(200);
		objCajaAhorro.depositar(100);
		
		System.out.println("Java: Tener una imaginación mas alta de la consola como salida..");

	}

}
