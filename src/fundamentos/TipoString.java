package fundamentos;

public class TipoString {
    public static void main(String[] args) {
        String s = "Bom dia";

        s = s.toUpperCase();
        System.out.println(s);
        System.out.println(s.startsWith("Bom"));
        System.out.println(s.toLowerCase().startsWith("bom"));
        System.out.println(s.toUpperCase().endsWith("DIA"));
        System.out.println(s.length());
        System.out.println(s.toLowerCase().equals("bom dia"));
        System.out.println(s.equalsIgnoreCase("bom dia"));

        s = s + "!!!";
        System.out.println(s);

        String nome = "Lucas";
        String sobrenome = "Silva";
        int idade = 19;
        double renda = 12_345.987;

        String frase = String.format("O senhor %s %s tem %d anos e ganha R$ %.2f.",
                nome, sobrenome, idade, renda);

        System.out.println(frase);

        System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade);
        System.out.println("Primeira letra da frase:" +  frase.charAt(0));
        System.out.println(frase);

        System.out.println("Frase qualquer".contains("qual"));
        System.out.println("Frase qualquer".indexOf("qual"));
        System.out.println("Frase qualquer".substring(6, 10));

    }
}
