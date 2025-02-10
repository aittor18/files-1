package org.ies.component;

import org.ies.model.Text;

import java.util.Scanner;

public class TextReader implements Reader<Text> {
    Scanner scanner = new Scanner(System.in);

    @Override
    public Text read() {
        System.out.print("Introduce el tamaño del archivo: ");
        int size = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Introduce la ruta del archivo: ");
        String path = scanner.nextLine();

        System.out.print("Introduce el contenido del archivo: ");
        String text = scanner.nextLine();

        return new Text(size, path, text);
    }
}
