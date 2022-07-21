package Juego;

public class Humano extends Personaje implements Heroe{
    private String humano;

    public static String HeroeHumano(String humano){
        humano = "Humano";
        System.out.println(humano);
        return humano;
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
