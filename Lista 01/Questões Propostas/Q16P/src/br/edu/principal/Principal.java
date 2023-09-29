package br.edu.principal;

import java.util.*;
import java.text.*;

public class Principal {

	public static void main(String[] args) {
		// 16P
		//Faça um programa que receba o valor dos catetos de um triângulo, calcule e mostre
		//o valor da hipo-tenusa.
		
		DecimalFormat casas = new DecimalFormat("0.00");
		Scanner sc = new Scanner(System.in);
		
		double c1, c2, h;
		
		System.out.print("Cateto 1: ");
		c1 = sc.nextDouble();
		
		System.out.print("Cateto 2: ");
		c2 = sc.nextDouble();		
		h =  Math.sqrt(c1*c1 + c2*c2);
		
		System.out.println("A hipotenusa é (aproximadamente): " + casas.format(h));
		
	}

}
