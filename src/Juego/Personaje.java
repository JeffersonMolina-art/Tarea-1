package Juego;

public abstract class Personaje {
    private String nombre;
    private String descricion;
    private long tamaño;
    private int poder;
    private int vida;

    private void deplazarse(){
        System.out.println("movimiento");
    }
    private int Mostrar_vida;
    private void mostrarPoder(){
        System.out.println("poder");
    }
}
