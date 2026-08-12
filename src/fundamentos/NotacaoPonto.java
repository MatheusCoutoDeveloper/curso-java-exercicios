package fundamentos;

import java.util.Locale;

public class NotacaoPonto {
    public static void main(String[] args) {
        String s = "Bom dia X";
        s = s.replace("X", "Senhora");
        s = s.toUpperCase();
        s = s.concat("!!!");

        System.out.println(s);

        String x = "Leo".toLowerCase();
        System.out.println(x);

        String y = "Bom dia X"
                .replace("X","Gui")
                .toUpperCase()
                .concat("!!!");

        System.out.println(y);

        System.out.println("O tamanho da String é: " + s.length());

        //Tipos primitivos não tem operador "."

        int a = 3;

        // É com o ponto que acessamos os métodos de uma classe, no caso a classe Integer
        System.out.println("O valor mínimo de um inteiro é: " + Integer.MIN_VALUE);
        System.out.println("O valor máximo de um inteiro é: " + Integer.MAX_VALUE);
    }
}
