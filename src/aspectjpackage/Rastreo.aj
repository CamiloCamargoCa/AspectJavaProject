package aspectjpackage;

import javapackage.CajaAhorros;

public aspect Rastreo {
	pointcut losMetodosPublicos(Object t):
	target(t) && execution(* javapackage..*(..)) && !within(Rastreo);
	
	before(Object t): losMetodosPublicos(t){
		System.out.println("Entrando: "+thisJoinPoint.getSignature());
	}
}
