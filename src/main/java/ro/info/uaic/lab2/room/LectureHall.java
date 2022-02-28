package ro.info.uaic.lab2.room;

public class LectureHall extends Room{

    private boolean isEquippedWithProjector;

    public LectureHall(){

    }

    public LectureHall(String name, int capacity, boolean isEquippedWithProjector) {
        this.name = name;
        this.capacity = capacity;
        this.isEquippedWithProjector = isEquippedWithProjector;
    }

    public void setEquippedWithProjector(boolean equippedWithProjector) {
        isEquippedWithProjector = equippedWithProjector;
    }

    public boolean isEquippedWithProjector(){
        return isEquippedWithProjector;
    }


    @Override
    public String toString(){
        return "LectureHall{" +
                "name=" + name + ", " +
                "capacity=" + capacity + ", " +
                "isEquippedWithProjector= " + isEquippedWithProjector +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
