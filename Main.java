import creatures.Animal;
import creatures.Human;
import devices.Car;
import devices.Electric;
import devices.LPG;
import devices.Petrol;

public class Main {
    public static void main(String[] args) throws Exception {
        Car Electric = new Electric(1, "VW", "Passat", "Prond", 1.0);
        // Electric.turnOn();
        Car lpg = new LPG(2, "VW", "Passat", "Gaz", 1.0);
        Car petrol = new Petrol(3, "VW", "Passat", "Diesel", 2.0);

        Animal kot = new Animal("kot", 1.0);

        Human janusz = new Human("Janusz", kot, 50.0, 2);
        janusz.setCar(1, lpg);
        Car.salon.setCar(1, petrol);

        //System.out.println(janusz.getCar(1));
        //System.out.println(janusz.getCar(-1));


        //System.out.println(janusz.sumGarageValue());

        Human anrzej = new Human("Anrzej", kot, 100.0, 1);

        System.out.println(petrol.owners);
        System.out.println("Aktualny wlasciciel Petrol: " + petrol.getCurrentOwner().firstName);
        petrol.sell(janusz, Car.salon, 20.0);

        System.out.println("Nowy wlasciciel Petrol: " + petrol.getCurrentOwner().firstName);

        System.out.println("Wlasciciele: ");
        for (int i = 0; i <= petrol.owners.size() - 1; i++) {
            System.out.println(petrol.owners.get(i).firstName);
        }

    }
}