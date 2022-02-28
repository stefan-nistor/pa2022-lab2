package ro.info.uaic.lab2.room;

public class ComputerLab extends Room{

    private String operatingSystem;

    public ComputerLab(){

    }

    public ComputerLab(String name, int capacity, String operatingSystem) {
        this.name = name;
        this.capacity = capacity;
        this.operatingSystem = operatingSystem;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    @Override
    public String toString(){
        return "ComputerLab{" +
                "name=" + name + ", " +
                "capacity=" + capacity + ", " +
                "operatingSystem=" + operatingSystem +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
