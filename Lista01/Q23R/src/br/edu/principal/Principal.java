package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    // QUESTAO 23
	    
	    // declarar vari�veis
	    double num, f, a; int i;
	    
	    // leitura
	    System.out.print("Insira um n�mero: ");
	    num = sc.nextDouble();
	    System.out.println();
	    
	    i = (int)num;
	    f = num - i;
	    a = Math.round(num);
	    
	    System.out.print("Valor inteiro do n�mero: ");
	    System.out.println(i);
	    
	    System.out.print("Valor fracionado do n�mero: ");
	    System.out.println(f);
	    
	    System.out.print("Valor arredondado do n�mero: ");
	    System.out.println(a);
	    
	}
}