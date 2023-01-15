package devices;

public class Electric extends Car {
    Double voltage;

    public Electric (Integer id, String producer, String model, String fuelType, Double voltage) {
        super(id, producer, model, fuelType);
        this.voltage = voltage;
    }

    @Override
    public void refuel() {
        System.out.println("Podłącz do gniazdka");
        System.out.println("Czekaj");
    }

    public void turnOn() {
        System.out.println("...");
        System.out.println("Ruszamy :)");
    }
}
