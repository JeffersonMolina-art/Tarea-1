package Juego;

public class Elfo extends Personaje implements Heroe{
    private String elfo;

    public static String HeroeElfo(String elfo){
        elfo = "Elfo";
        System.out.println(elfo);
        return elfo;
    }
    @Override
    public void atacar() {
        System.out.println("Atacar");
    }

    @Override
    public void defender() {

    }

    @Override
    public void recibirAtaque() {

    }
}
