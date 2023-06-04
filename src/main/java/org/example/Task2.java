package org.example;

import java.util.ArrayList;

public class Task2 {
    public static void Run(ArrayList<Integer> list) {
        System.out.println("Task 2: ");
        int min = list.get(0);
        for (Integer i : list) {
            if (i < min) {
                min = i;
            }
        }
        System.out.printf("Min is %d\n", min);
    }
}
