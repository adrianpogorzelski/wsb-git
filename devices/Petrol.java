package devices;

public class Petrol extends Car {
    Double volume;

    public Petrol(Integer id, String producer, String model, String fuelType, Double volume) {
        super(id, producer, model, fuelType);
        this.volume = volume;
    }
    @Override
    public void refuel() {
        System.out.println("Otwórz bak");
        System.out.println("Włóż wąż");
        System.out.println("Tankuj");
        System.out.println("Odłóż wąż");
        System.out.println("Zamknij bak");
        System.out.println("Zapłać");
    }

}
