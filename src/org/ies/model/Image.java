package org.ies.model;

import java.util.Objects;

public class Image extends File {
    private int height;
    private int width;

    public Image(int size, String path, int height, int width) {
        super(size, path);
        this.height = height;
        this.width = width;
    }

    @Override
    public void open() {
        System.out.println("Tamaño = " + size + "MB");
        System.out.println("Ruta: " + path);
        System.out.println("Altura: " + height);
        System.out.println("Anchura: " + width);
    }

    public void move(String newPath) {
        if (newPath.equals(path)) {
            System.out.println("No hay cambios");
        } else {
            path = newPath;
            System.out.println("Se ha movido el fichero a " + newPath);
        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Image image = (Image) o;
        return height == image.height && width == image.width;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), height, width);
    }

    @Override
    public String toString() {
        return "Image{" +
                "height=" + height +
                ", weight=" + width +
                ", size=" + size +
                ", path='" + path + '\'' +
                '}';
    }
}
