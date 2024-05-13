import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        double saldo = 0; 
        boolean condicao = true;
        while (condicao) { 
            int opcao = scanner.nextInt(); 
            switch (opcao){
                case 1:
                    double valorDepositado = scanner.nextDouble();
                    saldo=depositar(valorDepositado,saldo);                
                    break;
                case 2:
                    double saque = scanner.nextDouble(); 
                    saldo = sacar(saque, saldo);
                    break;
                case 3:
                    imprimirSaldo(saldo);                    
                    break; 
                case 0: 
                   condicao=encerrar();
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente."); 
            }
            
        }
    scanner.close();
    
    }

    public static double depositar(Double valorDeposito, Double saldo){ saldo += valorDeposito;
        System.out.println("Saldo atual: " + saldo);
        return saldo;
    }

    public static double sacar(double valorSaque, double saldo){
        if(valorSaque < saldo){
            saldo-=valorSaque;
            System.out.println("Saldo atual: " + saldo);
            return saldo;
        }else{
            System.out.println("Saldo insuficiente.");
            return saldo;
        }
    }

    public static void imprimirSaldo(double saldo){
        System.out.println("Saldo atual: " + saldo);
    }
    public static boolean encerrar(){
        System.out.println("Programa encerrado.");
        return false;
    }
}