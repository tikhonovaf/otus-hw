package ru.otus.task;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//      Пример 1 - reverse
        List<Integer> example = new ArrayList<>();
        int min = 0;
        int max = 100;
        for (int i = min; i < max; i++) {
            example.add(i);
        }
        System.out.println(Lists.reverse(example));

//      Пример 1 - partition
        List<String> names = Lists.newArrayList("John","Jane","Adam","Tom","Viki","Tyler");

        List<List<String>> result = Lists.partition(names, 2);
        System.out.println(result);
    }

}