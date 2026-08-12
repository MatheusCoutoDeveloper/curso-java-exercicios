package fundamentos.operadores;

public class DesafioAritmetico {
     public static void main(String[] args) {
         int a = 3*4-10;
         int b = (int) Math.pow(a,3);
         double c = Math.pow(a,3);

//         System.out.println(b);
//         System.out.println(c);

//Desafio
         int superiorA = 0;
         int superiorB = 0;
         int superior = 0;

         int numA = 6 * (3 + 2);
         numA = (int) Math.pow(numA,2);
         int denA = 3*2;
         superiorA = numA / denA;

         System.out.println("Resultado da primeira operação: " + superiorA);

         int numB = (1 - 5) * (2 - 7);
         int denB = 2;
         int numBdenB = (int) Math.pow(numB/denB,2);
         superiorB = numBdenB;
         System.out.println("Resultado da segunda operação: " + superiorB);

         superior = (int) Math.pow((superiorA - superiorB),3);

         System.out.println("Resultado da terceira operação: " + superior);

         int inferior = (int) Math.pow(10,3);

         int resultado_desafio = superior / inferior;

         System.out.println("Resultado final do desafio: " + resultado_desafio);
     }
}
