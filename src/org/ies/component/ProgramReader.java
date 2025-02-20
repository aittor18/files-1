package org.ies.component;

import org.ies.model.Program;
import org.ies.model.Text;

import java.util.Scanner;

// Debe tener genéricos
public class ProgramReader implements Reader<Program<Text>> {
    private final Scanner scanner;
    private final TextReader textReader;

    public ProgramReader(Scanner scanner, TextReader textReader) {
        this.scanner = scanner;
        this.textReader = textReader;
    }

    @Override
    public Program<Text> read() {
        System.out.print("Cuántos archivos deseas alojar en el programa?: ");
        int programSize = scanner.nextInt();
        scanner.nextLine();

        Text[] texts = new Text[programSize];

        for (int i = 0; i < texts.length; i++) {
            texts[i] = textReader.read();
        }

        System.out.print("Introduce el nombre del programa: ");
        String programName = scanner.nextLine();

        return new Program<>(programName, texts);
    }
}
