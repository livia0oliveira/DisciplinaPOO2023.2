package br.edu.principal;

import java.util.*;

public class Principal {
	
	public static void main(String[] args) {
		//2. Faça um programa que receba três números, calcule e mostre a multiplicação
		//desses números.
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.print("Primeiro número: ");
		a = sc.nextInt();
		
		System.out.print("Segundo número: ");
		b = sc.nextInt();
		
		System.out.print("Terceiro número: ");
		c = sc.nextInt();
		
		System.out.println("A multiplicação desses números é: " + (a * b * c));
		
	}

}
