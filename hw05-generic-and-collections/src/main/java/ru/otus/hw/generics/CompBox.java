package ru.otus.hw.generics;

public class CompBox implements Comparable<CompBox> {
    private int size;

    @Override
    public int compareTo(CompBox o) {
        return this.size - o.size;
    }
}
