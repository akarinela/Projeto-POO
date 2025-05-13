package br.edu.FigurasGeometricasPlanas;

public class Triangulo {
	
	private double base;
	private double altura;
	private double area;
	
	public Triangulo() {
		base = 0;
		altura = 0;
		area = 0;
		
	}
	
	public void recebeAltura(double altura) {
		this.altura = altura;
	}
	
	public void recebeBase(double pBase) {
		base = pBase;
		
	}
	
	public void calArea() {
		area = (base * altura)/2;
	
	}
	
	public void mostrarArea() {
		System.out.println (area);
	}
	
	public double mostrarAreaComRetorno() {
		System.out.println (area);
		return area;
	}
}
