package com.company;

public class Libro {

    //atributos
    String isbn, titulo, autor;
    int numeroPaginas;

    //Constructor de la clase Libros con parametros
    public Libro(String isbn, String titulo, String autor, int numeroPaginas){
        this.isbn=isbn;
        this.titulo=titulo;
        this.autor=autor;
        this.numeroPaginas=numeroPaginas;
    }

    //Constructor de la clase Libro sin parametros
    public Libro() {
        this.isbn="";
        this.titulo="no tiene titulo";
        this.autor="anonimo";
        this.numeroPaginas=0;
    }
}
