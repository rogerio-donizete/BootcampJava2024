package edu.rogerio.primeirasemana;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class WhileDoWhile {
    public static void main(String[] args) {
        //while -> testa a condição antes de executar o bloco
        double mesada = 50.00;

        while (mesada > 2) {
            double valorDoce = valorAleatorio();
            if(valorDoce<mesada)
            mesada = mesada - valorDoce;
        System.out.println("Doce do valor : " + valorDoce + "comprei e a mesada ficou em " + mesada);            
        }
        System.out.println(mesada);

        //Do while testa a condição somente apósa execução do bloco.
        
        System.out.println("-------------------------");
        System.out.println("Discando");
        do{
            System.out.println("telefone tocando");
        }while(tocando());
        System.out.println("Alô!");


        }
        private static double valorAleatorio(){
            return ThreadLocalRandom.current().nextDouble(2, 8);
        }
        private static boolean tocando(){
            boolean atendeu = new Random().nextInt(3)==1;
            System.out.println("Atendeu? " + atendeu);
            return ! atendeu;
        }
    
}
