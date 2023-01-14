package devices;

public class Diesel extends Car {
    Integer volume;

    public Diesel (Integer id, String producer, String model, String fuelType, Integer volume) {
        super(id, producer, model, fuelType);
        this.volume = volume;
    }
}
