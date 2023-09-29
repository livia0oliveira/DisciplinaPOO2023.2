package br.edu.principal;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		//Faça um programa que receba a medida de dois ângulos de um triângulo, calcule e mostre
		//a medida do terceiro ângulo. Sabe-se que a soma dos ângulos de um triângulo é 180 graus.

		Scanner sc = new Scanner(System.in);  
		
		int ang1,ang2,ang3;
		
		System.out.print("Angulo 1: ");
		ang1 = sc.nextInt();
		
		System.out.print("Angulo 2: ");
		ang2 = sc.nextInt();
		
		ang3 = 180 - (ang1 + ang2);
		
		if (ang3 <= 0){
			System.out.println("Aí num tem como né meu patrão, num seje engraçadinho nao");
			
		}
		else {
			System.out.println("Angulo 3: "+ang3);
		}
		
	}

}
