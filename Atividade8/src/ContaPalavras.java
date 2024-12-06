// Escreva um programa que leia uma frase e conte o número de palavras nela.
// Considere que as palavras estão separadas por espaços em branco.

import java.util.Scanner;

public class ContaPalavras {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scan.nextLine().trim();

        String[] palavras = frase.split("\\s+");
        System.out.println("A frase digitada possui " + palavras.length + " palavras.");
    }
}
