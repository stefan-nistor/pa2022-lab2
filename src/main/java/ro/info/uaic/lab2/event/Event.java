package ro.info.uaic.lab2.event;

import java.util.Objects;

public class Event {
    private String name;
    private EventType type;
    private int size;
    private int start;
    private int end;

    public Event(){

    }

    public Event(String name, int size, int start, int end){
        this.name = name;
        this.size = size;
        this.start = start;
        this.end = end;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public EventType getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public void setType(EventType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Event{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", size=" + size +
                ", start=" + start +
                ", end=" + end +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return size == event.size && start == event.start && end == event.end && Objects.equals(name, event.name) && type == event.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, size, start, end);
    }
}
