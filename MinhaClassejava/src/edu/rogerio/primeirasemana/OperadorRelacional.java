package edu.rogerio.primeirasemana;

public class OperadorRelacional {
    public static void main(String[] args) {
        int numeroA = 1;
        int numeroB = 2;
        String condicao;
        System.out.println(numeroA == numeroB);
        System.out.println(numeroA != numeroB);
        condicao = numeroA != numeroB ? "Essa expressão é verdadeira" : "Essa expressão é falsa";
        System.out.println(condicao);

        String nome = "Rogério";
        String nome2 = new String("Rogério");

        System.out.println(nome == nome2);
        System.out.println(nome.equals(nome2));
    }
    /*
     * == igualdade
     * != diferença
     * 
     */
;    
}