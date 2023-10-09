package br.edu.principal;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		int n[] = new int[2];    
        
        for (int i = 0; i < n.length; i++) {    
            n[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (1 + i) + "� numero"));    
        }
         
        for (int i = 0; i < n.length; i++) {
            if( ehPrimo(n[i]) )
                System.out.println(n[i] + " � primo. Posi��o no vetor: " + i);
            else {
            	System.out.println("N�o � primo. Posi��o no vetor: " + i);
            }
        }    
    }
     
    private static boolean ehPrimo(int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;   
        }
        return true;

	}

}
