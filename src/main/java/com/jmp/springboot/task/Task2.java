package com.jmp.springboot.task;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int arrSize = 100000;

        int[] ints = new int[arrSize];

        int min = 1;
        int max = arrSize * 2;

        Random random = new Random();

        for (int i = 0; i < arrSize; i++) {
            ints[i] = random.nextInt((max - min) + 1) + min;
        }

        System.out.println("Values before sorted:");
        System.out.println(Arrays.toString(ints));

        QuickSortAction quickSortAction = new QuickSortAction(ints);
        quickSortAction.compute();

        MergeSortAction mergeSortAction = new MergeSortAction(ints);
        mergeSortAction.compute();

        System.out.println("Values after sorted:");
        System.out.println(Arrays.toString(ints));
    }
}
