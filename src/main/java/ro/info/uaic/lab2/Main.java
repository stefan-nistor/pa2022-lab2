package ro.info.uaic.lab2;

import ro.info.uaic.lab2.event.Event;
import ro.info.uaic.lab2.room.Room;
import ro.info.uaic.lab2.room.RoomType;

public class Main {
    public static void main(String[] args) {
        Event e1 = new Event();
        Event e2 = new Event("E2", 100, 8, 10);

        Room c112 = new Room();
        Room c2 = new Room("C2", 200, RoomType.LECTURE_HALL);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(c112);
        System.out.println(c2);
    }
}
