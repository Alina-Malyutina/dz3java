package org.example;

import java.util.ArrayList;

public class Task4 {
    public static void Run(ArrayList<Integer> list) {
        System.out.println("Task 4: ");
        int sum = 0;
        for (Integer i : list)
            sum += i;
        int avg = sum/list.size();
        System.out.printf("Average is %d\n", avg);
    }
}
