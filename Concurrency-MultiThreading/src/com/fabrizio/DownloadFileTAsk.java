package com.fabrizio;

public class DownloadFileTAsk  implements Runnable{
    @Override
    public void run() {
        System.out.print("download a file" + Thread.currentThread().getId());

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Download complete" + Thread.currentThread().getName());
    }
}
