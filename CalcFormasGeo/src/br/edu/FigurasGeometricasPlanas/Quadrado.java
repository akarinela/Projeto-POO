package br.edu.FigurasGeometricasPlanas;

public class Quadrado {
	
	private double lado;
	private double area;
	
	public Quadrado() {
		lado = 0;
		area = 0;
		
	}
	
	public void recebeLado(double Lado) {
		this.lado = Lado;
	}
	
	public void calcAreA() {
		area = (lado * lado);
	}
	
	
	public void mostrarArea() {
		System.out.println (area);
	}
	
	public double mostrarAreaComRetorno() {
		System.out.println (area);
		return area;
	}
}

