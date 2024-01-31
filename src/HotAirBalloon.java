public class HotAirBalloon extends Vehicle {
    public HotAirBalloon(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("WHOOSH up up and awaaaaaaay!");
    }
}
