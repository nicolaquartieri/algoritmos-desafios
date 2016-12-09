package ar.com.algoritmos.consumer_producer;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
    private BlockingQueue<Integer> queue;
    private int item = 0;

    public Producer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        // Produced just a limited amount of products.
        while (true && item <= 50) {
            queue.add(produce());
        }
    }

    private int produce() {
        item = item + 1;
        System.out.println("Produced: " + item);
        return item;
    }
}
