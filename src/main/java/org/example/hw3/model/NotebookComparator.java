package org.example.hw3.model;

import java.util.Comparator;

public class NotebookComparator implements Comparator<Notebook> {
    @Override
    public int compare(Notebook o1, Notebook o2) {
        return Integer.compare(o1.getRamSize(),o2.getRamSize());
    }
}
