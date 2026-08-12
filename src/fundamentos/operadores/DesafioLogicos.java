package fundamentos.operadores;

public class DesafioLogicos {
    public static void main(String[] args) {
        //Trabalho na terça (V ou F)
        //Trabalho na quinta (V ou F)

        boolean trabalhoTerca = false;
        boolean trabalhoQuinta = false;

        System.out.println("Trabalho na terça? " + trabalhoTerca);
        System.out.println("Trabalho na quinta? " + trabalhoQuinta);

        boolean tv50 = trabalhoTerca && trabalhoQuinta;
        System.out.println("Comprou TV 50\" ? " + tv50);

        boolean tv32 = trabalhoTerca ^ trabalhoQuinta;
        System.out.println("Comprou TV  32\" ? " + tv32);

       boolean shopping = tv32 || tv50;
        System.out.println("Foi ao shopping? " + shopping);

       boolean sorvete = shopping && (tv32 || tv50);
        System.out.println("Comprou sorvete? " + sorvete);

       boolean casa = trabalhoTerca == false && trabalhoQuinta == false;
        System.out.println("Ficou em casa? " + casa);

        boolean fome = casa;
        System.out.println("Está com fome? " + fome);

        boolean saudavel = !sorvete;
        System.out.println("Está saudável? " + saudavel);
    }
}
