package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Libro {

    private String Titulo;
    private String Autor;
    private double precio;

    private int codigo;

    private ArrayList<Libro> libros = new ArrayList();

    public Libro(String titulo, String autor, double precio, int codigo) {
        Titulo = titulo;
        Autor = autor;
        this.precio = precio;
        this.codigo = codigo;
    }

    public Libro() {
        Titulo = null;
        Autor = null;
        this.precio = 0.0;
        this.codigo = 0;
    }

    public void ingresarYAgregarDatosPorTeclado() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el título del libro: ");
        this.Titulo = scanner.nextLine();

        System.out.print("Ingrese el autor del libro: ");
        this.Autor = scanner.nextLine();

        System.out.print("Ingrese el precio del libro: ");
        this.precio = scanner.nextDouble();

        System.out.print("Ingrese el código del libro: ");
        this.codigo = scanner.nextInt();

        // Consumir el salto de línea después de nextInt()
        scanner.nextLine();

        // Agregar el libro a la colección
        libros.add(this);
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public static Libro buscarLibro(ArrayList<Libro>libros, int codigo)
    {
        for (Libro libro : libros)
        {
            if(codigo == libro.getCodigo())
            {
                return libro;
            }
        }
        return null;
    }
    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + Titulo + '\'' +
                ", autor='" + Autor + '\'' +
                ", precio=" + precio +
                '}';
    }
}
