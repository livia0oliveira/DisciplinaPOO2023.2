package br.edu.principal;

import java.util.*;

// Q01 CAP 8 ============================

public class Principal {
	
	public static int verify (int num) {
		int res;
		
		if (num >= 0) { res = 1; }
		else { res = 0; }
		
		return res;
		
	}//fim sub
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num, x;
		
		System.out.print("Insira um numero: ");
		num = sc.nextInt();
		x = verify(num);
		
		if (x == 1) { System.out.println("O numero é positivo"); }
		else { System.out.println("O numero é negativo"); }
		
	}//fim main
}


