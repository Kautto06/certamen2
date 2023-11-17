package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class TextoAcademico extends Libro {

    private  String tema;
    private ArrayList<TextoAcademico> textosAcad = new ArrayList();

    public TextoAcademico(String titulo, String autor, double precio, int codigo, String tema) {
        super(titulo, autor, precio, codigo);
        this.tema = tema;
    }

    public TextoAcademico(){
        super();
        this.tema=null;
    }

    public void ingresarYAgregarDatosPorTeclado() {
        Scanner scanner = new Scanner(System.in);

        // Ingresar datos comunes desde la clase base
        System.out.print("Ingrese el título del libro académico: ");
        super.setTitulo(scanner.nextLine());

        System.out.print("Ingrese el autor del libro académico: ");
        super.setAutor(scanner.nextLine());

        System.out.print("Ingrese el precio del libro académico: ");
        super.setPrecio(scanner.nextDouble());

        System.out.print("Ingrese el código del libro académico: ");
        super.setCodigo(scanner.nextInt());

        // Consumir el salto de línea después de nextInt()
        scanner.nextLine();

        // Ingresar atributo específico de la clase hija
        System.out.print("Ingrese el tema del libro académico: ");
        this.tema = scanner.nextLine();

        // Agregar el libro académico a la colección
        textosAcad.add(this);
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
    @Override
    public String toString() {
        return "LibroAcademico{" +
                "tema='" + tema + '\'' +
                "} " + super.toString();
    }

}
