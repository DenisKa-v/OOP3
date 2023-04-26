package org.example.hw3.model;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public class GeneratorBaseNotebook extends Notebook {
    private Integer number;
    private HashMap<Integer, Notebook> baseNotebook;

    public GeneratorBaseNotebook(Integer number) {
        this.number = number;
        this.baseNotebook = generateBaseNotebook(this.number);
    }

    public static HashMap<Integer, Notebook> generateBaseNotebook(Integer number) {
        HashMap<Integer, Notebook> result = new HashMap<>();
        Random rand = new Random();
        for (int i = 0; i < number; i++) {
            int ramSize = (int) Math.pow(2, (1 + rand.nextInt(6)));
            int diskSize = 1 + rand.nextInt(4);
            String os = (rand.nextInt(2) == 0 ? "windows" : "linux");
            String color = getRandomColor();
            Notebook note = new Notebook("model_" + i, ramSize, diskSize, os, color);
            result.put(i, note);
        }
        return result;
    }

    private static String getRandomColor() {
        int i = new Random().nextInt(6);
        switch (i) {
            case 1 -> {
                return "red";
            }
            case 2 -> {
                return "blue";
            }
            case 3 -> {
                return "yellow";
            }
            case 4 -> {
                return "gold";
            }
            case 5 -> {
                return "purple";
            }
            default -> {
                return "black";
            }
        }
    }


    @Override
    public String toString() {
        return "GeneratorBaseNotebook{" +
                "baseNotebook=" + baseNotebook +
                '}';
    }

    public void put(Integer index, Notebook notebook) {
        if (baseNotebook.containsKey(index)) {
            System.out.println("Ключ занят!");;
        }
        else {
            baseNotebook.put(index, notebook);
        }
    }

    public void remove(Integer index) {
        if (baseNotebook.containsKey(index)) {
            baseNotebook.remove(index);
        }
        else {
            System.out.println("Нет такого ключа!");
        }
    }

    public HashMap<Integer, Notebook> getBaseNotebook() {
        return baseNotebook;
    }

    public void setBaseNotebook(HashMap<Integer, Notebook> baseNotebook) {
        this.baseNotebook = baseNotebook;
    }

}
