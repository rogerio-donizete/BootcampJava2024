package edu.rogerio.primeirasemana;

public class OperadoresLogico {
    public static void main(String[] args) {
        boolean condicaoUm = true;
        boolean condicaoDois = false;

        if(condicaoUm && condicaoDois){
            System.out.println("As duas condições são verdadeiras.");
        }
        else if(condicaoUm || condicaoDois){
            System.out.println("Pelo menos uma das duas condições é verdadeira.");
        }

    }
    
}
