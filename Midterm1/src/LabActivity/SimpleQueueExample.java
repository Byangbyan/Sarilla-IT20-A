package LabActivity;

import java.util.LinkedList;
import java.util.Queue;

public class SimpleQueueExample {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.add("Idul");
        queue.add("Yepes");
        queue.add("Acma");

        String firstElement = queue.poll();
        String secondElement = queue.poll();

        System.out.println("Remaining elements in the queue: " + queue);

        queue.add("Tulod");
        queue.add("Canete");

        String thirdElement = queue.poll();

        System.out.println("Remaining elements in the queue: " + queue);
    }
}

