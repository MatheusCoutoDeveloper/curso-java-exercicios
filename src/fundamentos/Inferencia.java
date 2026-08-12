package fundamentos;

public class Inferencia {
    public static void main(String[] args) {

        double a = 4.5;
        System.out.println(a);

        a = 12;
        System.out.println(a);

        // a = "..." Não é possível atribuir outro tipo de valor a uma variável já declarada com um tipo específico.

        var b = 4.5;
        System.out.println(b);

        var c = "Texto";
        System.out.println(c);

        c = "Outro texto";
        System.out.println(c);

        // c = 4.5 Não vai ser possivel também

        double d; // declarada
        d = 123.65; // variavel foi iniciada
        System.out.println(d); // variavel foi usada!

        var e = 123.45;
        System.out.println(e);

        var f = 12; //inteiro
        // f = 12.01;
        System.out.println(f);
    }
}
