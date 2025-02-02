package org.ies.model;

import java.util.Objects;

public abstract class File {
    protected int size;
    protected String path;

    public File(int size, String path) {
        this.size = size;
        this.path = path;
    }

    public abstract void open();

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        File file = (File) o;
        return size == file.size && Objects.equals(path, file.path);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, path);
    }

    @Override
    public String toString() {
        return "File{" +
                "size=" + size +
                ", path='" + path + '\'' +
                '}';
    }
}
