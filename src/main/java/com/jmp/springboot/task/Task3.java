package com.jmp.springboot.task;

import java.io.File;

public class Task3 {
    private static File[] files;

    public static void main(String[] args) {
        String path = "C:\\Users\\Huy_Nguyen1\\Downloads\\";
        File directory = new File(path);
        files = directory.listFiles();

        Thread fileCountThread = new Thread(new FileCountThread());
        fileCountThread.start();

        Thread folderCountThread = new Thread(new FolderCountThread());
        folderCountThread.start();

        Thread totalSizeCountThread = new Thread(new TotalSizeCountThread());
        totalSizeCountThread.start();
    }

    private static class FileCountThread extends Thread {
        public void run() {
            System.out.println("Total files: " + files.length);
        }
    }

    private static class FolderCountThread extends Thread {
        public void run() {
            long sum = 0;
            for (File file : files) {
                if (file.isDirectory()) {
                    sum += 1;
                }
            }
            System.out.println("Total folders: " + sum);
        }
    }

    private static class TotalSizeCountThread extends Thread {
        public void run() {
            ScanAction scanAction = new ScanAction(files);
            Long sum = scanAction.compute();
            System.out.println("Sum of all files size: " + sum);
        }
    }
}
