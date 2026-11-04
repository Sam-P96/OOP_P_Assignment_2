package Assignment_2_3;

import java.util.PriorityQueue;

public class EventList {
    private PriorityQueue<Event> queue = new PriorityQueue<>();

    public void add(Event event) {
        queue.add(event);
    }

    public Event remove() {
        return queue.poll();
    }

    // Looks at the next event, but dont remove it.
    public double getNextEventTime() {
        return queue.peek().getTime();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // Makes a new p-que called copy, with everything from queue
    // while copy is not empty, print the thing returned from .poll()
    public void print() {
        PriorityQueue<Event> copy = new PriorityQueue<>(queue);
        while (!copy.isEmpty()) {
            System.out.println(copy.poll());
        }
    }
}