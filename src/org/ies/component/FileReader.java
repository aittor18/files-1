package org.ies.component;

import org.ies.model.File;

import java.util.Scanner;

public class FileReader implements Reader<File> {
    Scanner scanner = new Scanner(System.in);

    @Override
    public File read() {
        System.out.println("Introduce el tamaño del archivo: ");
        int size = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Introduce la ruta donde se encuentra el archivo: ");
        String path = scanner.nextLine();

        return new File(size, path);
    }
}
