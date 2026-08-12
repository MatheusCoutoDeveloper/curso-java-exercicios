package fundamentos.operadores;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Desafio Calculadora");

        System.out.println("Digite o primeiro número: ");
        double num1 = entrada.nextDouble();

        System.out.println("Digite o segundo número: ");
        double num2 = entrada.nextDouble();

        System.out.println("Escolha a operação: +, -, *, / , %");
        char operador = entrada.next().charAt(0);

        double soma = operador == '+' ? num1 + num2 : 0;
        double subtracao = operador == '-' ? num1 - num2 : 0;
        double multiplicacao = operador == '*' ? num1 * num2 : 0;
        double divisao = operador == '/' ? num1 / num2 : 0;
        double resto = operador == '%' ? num1 % num2 : 0;

        Double resultado = operador == '+'
                ? soma : operador == '-'
                ? subtracao : operador == '*'
                ? multiplicacao : operador == '/'
                ? divisao : operador == '%' ? resto : 0;

        System.out.printf("Resultado formatado: %.2f %c %.2f = %.2f", num1, operador, num2, resultado);
    }
}
