package org.ies.component;

import org.ies.model.File;
import org.ies.model.Text;

import java.util.Scanner;

public class FileReader implements Reader<File> {
    Scanner scanner = new Scanner(System.in);
    TextReader textReader = new TextReader();
    AudioReader audioReader = new AudioReader();
    ImageReader imageReader = new ImageReader();

    @Override
    public File read() {
        int option;
        menu();
        return null;
    }

    private void menu() {
        int option;
        do {
            System.out.println("<<<<Introduce por teclado tu elección>>>>");
            System.out.println("1. Leer archivo de texto");
            System.out.println("2. Leer archivo de audio");
            System.out.println("3. Leer archivo de imágen");
            System.out.println("4. Salir del menú");
            System.out.print("Teclea tu opción: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    textReader.read();
                    break;
                case 2:
                    audioReader.read();
                    break;
                case 3:
                    imageReader.read();
                    break;
                default:
                    System.out.println("Opción inválida");

            }
        } while (option != 4);
    }
}

