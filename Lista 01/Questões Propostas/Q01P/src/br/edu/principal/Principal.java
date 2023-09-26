package br.edu.principal;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		//Faça um programa que receba dois números, calcule e mostre a subtração
		//do primeiro número pelo segundo.
		
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		System.out.print("Primeiro número: ");
		a = sc.nextInt();
		
		System.out.print("Segundo número: ");
		b = sc.nextInt();
		
		System.out.println("Subtração dos números é igual a: " + (a - b));

	}

}
