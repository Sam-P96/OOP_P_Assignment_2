package Assignment_2_2;

/* implements Comparable<Event>
* Implements = signing a contract, not sure what this means.
* Comparable = can be put in order
* <Event> is justits with other events.*/
public class Event implements Comparable<Event> {
    private double time;

    // Constructor:
    public Event(double time) {
        this.time = time;
    }


    // IntelliJ generated getter and setter:
    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    // ^^^^ Keep empty for new setters and getters if needed later ^^^^

    // Override means you Override another method with your own
    @Override
    public int compareTo(Event other) {
        return Double.compare(this.time, other.time);
    }

    @Override
    public String toString() {
        return "Event at time " + time;
    }
}