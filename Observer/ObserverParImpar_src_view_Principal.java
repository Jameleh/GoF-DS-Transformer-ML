package view;

import controller.Observador;
import controller.Observavel;

public class Principal {

	public static void main(String[] args) {
		Observador observador = new Observador();
		Observavel observavel = new Observavel(observador);
		Observavel observavel2 = new Observavel(observador);
		Observavel observavel3 = new Observavel(observador);
		
		observavel.aleatorio();
		observavel2.aleatorio();
		observavel3.aleatorio();
		
	}
	
}
