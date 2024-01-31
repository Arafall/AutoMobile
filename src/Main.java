//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        RocketShip rocketShip = new RocketShip("Apollo");
        HotAirBalloon hotAirBalloon = new HotAirBalloon("Free Bird");
        makeVehiclesMove(rocketShip);
        makeVehiclesMove(hotAirBalloon);
    }

    public static void makeVehiclesMove(Vehicle vehicle) {
        vehicle.move();
    }
}