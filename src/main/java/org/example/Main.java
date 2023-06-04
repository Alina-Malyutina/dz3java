package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(randomList(0, 15, 10));
        Task1.Run(list);
        Task2.Run(list);
        Task3.Run(list);
        Task4.Run(list);
    }
    public static List<Integer> randomList(int min, int max, int size) { //Рандомно выберет size чисел в диапазоне от min до max
        return new Random()
                .ints(min, max + 1)
                .distinct()
                .limit(size)
                .boxed()
                .collect(Collectors.toList());
    }
}