package ro.info.uaic.lab2;

import ro.info.uaic.lab2.event.Event;
import ro.info.uaic.lab2.room.ComputerLab;
import ro.info.uaic.lab2.room.LectureHall;
import ro.info.uaic.lab2.room.Room;

public class Main {
    public static void main(String[] args) {
        Event e1 = new Event();
        Event e2 = new Event("E2", 100, 8, 10);

        ComputerLab c112 = new ComputerLab();
        LectureHall c2 = new LectureHall("C2", 200, true);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(c112);
        System.out.println(c2);
    }
}
