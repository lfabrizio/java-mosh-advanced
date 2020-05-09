package com.fabrizio;

public class DownloadFileTAsk  implements Runnable{
    private DownloadStatus status;
    public DownloadFileTAsk(DownloadStatus status) {
        this.status = status;
    }

    @Override
    public void run() {
        System.out.print("download a file" + Thread.currentThread().getId());;

        for (var i = 0; i < 10_000; i++){
            if (Thread.currentThread().isInterrupted()) return;
            status.incrementTotalBytes();
        }

        System.out.println("Download complete" + Thread.currentThread().getId());
    }
}
