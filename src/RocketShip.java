public class RocketShip extends Vehicle {

    public RocketShip(String vehicle) {
        super(vehicle);

    }
    @Override
    public void move() {
        System.out.println("KABOOM and Blast off!");
    }
}
