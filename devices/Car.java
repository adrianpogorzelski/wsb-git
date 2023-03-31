package devices;

import creatures.Human;

import java.util.LinkedList;
import java.util.List;

public abstract class Car extends Device {
    public static final Human salon = new Human("Salon", null, 0.0, 10);
    public Double millage;
    public Double engineVolume;
    public String fuelType;
    public LinkedList<Human> owners;
    public Human currentOwner;

    public Car(Integer id, String producer, String model, String fuelType) {
        super(id, producer, model);
        this.fuelType = fuelType;
        this.owners = new LinkedList<>();
        this.owners.add(salon);
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

        if (this.getCurrentOwner() != seller)
            throw new Exception("TO nie jest wlasciciel!!111");

        seller.removeCar(this);
        buyer.addCar(this);
        seller.cash += price;
        buyer.cash -= price;
        this.owners.add(buyer);
        System.out.println("Sprzedano");
    }

    public Human getCurrentOwner() {
        return this.owners.get(owners.size() - 1);
    }

    public boolean ownedThisCar(Human human) {
        return this.owners.contains(human);
    }

    public boolean didASellToB(Human seller, Human buyer) {
        Integer indexSeller = this.owners.indexOf(seller);
        Integer indexBuyer = this.owners.indexOf(buyer);

        if (indexSeller == -1 || indexBuyer == -1)
            return false;

        return indexBuyer == indexSeller + 1;
    }


}
