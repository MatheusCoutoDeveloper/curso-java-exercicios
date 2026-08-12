package fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
//        System.out.println("Bom");
//        System.out.println(" dia! \n\n");
//
//        System.out.println("Bom");
//        System.out.println(" dia!");

//        System.out.printf("Megasena: %d %d %d %d %d %d %n",
//                1 ,2 ,3, 4, 5, 6);

//        System.out.printf("Salário: %.1f%n", 1234.5678);
//        System.out.printf("Nome: %s%n", "João");

        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantas pregas tem: ");
        int idade = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Digite o Nome: ");
        String nome = entrada.nextLine();

        System.out.println("Digite o Sobrenome: ");
        String sobrenome = entrada.nextLine();


        System.out.printf("%s %s tem %d pregas.%n", nome, sobrenome, idade);
        entrada.close();
    }
}
