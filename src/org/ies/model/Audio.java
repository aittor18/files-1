package org.ies.model;

import java.util.Objects;

public class Audio extends File {
    private int length;

    public Audio(int size, String path, int length) {
        super(size, path);
        this.length = length;
    }

    @Override
    public void open() {
        System.out.println("Tamaño = " + size);
        System.out.println("Ruta: " + path);
        System.out.println("Duración: " + length);
    }

    public void move(String newPath) {
        if (newPath.equals(path)) {
            System.out.println("No hay cambios");
        } else {
            path = newPath;
            System.out.println("Se ha movido el fichero a " + newPath);
        }
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Audio audio = (Audio) o;
        return length == audio.length;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), length);
    }

    @Override
    public String toString() {
        return "Audio{" +
                "length=" + length +
                ", size=" + size +
                ", path='" + path + '\'' +
                '}';
    }
}
