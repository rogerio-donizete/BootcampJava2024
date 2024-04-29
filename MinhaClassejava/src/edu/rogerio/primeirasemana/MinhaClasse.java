package edu.rogerio.primeirasemana;
public class MinhaClasse{
    public static void main(String[] args) {
        String primeiroNome = "Rogerio";
        String segundoNome = "Donizete da Silva";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);    
        
        /* estrutura do operador tenario:
         * <expressão condicional> ? <condição se verdadeiro> : <condição se falso>
         * expressão booleano;
        */

       int a = 5;
       int b = 6;
       String resultado ="";

       resultado = a==b ? "verdadeiro" : "falso";
       System.out.println(resultado);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);        
    }
}