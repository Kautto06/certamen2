package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class TextoPucv extends Libro{

    private String escuela;
    private ArrayList<TextoPucv> textosPucv= new ArrayList();

    public TextoPucv(String titulo, String autor, double precio, int codigo, String escuela) {
        super(titulo, autor, precio, codigo);
        this.escuela = escuela;

    }

    public TextoPucv(){
        super();
        this.escuela=null;
    }

    public void ingresarYAgregarDatosPorTeclado() {
        Scanner scanner = new Scanner(System.in);

        // Ingresar datos comunes desde la clase base
        System.out.print("Ingrese el título del libro de la PUCV: ");
        super.setTitulo(scanner.nextLine());

        System.out.print("Ingrese el autor del libro de la PUCV: ");
        super.setAutor(scanner.nextLine());

        System.out.print("Ingrese el precio del libro de la PUCV: ");
        super.setPrecio(scanner.nextDouble());

        System.out.print("Ingrese el código del libro de la PUCV: ");
        super.setCodigo(scanner.nextInt());

        // Consumir el salto de línea después de nextInt()
        scanner.nextLine();

        // Ingresar atributo específico de la clase hija
        System.out.print("Ingrese la escuela que publicó el libro de la PUCV: ");
        this.escuela = scanner.nextLine();

        // Agregar el libro de la PUCV a la colección
        textosPucv.add(this);
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    @Override
    public String toString() {
        return "LibroDeTextoPUCV{" +
                "escuela='" + escuela + '\'' +
                "} " + super.toString();
    }
}
