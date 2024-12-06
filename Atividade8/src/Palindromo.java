// 2.Crie um programa que leia uma palavra e verifique se ela é um palíndromo
//(se pode ser lida da mesma forma de trás para frente). Ignore diferenças
// entre maiúsculas e minúsculas.

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = scan.nextLine();

        palavra = palavra.toLowerCase();

        boolean ehPalindromo = true;

        for (int i = 0; i < palavra.length() / 2; i++) {
            if (palavra.charAt(i) != palavra.charAt(palavra.length() - 1 - i)) {
                ehPalindromo = false;
            }
        }

        if (ehPalindromo) {
            System.out.println(" A palavra " + palavra + " é um palíndromo.");
        } else {
            System.out.println(" A palavra " + palavra + " não é um palíndromo");
        }
    }
}
