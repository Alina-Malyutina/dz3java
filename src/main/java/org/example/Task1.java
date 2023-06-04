package org.example;

import java.util.ArrayList;


public class Task1 {
    public static void Run(ArrayList<Integer> list) {
        System.out.println("Task 1:");
        System.out.println("Original list is:");
        System.out.print(list);
        ArrayList <Integer> evenArray = new ArrayList<>(list);
        for (int i = 0; i < evenArray.size(); i++) {
            if (isEven(evenArray.get(i))) {
                evenArray.remove(i);
                i--; // Чтобы не смещались индексы во время удаления элемента
            }
        }
        System.out.println("\nAfter removing even numbers list looks like this: ");
        System.out.println(evenArray);
    }
    public static boolean isEven (int number) {
        return number % 2 == 0;
    }
}
