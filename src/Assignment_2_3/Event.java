package Assignment_2_3;

/* implements Comparable<Event>
* Implements = signing a contract, not sure what this means.
* Comparable = can be put in order
* <Event> is justits with other events.*/
public class Event implements Comparable<Event> {

    private EventType type;
    private double time;

    // Constructor:
    public Event(EventType type, double time) {
        this.time = time;
        this.type = type;
    }


    // IntelliJ generated getter and setter:
    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public EventType getType() {
        return type;
    }

    public void setType(EventType type) {
        this.type = type;
    }

    // ^^^^ Keep empty for new setters and getters if needed later ^^^^

    // Override means you Override another method with your own
    @Override
    public int compareTo(Event other) {
        return Double.compare(this.time, other.time);
    }

    // now we can use type instead.
    @Override
    public String toString() {
        return this.type + " at time: " + time;
    }
}