package devices;

public abstract class Car extends Device {
    public Double millage;
    public Double engineVolume;
    public String fuelType;

    public Car(Integer id, String producer, String model, String fuelType) {
        super(id, producer, model);
        this.fuelType = fuelType;
    }
    public abstract void refuel();
}
