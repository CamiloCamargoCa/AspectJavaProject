//package aspectjpackage;
//import javapackage.*;

/*public aspect ControlDos {
	pointcut cambioCajaAhorros(CajaAhorros cajahorros):
	(call(* depositar(..)) || call (* retirar(..))) && target(cajahorros);
	
	after(CajaAhorros cajahorros): cambioCajaAhorros(cajahorros){
		System.out.println("Aspect: Balance = "+cajahorros.balance);
	}
}
*/