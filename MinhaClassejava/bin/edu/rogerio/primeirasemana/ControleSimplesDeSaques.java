import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        double limiteDiario = scanner.nextDouble();

        for (double limite = limiteDiario; limite > 0.0;){
            double saque = scanner.nextDouble();
            if(saque <= limite && saque > 0){
                limite -= saque;
                System.out.println("Saque realizado. Limite restante: " + limite);
            }else if(saque <= 0){
                break;
            }else{
                System.out.print("Limite diario de saque atingido.");  
                break;          
            }
        }
        System.out.println("Transacoes encerradas.");
        scanner.close(); 
    }
}