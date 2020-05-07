package com.fabrizio;

public class ThreadDemo {
    public static void show() {
        System.out.println(Thread.currentThread().getName());
    Thread thread = new Thread(new DownloadFileTAsk());
    thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("file is ready");
}
}
