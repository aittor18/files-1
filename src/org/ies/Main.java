package org.ies;

import org.ies.component.ProgramReader;
import org.ies.component.TextReader;
import org.ies.model.Program;
import org.ies.model.Text;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var textReader = new TextReader();
        var programReader = new ProgramReader(scanner, textReader);

        Program<Text> textProgram = programReader.read();

        System.out.print("Introduce la ruta de salida: ");
        String outputPath = scanner.nextLine();

        textProgram.execute(outputPath);
    }
}
