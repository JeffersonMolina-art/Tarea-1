package Juego;

public class Duende extends Personaje implements Villano{
    private String duende;

    public static String VillanoDuende(String duende){
        duende = "Duende";
        System.out.println(duende);
        return duende;
    }

    @Override
    public void atacarVillano() {

    }

    @Override
    public void destruir() {

    }
}
