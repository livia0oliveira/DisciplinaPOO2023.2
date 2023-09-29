package br.edu.principal;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		// 22P
		// Faça um programa que receba o número de lados de um polígono convexo, calcule
		// e mostre o número de diagonais desse polígono. Sabe-se que ND = N * (N − 3)/2,
		// em que N é o número de lados do polígono.
		 Scanner sc = new Scanner(System.in);
		
		int n, d;
		
		do {
			System.out.print("Numero de lados (minimo 4): ");
			n = sc.nextInt();
			if (n < 4) { System.out.println("Minimo 4 lados."); }
		}
		while (n < 4);
		
		d = n * (n - 3)/2; 
		
		System.out.println("Numero de diagonais: " + d);
		
	}

}
