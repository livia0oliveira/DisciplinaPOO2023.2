package br.edu.principal;

import java.util.*;

public class Principal {
	
	public static void main(String[] args) {
		//2. Fa�a um programa que receba tr�s n�meros, calcule e mostre a multiplica��o
		//desses n�meros.
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.print("Primeiro n�mero: ");
		a = sc.nextInt();
		
		System.out.print("Segundo n�mero: ");
		b = sc.nextInt();
		
		System.out.print("Terceiro n�mero: ");
		c = sc.nextInt();
		
		System.out.println("A multiplica��o desses n�meros �: " + (a * b * c));
		
	}

}
