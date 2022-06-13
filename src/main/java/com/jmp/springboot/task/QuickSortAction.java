package com.jmp.springboot.task;

import java.util.concurrent.RecursiveAction;

public class QuickSortAction extends RecursiveAction {
    int[] ints;

    public QuickSortAction(int[] ints) {
        this.ints = ints;
    }

    @Override
    protected void compute() {
        System.out.println("compute");
        QuickSort.sort(ints, 0, ints.length - 1);
    }
}
