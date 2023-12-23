package ejercicio.conjunto;

import java.util.HashSet;
import java.util.Set;

public class ConjuntosEjercicio {

	public static void main(String[] args) {
		
		String servidorA = "usuario1@dominio.com;usuario2@dominio.com;gabriel@dominio.com;gabriel@protonmail.com;gm@grupofmo.com;kevinmitnick@mnsecurity.com;rms@gnu.org;linus@kernel.org;jamesgosling@cmu.edu;dennisritchie@harvard.edu;kenthompson@berkeley.edu";
		String servidorB = "usuario1@dominio.com;usuario2@dominio.com;usuario3@dominio.com;darksoul@protonmail.com;rcd@rcd.com;davek@mnsecurity.com;rms@gnu.org;mdeicaza@gnome.org;alan.turing@ieee.org;gabriel.morejon@presidencia.gob.ec;user1000@berkeley.edu";
		
		String [] cuentasA = servidorA.split(";");
		String [] cuentasB = servidorB.split(";");
		
		Set <String> conjuntoA = new HashSet<>();
		Set <String> conjuntoB = new HashSet<>();
		
		for(String cuenta : cuentasA) {
			conjuntoA.add(cuenta);
		}
		for(String cuenta : cuentasB) {
			conjuntoB.add(cuenta);
		}
		System.out.println("Cuentas del Servidor A");
		System.out.println(servidorA);
		System.out.println("\nCuentas del Servidor B");
		System.out.println(servidorB);
		
		Set<String> conjuntoDepurado = new HashSet<>();
		conjuntoDepurado.addAll(conjuntoA);
		conjuntoDepurado.addAll(conjuntoB);
		
		System.out.println("\nResultado de la depuración.");
		System.out.println(conjuntoDepurado);
		
	}

}
