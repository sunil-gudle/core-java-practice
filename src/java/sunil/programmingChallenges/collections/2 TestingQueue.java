package src.java.sunil.programmingChallenges.collections;

import java.util.LinkedList;
import java.util.Queue;

class TestingQueue {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        queue.offer(2);

        CollectionUtility.print(queue);

        System.out.println(queue.peek());
        System.out.println(queue.element());

        System.out.println(queue.remove());
        CollectionUtility.print(queue);
    }
}
