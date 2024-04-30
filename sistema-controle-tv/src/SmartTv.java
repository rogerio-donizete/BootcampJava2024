public class SmartTv {

    boolean ligado=false;
    int canal=1;
    int volume=25;
    
    public void ligar(){
        ligado=true;
    }
    public void desligar(){
        ligado=false;
    }
    public void aumentarVolume(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }
    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }
    public int trocarCanal(int numero){
        canal=numero;
        return canal;
    }

}
