package org.ies.component;

import org.ies.model.Image;

import java.util.Scanner;

public class ImageReader implements Reader<Image> {
    Scanner scanner = new Scanner(System.in);

    @Override
    public Image read() {
        System.out.print("Introduce el tamaño del archivo: ");
        int size = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Introduce la ruta del archivo: ");
        String path = scanner.nextLine();

        System.out.print("Introduce la altura de la imagen: ");
        int height = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Introduce el ancho de la imágen: ");
        int weight = scanner.nextInt();
        scanner.nextLine();

        return new Image(size, path, height, weight);
    }
}
