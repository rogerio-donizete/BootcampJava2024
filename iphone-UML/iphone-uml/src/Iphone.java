import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Iphone extends TelefoneMovel implements Reprodutormusical{
    public static void main(String[] args) throws Exception {  
    String opcao ="";  
    int numeroTelefone = 00000000;
    final List<String> listaMusica = new ArrayList<String>();

    Scanner scanner = new Scanner(System.in).useLocale(Locale.US); 
    System.out.println("Digite a opção desejada: \n[T] para usar a função Telefone \n[M] para usar o reprodutor de musica \n[N] para usar o navegador de internet \n[S] para sair.");
    opcao=scanner.next();
    if (opcao.equalsIgnoreCase("t")){
        System.out.println("Digite a opção desejada: \n[L] para fazer uma ligação \n[A] para atender ima ligação \n[v] para iniciar o correio de voz \n[S] para sair.");
        opcao=scanner.next().toUpperCase();
        switch (opcao) {
            case "L":
                fazerLigacao();               
                break;
            case "A":
                receberLigacao();              
                break;
            case "V":
                iniciarCorreioVoz();            
                break;
            case "S":
                encerrarFuncao();               
                break;
            default:
                System.out.println("Opção invalida");
                break;
        }
    }
    else if (opcao.equalsIgnoreCase("m")){
        System.out.println("Digite a opção desejada: \n[R] para reproduzir uma musica \n[P] para pausar uma musica \n[E] para escolhe uma musica \n[S] para sair.");
        opcao=scanner.next().toUpperCase();
        switch (opcao) {
            case "R":
                tocarMusica();               
                break;
            case "P":
                pausarMusica();              
                break;
            case "E":
                selecionarMusica();            
                break;
            case "S":
                encerrarFuncao();               
                break;
            default:
                System.out.println("Opção invalida");
                break;
        }
        scanner.close();
    }
    else if (opcao.equalsIgnoreCase("n")){
        System.out.println("Digite a opção desejada: \n[I] para entra numa pagina da internet \n[AB] para abrir uma nova aba \n[A] atualizar a pagina da internet \n[S] para sair.");
        opcao=scanner.next().toUpperCase();
        switch (opcao) {
            case "I":
                System.out.println("Digite a URL da paginadesejada:");
                String url = scanner.next();
                exibirPagina(url);             
                break;
            case "AB":
                adicionarNovaAba();            
                break;
            case "A":
                atualizarPagina();           
                break;
            case "S":
                encerrarFuncao();               
                break;
            default:
                System.out.println("Opção invalida");
                break;
        }
        scanner.close();
    }
    else if (opcao.equalsIgnoreCase("s")) {
        encerrarFuncao();
    }
    else{
        System.out.println("Opção invalida");
    }
    }
     public static void encerrarFuncao(){
        System.out.println("FUNÇÃO SENDO ENCERRADA");
     }
     
    public static void fazerLigacao(){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o numero de telefone para realizar a ligação");
        int numeroDiscado = scanner.nextInt();
        System.out.println("FAZENDO LIGAGAÇÃO PARA O " + numeroDiscado);
        scanner.close();
    }

    protected static void receberLigacao(){
        System.out.println("ATENDENDO A LIGAÇÃO");
    }

    protected static void iniciarCorreioVoz(){
        System.out.println("INICIANDO O CORREIO DE VOZ");
    }

    protected static void tocarMusica(){
        System.out.println("TOCANDO MUSICA");
    }

    protected static void pausarMusica(){
        System.out.println("MUSICA PAUSADA");
    }

    protected static void selecionarMusica(){
        System.out.println("MOSTRANDO UM LISTA DE MUSICAS");
    }

    protected static void exibirPagina(String url){
        System.out.println("PAGINA " + url + " ACESSADA");
    }

    protected static void adicionarNovaAba(){
        System.out.println("ABERTA NOVA ABA NO NAVEGADOR DE INTERNET");
    }

    protected static void atualizarPagina(){
        System.out.println("PAGINA DA INTERNET ATUALIZADA");
    }


        
}
