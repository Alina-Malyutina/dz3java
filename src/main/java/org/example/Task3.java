package org.example;

import java.util.ArrayList;

public class Task3 {
        public static void Run(ArrayList<Integer> list) {
            System.out.println("Task 3: ");
            int max = list.get(0);
            for (Integer i : list)
                if (i > max) {
                    max = i;
                }
            System.out.printf("Max is %d\n", max);
        }

}
