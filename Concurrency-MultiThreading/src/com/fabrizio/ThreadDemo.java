package com.fabrizio;

import java.util.ArrayList;
import java.util.List;

public class ThreadDemo {
    public static void show() {
        var status = new DownloadStatus(status);
        List<Thread> threads = new ArrayList<>;
        for (var i = 0; i < 10; i++) {
            var thread = new Thread(new DownloadFileTAsk(status));
            thread.start();
            threads.add(thread);
        }
        for (var thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(status.getTotalBytes());
    }
}