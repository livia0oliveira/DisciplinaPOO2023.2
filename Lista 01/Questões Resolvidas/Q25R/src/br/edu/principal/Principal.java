package br.edu.principal;

import java.util.*;

public class Principal {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int custo, conv, qtd;
		
		System.out.print("Custo do espetaculo: ");
		custo = sc.nextInt();
		System.out.print("Valor por convites: ");
		conv = sc.nextInt();
		
		qtd = custo/conv;
		
		System.out.println("Quantidade de convites a serem vendidos: "+qtd);
		
	}	//fim main
}
