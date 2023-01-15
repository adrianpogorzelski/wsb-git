package devices;

public class LPG extends Car {
    Double maxPressure;

    public LPG (Integer id, String producer, String model, String fuelType, Double maxPressure) {
        super(id, producer, model, fuelType);
        this.maxPressure = maxPressure;
    }

    @Override
    public void refuel() {
        System.out.println("Podłącz... itd.");
    }
    public void turnOn() {
        System.out.println("Gaz czy benzyna?...");
        System.out.println("No to gaz, bo taniej");
        System.out.println("Brrr....");
        System.out.println("Ruszamy");
    }
}
