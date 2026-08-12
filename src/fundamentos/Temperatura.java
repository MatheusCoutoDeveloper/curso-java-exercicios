package fundamentos;

public class Temperatura {
    public static void main(String[] args) {
        // (F - 32) * 5/9 = C
        final int ajust = 32;
        final double factor = 5.0/9.0;
        double fahrenheit = 70;
        double celsius = (fahrenheit - ajust) * factor;
        System.out.println("A temperatura em Celsius é: " + celsius + "C.");

        fahrenheit = 0;
        celsius = (fahrenheit - ajust) * factor;
        System.out.println("A temperatura em Celsius é: " + celsius + "C.");
    }
}
