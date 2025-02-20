package org.ies.component;

import org.ies.model.File;

import java.util.Scanner;

public class FileReader implements Reader<File> {

    // Lo mismo de antes, mejor con "private final ..."
    Scanner scanner = new Scanner(System.in);
    // Aquí mejor invocar a los Reader<Audio, Text...>
    TextReader textReader = new TextReader();
    AudioReader audioReader = new AudioReader();
    ImageReader imageReader = new ImageReader();

    @Override
    public File read() {
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
                    return textReader.read();

                case 2:
                    return audioReader.read();

                case 3:
                    return imageReader.read();

                default:
                    System.out.println("Opción inválida");

            }
        } while (option != 4);
        return null;
    }
}

