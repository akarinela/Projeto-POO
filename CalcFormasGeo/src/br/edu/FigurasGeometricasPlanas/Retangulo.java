package br.edu.FigurasGeometricasPlanas;

public class Retangulo {
		
		private double base;
		private double altura;
		private double area;
		
		public Retangulo() {
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
			area = (base * altura);
		}
		
		
		public void mostrarArea() {
			System.out.println (area);
		}
		
		public double mostrarAreaComRetorno() {
			System.out.println (area);
			return area;
		}
}
