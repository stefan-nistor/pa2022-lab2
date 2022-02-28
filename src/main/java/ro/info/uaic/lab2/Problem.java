package ro.info.uaic.lab2;

import ro.info.uaic.lab2.event.Event;
import ro.info.uaic.lab2.room.Room;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem {

    private List<Event> events = new ArrayList<>();
    private List<Room> rooms = new ArrayList<>();

    /**
     * Add a new room to Rooms List
     * @param room requested room to be added
     * @return an instance of the object with the new room added if it does not exist before, without it otherwise
     */
    public Problem addRoom(Room room){
        if(rooms.contains(room))
            return this;
        rooms.add(room);
        return this;
    }

    /**
     * Add a new event to Events List
     * @param event requested event to be added
     * @return an instance of the object with the new event added if it does not exist before, without it otherwise
     */
    public Problem addEvent(Event event){
        if(events.contains(event))
            return this;
        events.add(event);
        return this;
    }



}
