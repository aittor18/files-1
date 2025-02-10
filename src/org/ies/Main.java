package org.ies;

import org.ies.component.ProgramReader;
import org.ies.component.TextReader;
import org.ies.model.Program;
import org.ies.model.Text;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Añadimos todas las dependencias necesarias para leer Program<TextFile>
        Scanner scanner = new Scanner(System.in);
        var textReader = new TextReader();
        var programReader = new ProgramReader(scanner, textReader);

        // Invocamos a program indicando que el genérico es Text para que almacene los datos de ProgramReader
        Program<Text> textProgram = programReader.read();

        // Pedimos un String que nos servirá para el metodo execute de Program
        System.out.print("Introduce la ruta de salida: ");
        String outputPath = scanner.nextLine();

        textProgram.execute(outputPath);
    }
}
