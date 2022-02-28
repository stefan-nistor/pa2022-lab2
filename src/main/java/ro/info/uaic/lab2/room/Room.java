package ro.info.uaic.lab2.room;

import java.util.Objects;

public class Room {
    private String name;
    private RoomType type;
    private int capacity;

    public Room(){

    }

    public Room (String name, int capacity, RoomType type){
        this.name = name;
        this.capacity = capacity;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public RoomType getType() {
        return type;
    }

    public void setType(RoomType type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Room{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", capacity=" + capacity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return capacity == room.capacity && Objects.equals(name, room.name) && type == room.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, capacity);
    }
}
