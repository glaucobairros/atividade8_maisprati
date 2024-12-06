// 3.Implemente um programa que calcule e exiba os primeiros n números
// da sequência de Fibonacci. n deve ser fornecido pelo/a usuário/a.

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a quantidade de números da sequência de Fibonacci: ");
        int n = scan.nextInt();

        int a = 0;
        int b = 1;

        System.out.print("Sequência de Fibonacci para " + n + " números: ");

        for ( int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }

    }
}
