package com.fabrizio;

public class ThreadDemo {
    public static void show() {
        System.out.println(Thread.currentThread().getName());
    Thread thread = new Thread(new DownloadFileTAsk());
    thread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    thread.interrupt();
        }}