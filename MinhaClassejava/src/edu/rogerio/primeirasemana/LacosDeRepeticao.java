package edu.rogerio.primeirasemana;

public class LacosDeRepeticao {

    public static void main(String[] args) {
        for(int carneiro=1; carneiro <= 20; carneiro++){
            System.out.println(carneiro);
        }
    System.out.println("Dormiu");

    /*For em arrays
     * Podemos usar o for para interagir com arrays e collections.
     */

     String alunos []= {"felipe", "lucas", "lorenzo", "Julia", "clara"};

     for(int contador = 0; contador < alunos.length; contador++){
        System.out.println("O aluno no indice x= " + contador + " é " + alunos[contador]);    
        } 
    /*
     * for each -> forma abreviada e fortemente ligadas a arrasy e coleçoes
     */

    for(String capiroto : alunos){
        System.out.println("O nome do capiroto é " + capiroto + ".");
     }

     // break e continue -> interrompe o laço; interrompe a iteração atual e continua o laço de repetição.

    for (int numero =1; numero <= 5; numero++){
        if(numero==3)
        break;
        System.out.println(numero);
    }
    for (int numero =1; numero <= 5; numero++){
        if(numero==3)
        continue;
        System.out.println(numero);
    }
    }   
}
