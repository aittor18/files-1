package org.ies.model;

import java.util.Arrays;
import java.util.Objects;

public class Program<T extends File> {
    private String programName;
    private T[] files;

    public Program(String programName, T[] files) {
        this.programName = programName;
        this.files = files;
    }

    public void execute(String outputPath) {
        // T se puede sustituir por "var"
        System.out.println(programName);
        for (T file : files) {
            file.open();
            file.move(outputPath);
        }
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public T[] getFiles() {
        return files;
    }

    public void setFiles(T[] files) {
        this.files = files;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Program<?> program = (Program<?>) o;
        return Objects.equals(programName, program.programName) && Objects.deepEquals(files, program.files);
    }

    @Override
    public int hashCode() {
        return Objects.hash(programName, Arrays.hashCode(files));
    }

    @Override
    public String toString() {
        return "Program{" +
                "programName='" + programName + '\'' +
                ", files=" + Arrays.toString(files) +
                '}';
    }
}
