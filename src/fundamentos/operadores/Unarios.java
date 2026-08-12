package fundamentos.operadores;

public class Unarios {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        a++; // a = a + 1
        a--; // a = a - 1

        ++b; // b = b + 1
        --b; // b = b - 1

        System.out.println(a);
        System.out.println(b);

        System.out.println(++a == b--); // true
        System.out.println(a == b); // false

//        ++a -> incrementa a antes de usar: a vira 2, valor usado = 2.
//        b-- -> usa b antes de decrementar: valor usado = 2, depois b vira 1.
//        Compara 2 == 2 -> true.

//        Nao é questao de velocidade. ++a incrementa antes de avaliar, e b-- avalia antes de decrementar; por isso a primeira comparacao dá true.
    }
}
