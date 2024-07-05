package stackandqueue;

import java.util.*;

public class QueueExample {

    public static void main(String[] args) {

        Queue<String> queue = new ArrayDeque<>();

        queue.offer("Vishnu");
        queue.offer("Rose");
        queue.offer("Abhishek");
        queue.offer("Suhas");



        while (!queue.isEmpty()){
            System.out.println("Processed : "+queue.poll());
        }



    }

}
