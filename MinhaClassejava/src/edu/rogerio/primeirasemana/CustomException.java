package edu.rogerio.primeirasemana;

public class CustomException {
    public static void main(String[] args) {

        try {
            String cepFormatado = formatarCep("12345678");
            System.out.println(cepFormatado);
        } catch (CepInvalidException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println();
        
    }
    static String formatarCep(String cep) throws CepInvalidException{
        if(cep.length() != 8)
        throw new CepInvalidException();
        return "23.465-064";
    }


}
