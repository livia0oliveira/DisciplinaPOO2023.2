package br.edu.principal;
import java.util.*;
import java.text.*;

public class Principal {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int ang, alt; double escada, radiano;
		
		DecimalFormat casas;
		
		casas = new DecimalFormat("0.00");
		
		System.out.print("Angulo: ");
		ang = sc.nextInt();
		
		System.out.print("Altura: ");
		alt = sc.nextInt();
		
		radiano = (ang * 3.14)/180;
		escada = alt/radiano;
		
		System.out.println("Escada: "+casas.format(escada)+"°");
	}

}