package br.edu.principal;

import java.util.*;

public class Principal {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        double hora, m, conversao; int h;

        System.out.print("Forneça a hora (ex.: 2,2): ");
        hora = sc.nextDouble();

        h = (int)hora;
        m = hora - h;

        conversao = (h * 60) + (m * 100);
        int conversao2 = (int)conversao;

        System.out.println("Temos " + conversao2 + " minutos no total");
    }

}