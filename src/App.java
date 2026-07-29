public class App {
    public static void main(String[] args) throws Exception {
        //Tipo nome
        //Variaveis De numero Interio
        byte numeroPequeno = 125; // O byte ele vai de -128 a 127
        short numeroShort = 32500;  // Short vai do -32.768 a 32.767
        int numeroInt = 2147483647; // Int vai do -2.147.483.648 a 2.147.483.647
        long numeroEnorme = 9223372036854775807L; // Long vai do -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807

       /*  System.out.println(numeroPequeno);
        System.out.println(numeroShort);
        System.out.println(numeroInt);
        System.out.println(numeroEnorme); */


        //Variaveis de Pontos Flutuantes ou Variaveis Decimais

        float peso = 78.8f; // O float é parecido com o long, temos que colocar o f para avisar que aquela numero e de uma variavel Float
        double pi = 3.1415;

        /* System.out.println(peso);
        System.out.println(pi); */


        // Variaveis de Tipo caracteres


        char letra = 'c'; // O char so aceita um caracter 

        // Variaveis Bollean (true OU false)

        boolean simNao = true;

        System.out.println(simNao);

  } 
}


// Uma curiosidade agente tem que colocar o L no final do Numero se não da erro 