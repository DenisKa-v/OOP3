package org.example.hw3.model;

import lombok.Data;

import java.util.Objects;

@Data
public class Notebook implements Comparable<Notebook> {
    private String model;
    private Integer ramSize;
    private Integer diskSize;
    private String osName;
    private String color;

    public Notebook(String model, Integer ramSize, Integer diskSize, String osName, String color) {
        this.model = model;
        this.ramSize = ramSize;
        this.diskSize = diskSize;
        this.osName = osName;
        this.color = color;
    }

    public Notebook() {
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "model='" + model + '\'' +
                ", ramSize=" + ramSize + " GB" +
                ", diskSize=" + diskSize + " GB" +
                ", osName='" + osName + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public int compareTo(Notebook o) {
        return Integer.compare(this.diskSize, o.diskSize);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notebook notebook = (Notebook) o;
        return Objects.equals(model, notebook.model) && Objects.equals(ramSize, notebook.ramSize) &&
                Objects.equals(diskSize, notebook.diskSize) && Objects.equals(osName, notebook.osName) &&
                Objects.equals(color, notebook.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, ramSize, diskSize, osName, color);
    }
}
