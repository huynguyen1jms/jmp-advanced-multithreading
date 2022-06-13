package com.jmp.springboot.task;

import java.util.concurrent.RecursiveAction;

public class MergeSortAction extends RecursiveAction {
    int[] ints;

    public MergeSortAction(int[] ints) {
        this.ints = ints;
    }

    @Override
    protected void compute() {
        System.out.println("compute");
        MergeSort.sort(ints, ints.length);
    }
}
