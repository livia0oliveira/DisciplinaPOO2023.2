package br.edu.principal;

import java.util.*;

public class Principal {
	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double area, raio;
		
		System.out.print("Forneça o raio do circulo: ");
		raio = sc.nextDouble();
		
		area = Math.PI * Math.pow(raio, 2);
		int area2 = (int)area;

		System.out.print("A area do circulo é igual a: " + area2);
		
	}
	
}
