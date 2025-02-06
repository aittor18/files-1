package org.ies.component;

import org.ies.model.Audio;

import java.util.Scanner;

public class AudioReader implements Reader<Audio> {
    Scanner scanner = new Scanner(System.in);

    @Override
    public Audio read() {
        System.out.print("Introduce el tamaño del archivo: ");
        int size = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Introduce la ruta del archivo: ");
        String path = scanner.nextLine();

        System.out.print("Introduce la duración del audio: ");
        int length = scanner.nextInt();
        scanner.nextLine();

        return new Audio(size, path, length);
    }
}
