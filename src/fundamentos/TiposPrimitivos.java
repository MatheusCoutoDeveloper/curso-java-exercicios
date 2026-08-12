package fundamentos;

public class TiposPrimitivos {
    public static void main(String[] args) {

        // Informações do funcionário
        String nome = "André";
        int idade = 30;
        char sexo = 'M';
        boolean ativo = true;

        // Exibindo as informações
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
        System.out.println("Ativo: " + ativo);

        //Tipos numericos inteiros
        byte anosDeEmpresa = 5;
        short numeroDeVoos = 542;
        int id = 3254;
        long pontosAcumulados = 3_134_845_223L;

        //tipos numericos reais
        float salario = 11_445.44F;
        double vendasAcumuladas = 2_991_797_103.01;

        //tipo booleano
        boolean estaDeFerias = false; //true

        //tipo caractere
        char status = 'A';  // Ativo ----   /u0010


        //Dias de empresa desse funcionario
        System.out.println("Dias de empresa: " + anosDeEmpresa * 365);

        // Numero de viagens
        System.out.println("Numero de viagens: " + numeroDeVoos / 2);

        //Pontos por real
        System.out.println("Pontos por real: " + pontosAcumulados / vendasAcumuladas);

        //Salario do id
        System.out.println(id + ": ganha = " + salario);

        System.out.println("Ferias? " + estaDeFerias);
        System.out.println("Status: " + status);
    }
}
