// Escreva um programa que receba duas palavras e determine
// se elas são anagramas (se possuem as mesmas letras, mas em ordem diferente).
// Exemplo: "amor" e "roma".

import java.util.Arrays;
import java.util.Scanner;

public class Anagrama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a primeira palavra: ");
        String palavra1 = scan.nextLine().toLowerCase();

        System.out.print("Digite a segunda palavra: ");
        String palavra2 = scan.nextLine().toLowerCase();

        char[] letras1 = palavra1.toCharArray();
        char[] letras2 = palavra2.toCharArray();

        Arrays.sort(letras1);
        Arrays.sort(letras2);

        if (Arrays.equals(letras1, letras2)) {
            System.out.println("As palavras " + palavra1 + " e " + palavra2 + " são anagramas.");
        } else {
            System.out.println("As palavras " + palavra1 + " e " + palavra2 + " não são anagramas");
        }

    }
}
