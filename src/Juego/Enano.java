package Juego;

public class Enano extends Personaje implements Heroe{

    private String enano;

    public static String HeroeEnano(String enano){
        enano = "Enano";
        System.out.println(enano);
        return enano;
    }
    @Override
    public void atacar() {

    }

    @Override
    public void defender() {

    }

    @Override
    public void recibirAtaque() {

    }
}
