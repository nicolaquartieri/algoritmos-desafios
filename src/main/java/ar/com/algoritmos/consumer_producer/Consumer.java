package ar.com.algoritmos.consumer_producer;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
    private final String name;
    private BlockingQueue<Integer> queue;

    public Consumer(String name, BlockingQueue<Integer> queue) {
        this.name = name;
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                consume(queue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void consume(int item) {
        System.out.println("Consumed :" + name + " -> " + item);
    }
}
