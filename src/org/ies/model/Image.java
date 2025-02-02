package org.ies.model;

import java.util.Objects;

public class Image extends File {
    private int height;
    private int weight;

    public Image(int size, String path, int height, int weight) {
        super(size, path);
        this.height = height;
        this.weight = weight;
    }

    @Override
    public void open() {
        System.out.println("Tamaño = " + size);
        System.out.println("Ruta: " + path);
        System.out.println("Altura: " + height);
        System.out.println("Anchura: " + weight);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Image image = (Image) o;
        return height == image.height && weight == image.weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), height, weight);
    }

    @Override
    public String toString() {
        return "Image{" +
                "height=" + height +
                ", weight=" + weight +
                ", size=" + size +
                ", path='" + path + '\'' +
                '}';
    }
}
