//Crie um jogo em que o programa escolhe um número entre 1 e 50,
// e o/a usuário/a deve adivinhar. O programa informa apenas se o palpite
// está certo ou errado. O jogo termina quando o número é adivinhado.

import java.util.Scanner;

public class AdivinhaNumero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int numero = (int) (Math.random() * 50) + 1;
        int palpite;

        System.out.println("Adivinhe o número entre 1 e 50:");

        do {
            System.out.print("Seu palpite: ");
            palpite = scan.nextInt();

            if (palpite == numero) {
                System.out.println("Parabéns! Você acertou!");
            } else {
                System.out.println("Você errou! Tente novamente.");
            }
        } while (palpite !=numero);
    }
}
