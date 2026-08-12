package fundamentos.operadores;

import java.util.Scanner;

public class TipoStringEquals {
    public static void main(String[] args) {
        System.out.println("2" == "2"); // true

        String s1 = new String("2");
        System.out.println(s1.equals("2")); //true
        System.out.println(s1 == "2"); // false

        Scanner entrada = new Scanner(System.in);

        String s2 = entrada.next(); // 2
        System.out.println("2" == s2.trim()); // false
        System.out.println("2".equals(s2.trim())); // true
    }
}
