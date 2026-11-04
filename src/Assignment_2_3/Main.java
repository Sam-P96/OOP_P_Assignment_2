package Assignment_2_3;

public class Main {
    public static void main(String[] args) {
        EventList list = new EventList();

        list.add(new Event(EventType.ARRIVAL, 132));
        list.add(new Event(EventType.ARRIVAL, 2));
        list.add(new Event(EventType.ARRIVAL, 211111));
        list.add(new Event(EventType.EXIT, 1212));
        list.add(new Event(EventType.EXIT, 1323));
        list.add(new Event(EventType.EXIT, 132));

        System.out.println("All events: ");
        list.print();

        Event next = list.remove();
        System.out.println("Removed next event: " + next);

        System.out.println("Remaining events: ");
        list.print();
    }


}
