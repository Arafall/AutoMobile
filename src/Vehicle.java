public abstract class Vehicle {
    private String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public abstract void move();

    public void display() {
        System.out.println(name + " is moving");
    }
}
