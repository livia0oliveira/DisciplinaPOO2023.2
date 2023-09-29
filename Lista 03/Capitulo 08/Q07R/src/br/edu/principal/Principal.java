package br.edu.principal;
import java.util.*;

//ALGORITMO
//DECLARE nota1, nota2, nota3, m NUMÉRICO
//letra LITERAL
//LEIA nota1
//LEIA nota2
//LEIA nota3
//REPITA
//LEIA letra
//ATÉ (letra = “A”) OU (letra = “P”)
//m ← calcula_media(nota1, nota2, nota3, letra)
//SE letra = “A”
//ENTÃO ESCREVA “A média aritmética “ , m
//SENÃO ESCREVA “A média ponderada “, m
//FIM_ALGORITMO.

//SUB-ROTINA calcula_media(n1, n2, n3 NUMÉRICO, l LITERAL)
//DECLARE media NUMÉRICO
//SE l = “A”
//ENTÃO media ← (n1+n2+n3)/3
//SENÃO media ←(n1*5+n2*3+n3*2)/(5+3+2)
//RETORNE media
//FIM_SUB_ROTINA calcula_media

public class Principal {

	public static double calcM (double n1, double n2, double n3, String l) {
		double media;
		if (l.equals("a")) {
			media = (n1+n2+n3)/3;
			
		} else {
			media = (n1*5+n2*3+n3*2)/(5+3+2);
			
		}
		
		return media;
		
	}//fim sub
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double n1, n2, n3, m;
		String letra = null;
		
		System.out.print("Nota 1: "); n1 = sc.nextDouble();
		System.out.print("Nota 2: "); n2 = sc.nextDouble();
		System.out.print("Nota 3: "); n3 = sc.nextDouble();
		
		
		System.out.print("Como deseja calcular a média?(\"a\" ou \"p\"): ");
		
		
		letra = sc.next();

		m = calcM(n1, n2, n3, letra);
		
		if (letra.equals("a")) {
			System.out.println("A média aritmetica é: " + m);
		} else {System.out.println("A média ponderada é: " + m);}

	} // fim main
}
