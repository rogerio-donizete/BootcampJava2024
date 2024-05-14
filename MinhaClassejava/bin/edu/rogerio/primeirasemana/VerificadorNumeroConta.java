import java.util.Scanner; 

public class VerificadorNumeroConta { 

    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
    try{
        String numeroConta = scanner.next();
        verificarNumeroConta(numeroConta);
        System.out.println("Numero de conta valido.");
    }catch(Exception e){
        System.out.println("Erro: Numero de conta invalido. Digite exatamente 8 digitos."); 
        } finally {
            scanner.close();
        }
    }
    private static void verificarNumeroConta(String numeroConta) {
        if (numeroConta.length() != 8) {
           throw new IllegalArgumentException();
        }
    }
}