public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv ligada? " + smartTv.ligado);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual:" + smartTv.volume);
        smartTv.ligar();
        System.out.println("Tv ligada? " + smartTv.ligado);
        smartTv.desligar();
        System.out.println("Tv ligada? " + smartTv.ligado);
        smartTv.aumentarVolume();
        System.out.println("Volume atual:" + smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println("Volume atual:" + smartTv.volume);
        smartTv.trocarCanal(539);
        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.aumentarCanal();
        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.diminuirCanal();
        System.out.println("Canal atual: " + smartTv.canal);
    }
}
