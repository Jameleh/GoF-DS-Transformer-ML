package main;

import cores.Azul;
import cores.Verde;
import cores.Vermelho;
import forma.Circulo;
import forma.Quadrado;
import forma.Retangulo;

public class Client {

	public static void main(String[] args) {
		Azul a = new Azul();
		Quadrado q1 = new Quadrado(a);
		Circulo c1 = new Circulo(a);
		Retangulo r1 = new Retangulo(a);
		
		Vermelho v1 = new Vermelho();
		Quadrado q2 = new Quadrado(v1);
		Circulo c2 = new Circulo(v1);
		Retangulo r2 = new Retangulo(v1);
		
		Verde v2 = new Verde();
		Quadrado q3 = new Quadrado(v2);
		Circulo c3 = new Circulo(v2);
		Retangulo r3 = new Retangulo(v2);
		
		/**/
		
		q1.pintaForma();
		c1.pintaForma();
		r1.pintaForma();
		
		q2.pintaForma();
		c2.pintaForma();
		r2.pintaForma();
		
		q3.pintaForma();
		c3.pintaForma();
		r3.pintaForma();
		
	}
}
