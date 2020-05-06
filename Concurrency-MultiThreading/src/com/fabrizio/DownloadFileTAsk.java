package com.fabrizio;

public class DownloadFileTAsk  implements Runnable{
    @Override
    public void run() {
        System.out.print("download a file" + Thread.currentThread().getId());
    }
}
