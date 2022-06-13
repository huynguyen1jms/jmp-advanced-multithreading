package com.jmp.springboot.task;

import java.io.File;
import java.util.concurrent.RecursiveTask;

public class ScanAction extends RecursiveTask<Long> {
    File[] files;

    public ScanAction(File[] files) {
        this.files = files;
    }

    @Override
    protected Long compute() {
        System.out.println("Sum of all file size:");
        long sum = 0;
        for (File file : files) {
            System.out.println(file.getName());
            System.out.println(file.getTotalSpace());
            System.out.println(file.isDirectory());
            sum += file.getTotalSpace();
        }
        return sum;
    }
}
