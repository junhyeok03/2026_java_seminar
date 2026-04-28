package structure_homework;

import java.util.LinkedList;
import java.util.Queue;

public class PrinterQueue {
    private final Queue<PrintJob> queue = new LinkedList<>();

    public void addJob(PrintJob job) {        // enqueue
        queue.offer(job);
        System.out.println("[접수] " + job);
    }

    public void processJob() {                // dequeue
        if (queue.isEmpty()) {
            System.out.println("[프린터] 대기 작업 없음");
            return;
        }
        PrintJob job = queue.poll();
        System.out.println("[출력] " + job);
    }

    public void processAll() {
        while (!queue.isEmpty()) processJob();
    }
}
