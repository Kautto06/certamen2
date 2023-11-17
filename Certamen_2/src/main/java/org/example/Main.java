package org.example;

import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Crear algunos libros
        Libro libro1 = new Libro("Libro1", "Autor1", 25.99,1038);
        TextoAcademico libroAcademico1 = new TextoAcademico("LibroAcademico1", "Autor2", 29.99, 1039,"Matemáticas");
        TextoPucv libroDeTextoPUCV1 = new TextoPucv("LibroDeTextoPUCV1", "Autor3", 19.99, 1040,"Escuela1");

        // Crear una colección de libros
        ArrayList<Libro> libros = new ArrayList<>();
        libros.add(libro1);
        libros.add(libroAcademico1);
        libros.add(libroDeTextoPUCV1);

        // Buscar un libro por código (título)
        int codigoBuscado = 1039;
        Libro libroEncontrado = null;

        Libro.buscarLibro(libros,codigoBuscado);


        if (libroEncontrado != null) {
            System.out.println("Libro encontrado: " + libroEncontrado);
        } else {
            System.out.println("Libro no encontrado.");
        }
    }
}