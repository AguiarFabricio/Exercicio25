package exercicio25;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Exercicio25 {

    public static void main(String[] args) {
        int[] numeros = new int[20];
        int soma = 0;

        for (int i = 0; i < 20; i++) {
            String input = JOptionPane.showInputDialog("Digite o número " + (i + 1) + ":");
            numeros[i] = Integer.parseInt(input);
            soma += numeros[i];
        }

        double media = (double) soma / 20;

        JOptionPane.showMessageDialog(null,
                "Soma dos números: " + soma + "\nMédia aritmética: " + media);
    }
}
