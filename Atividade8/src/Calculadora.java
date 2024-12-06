// 1. Escreva um programa que peça dois números e um operador (+, -, *, /).
// Realize a operação indicada e exiba o resultado.


import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scan.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scan.nextDouble();

        System.out.print("Digite o operador (+, -, *, /): ");
        String operador = scan.next();

        double resultado = 0;

        switch (operador) {
            case "+":
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;
            case "-":
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;
            case "*":
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;
            case "/":
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Divisão por zero não permitida");
                }
                break;
            default:
                System.out.println("Operador Inválido. Utilize +, -, * ou / para realizar o cálculo.");
        }
    }
}
