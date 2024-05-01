package edu.rogerio.primeirasemana;

public class ControleDeFluxo {

    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 17;

        if( valorSolicitado < saldo){
            saldo -= valorSolicitado;
        System.out.println(saldo);
        }

        int nota=8;
        if(nota>=7){
            System.out.println("Aprovado");
        }else if(nota >=5 && nota < 7){ 
            System.out.println("Em recuperação");
        }else{
            System.out.println("Reprovado");
        }

        //condiçaõ ternario
        String resultado = nota >= 7 ? "Aprovado" : "Reporvado";
        System.out.println(resultado);

                

    }

}
