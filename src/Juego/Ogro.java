package Juego;

public class Ogro extends Personaje implements Villano{

    private String ogro;

    public static String VillanoOgro(String ogro){
        ogro = "Ogro";
        System.out.println(ogro);
        return ogro;
    }

    @Override
    public void atacarVillano() {

    }

    @Override
    public void destruir() {

    }
}
