package com.fabrizio;

public class DownloadFileTAsk  implements Runnable{
    @Override
    public void run() {
        System.out.print("download a file" + Thread.currentThread().getId());;

        for (var i = 0; i < Integer.MAX_VALUE; i++){
            if (Thread.currentThread().isInterrupted()) return;
            System.out.println("downloading byte" + i);
        }

        System.out.println("Download complete" + Thread.currentThread().getId());
    }
}
