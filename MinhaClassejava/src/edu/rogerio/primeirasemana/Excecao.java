package edu.rogerio.primeirasemana;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Excecao {
    public static void main(String[] args) {
        try{
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite a sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Digite se nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome:");
        String sobrenome = scanner.next();

        System.out.println("Digite a sua idade:");
        int idade = scanner.nextInt();

        //saída para o usuario:

        System.out.println("Olá, me chamo " + nome + " " + sobrenome +".");
        System.out.println("Tenho " + idade + " anos.");
        System.out.println("E minha altura é " + altura + "cm."); 

        scanner.close();
        }catch(InputMismatchException e){
            System.err.println("os campos idade e altura precisam ser numericos");
        }
    }

    /*
     * exceções em java tem varias classe que auxxiliam, são dividia em dois grandes grupos (checked e uncheckd)
     * checked você é obrigado a trata-la euncehcked não, m,as é uma boa pratica trata-la.
     */
}
