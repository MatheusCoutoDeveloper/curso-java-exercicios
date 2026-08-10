package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {

//        System.out.println(Locale.getDefault());
//
//        Scanner entrada = new Scanner(System.in);
//        System.out.println("Digite o primeiro salário:");
//        String salario1 = entrada.nextLine();
//
//        System.out.println("Digite o segundo salário:");
//        String salario2 = entrada.nextLine();
//
//        System.out.println("Digite o terceiro salário:");
//        String salario3 = entrada.nextLine();
//
//        salario1 = salario1.replace("R$", "").trim();
//        salario2 = salario2.replace("R$", "").trim();
//        salario3 = salario3.replace("R$", "").trim();
//
//        salario1 = salario1.replace(",", ".");
//        salario2 = salario2.replace(",",".");
//        salario3 = salario3.replace(",",".");
//
//
//        Double salario1Numerico = Double.parseDouble(salario1);
//        Double salario2Numerico = Double.parseDouble(salario2);
//        Double salario3Numerico = Double.parseDouble(salario3);
//
//        Double media = (salario1Numerico + salario2Numerico + salario3Numerico) / 3;
//        System.out.printf("A média dos salários é: %.2f%n", media);
        // entrada.close();
//

        // Resolucao do professor

        Scanner entrada1 = new Scanner(System.in);

        System.out.println("Informe o primeiro salário:");
        String valor1 = entrada1.next().replace(",",".");

        System.out.println("Informe o segundo salário:");
        String valor2 = entrada1.next().replace(",",".");

        System.out.println("Informe o terceiro salário:");
        String valor3 = entrada1.next().replace(",",".");

        double salario1 = Double.parseDouble(valor1);
        double salario2 = Double.parseDouble(valor2);
        double salario3 = Double.parseDouble(valor3);

        double mediaSalario = (salario1 + salario2 + salario3) / 3;
        System.out.println("\nA média dos salários é: " + mediaSalario);
        entrada1.close();
    }
}
