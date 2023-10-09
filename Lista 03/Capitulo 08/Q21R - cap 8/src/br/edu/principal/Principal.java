package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y = 0;

        do {
            System.out.print("Digite o valor de x (ou igual a y para sair): ");
            x = scanner.nextInt();

            if (x != y) {
                System.out.print("Digite o valor de y: ");
                y = scanner.nextInt();

                if (x < y) {
                    int soma = calcularSomaPrimos(x, y);
                    System.out.println("Soma dos números primos entre " + x + " e " + y + ": " + soma);
                } else {
                    System.out.println("x deve ser menor que y. Tente novamente.");
                }
            }

        } while (x != y);

        System.out.println("Programa encerrado.");
    }

    public static int calcularSomaPrimos(int x, int y) {
        int soma = 0;

        for (int i = x; i <= y; i++) {
            if (ehPrimo(i)) {
                soma += i;
            }
        }

        return soma;
    }

    public static boolean ehPrimo(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
