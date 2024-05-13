import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Candidatura {
    public static void main(String[] args) {
        String[] candidatos = {"FELIPE","MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        selecaoCandidato();
        imprimirCandidatosSelecionados();
        for(String canditado: candidatos){
            entrandoEmContato(canditado);};
    }

    static void imprimirCandidatosSelecionados(){
        String[] candidatos = {"FELIPE","MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        System.out.println("IMPRIMINDO A LISTA DE CANDIODATOS INFORMANDO E  INDICE DO ELEMENTO");
        for(int indice=0; indice < candidatos.length; indice++){

            System.out.println("O candidato de numero "+ (indice + 1)+ " é o coandidato " + candidatos[indice]);
            }
        System.out.println("IMPRIMINDO A LISTA DE CANDIODATOS DE FORMA ABREVIADA");

        for (String candidato : candidatos) {
            System.out.println("O candidato selecionado foi " + candidato + ".");
            
        }

    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu= false;
            do{
                atendeu=atender();
                continuarTentando = !atendeu;
                if(continuarTentando){
                    tentativasRealizadas++;
                }
            }while(continuarTentando && tentativasRealizadas<3);
            
            if(atendeu){
                System.out.println("Conseguimos Contato com " + candidato + " na tentativa numero " + tentativasRealizadas) ;
            }else{
                System.out.println("NÃO CONSEGUIMOSCONTATO COM O CANDIDATO " + candidato);
            }
    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }
       
    static void selecaoCandidato(){
        String[] candidatos = {"FELIPE","MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANILELA", "JORGE"};
        int candidatosSelecionados=0;
        int candidatoAtual=0;
        double salarioBase=2000.0;
        while (candidatosSelecionados <5 && candidatoAtual <candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPreterido = salarioPreterido();
            System.out.println("O candidato " + candidato + " solicitou o salario de " + salarioPreterido );
            if( salarioBase >= salarioPreterido){
                System.out.println("/ocandidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
             
        }
       }
    static double salarioPreterido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2000);
    }
    static void analisarCandidato(double salarioPreterido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPreterido){
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if (salarioBase==salarioPreterido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRAPROPOSTA");    
        }else{
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
