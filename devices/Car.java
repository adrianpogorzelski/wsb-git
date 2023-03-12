package devices;

import creatures.Human;

public abstract class Car extends Device {
    public Double millage;
    public Double engineVolume;
    public String fuelType;

    public Car(Integer id, String producer, String model, String fuelType) {
        super(id, producer, model);
        this.fuelType = fuelType;
    }
    public abstract void refuel();

    public void turnOn() {
        System.out.println("brrr...");
        System.out.println("brrr...");
        System.out.println("brrr!");
        System.out.println("JeDzZIEmNY!!!");
    }

    public void sell(Human buyer, Human seller, Double price) throws Exception {
        if(!seller.hasCar(this))
            throw new Exception("Sprzedajacy nie ma samochodu");

        if (!buyer.hasParkingSpace())
            throw new Exception("Brak miejsca parkingowego");

        if (buyer.cash < price)
            throw new Exception("nie ma piniendzy");

        seller.removeCar(this);
        buyer.addCar(this);
        seller.cash += price;
        buyer.cash -= price;
        System.out.println("Sprzedano");
    }
}
