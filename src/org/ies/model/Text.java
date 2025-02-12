package org.ies.model;

import java.util.Objects;

public class Text extends File {
    private String text;

    public Text(int size, String path, String text) {
        super(size, path);
        this.text = text;
    }

    @Override
    public void open() {
        System.out.println("Tamaño = " + size + "MB");
        System.out.println("Ruta: " + path);
        System.out.println("Contenido: " + text);
    }

    public void move(String newPath) {
        if (newPath.equals(path)) {
            System.out.println("No hay cambios");
        } else {
            path = newPath;
            System.out.println("Se ha movido el fichero a " + newPath);
        }
    }


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Text text1 = (Text) o;
        return Objects.equals(text, text1.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), text);
    }

    @Override
    public String toString() {
        return "Text{" +
                "text='" + text + '\'' +
                ", size=" + size +
                ", path='" + path + '\'' +
                '}';
    }
}
