package com.company;

public class Main {

    public static void main(String[] args) {

        Libro miLibro1 = new Libro();
        Libro miLibro2 = new Libro("isbn-0123456", "El Quijote", "Miguel de Cervantes", 1424);

        System.out.println("miLibro = " + miLibro2.autor);
        System.out.println("miLibro = " + miLibro1.titulo);

    }
}
