package org.example.hw3;

import org.example.hw3.model.GeneratorBaseNotebook;
import org.example.hw3.model.Market;
import org.example.hw3.model.Notebook;
import org.example.hw3.model.NotebookComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Notebook n1 = new Notebook("модель1", 1000, 500, "винда", "синий");
        Notebook n2 = new Notebook("модель2", 900, 450, "линукс", "красный");
        n1.getRamSize();
        System.out.println(n1.toString());
        System.out.println(n2.toString());
        System.out.println(n1.equals(n2));
        System.out.println(n1==n2);
        System.out.println(n1.compareTo(n2));

        List<Notebook> db = new ArrayList<>();
        db.add(n1);
        db.add(n2);

        System.out.println(db);
        Collections.sort(db);
        System.out.println(db);

        System.out.println(db);
        db.sort(new NotebookComparator());
        System.out.println(db);
    }
}
