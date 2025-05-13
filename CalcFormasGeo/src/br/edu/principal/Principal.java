package br.edu.principal;

import br.edu.FigurasGeometricasPlanas.*;

public class Principal {

	public static void main(String[] args) {
		
		Triangulo fg1 = new Triangulo();
		fg1.recebeAltura(7);
		fg1.recebeBase(10);
		fg1.calArea();
		fg1.mostrarArea();
		double recebeArea = fg1.mostrarAreaComRetorno();

		Retangulo fg2 = new Retangulo();
		fg2.recebeAltura(7);
		fg2.recebeBase(10);
		fg2.calArea();
		fg2.mostrarArea();
		double recebeArea1 = fg2.mostrarAreaComRetorno();

	}

}

