package Assignment_2_2;

public class Main {
    public static void main(String[] args) {
        EventList list = new EventList();

        list.add(new Event(12));
        list.add(new Event(2));
        list.add(new Event(523));
        list.add(new Event(23));
        list.add(new Event(71));
        list.add(new Event(3));

        System.out.println("All events: ");
        list.print();

        Event next = list.remove();
        System.out.println("Removed next event: " + next);

        System.out.println("Remaining events: ");
        list.print();
    }


}
