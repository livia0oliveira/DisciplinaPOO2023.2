package br.edu.principal;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		//Fa�a um programa que receba dois n�meros, calcule e mostre a subtra��o
		//do primeiro n�mero pelo segundo.
		
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		System.out.print("Primeiro n�mero: ");
		a = sc.nextInt();
		
		System.out.print("Segundo n�mero: ");
		b = sc.nextInt();
		
		System.out.println("Subtra��o dos n�meros � igual a: " + (a - b));

	}

}
