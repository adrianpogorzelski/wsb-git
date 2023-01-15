import devices.Car;
import devices.Electric;
import devices.LPG;
import devices.Petrol;

public class Main {
    public static void main(String[] args) {
        Car Electric = new Electric(1, "VW", "Passat", "Diesel", 1.0);
        Electric.turnOn();
        Car lpg = new LPG(1, "VW", "Passat", "Diesel", 1.0);
        lpg.turnOn();
        Car petrol = new Petrol(1, "VW", "Passat", "Diesel", 2.0);
        petrol.turnOn();
    }
}