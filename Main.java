import creatures.Animal;
import creatures.Human;
import devices.*;

public class Main {
    public static void main(String[] args) throws Exception {

        // Zadanie 0
        // https://github.com/adrianpogorzelski/wsb-git/commit/492e866cca14e7fecf14c24fb0567f62ee80cc51

        // Zadanie 1
        Animal kot = new Animal("kot", 1.0);
        kot.feed();
        System.out.println(kot.getWeight());
        kot.takeForAWalk();
        kot.takeForAWalk();
        kot.takeForAWalk();
        kot.takeForAWalk();
        kot.feed();

        // Zadanie 2
        Human janusz = new Human("Janusz", kot, 50.0, 2);
        Car petrol = new Petrol(3, "VW", "Passat", "Diesel", 2.0);

        // Zadanie 3 & 4
        janusz.getSalary();
        janusz.setSalary(-1.05);
        janusz.setSalary(4000.00);
        janusz.getSalary();

        // Zadanie 5
        // brak - Car w Human zastąpione garażem

        // Zadanie 6
        // Paczka devices utworzona

        // Zadanie 7
        Car Electric = new Electric(1, "VW", "Passat", "Prond", 1.0);
        Electric.turnOn();
        Phone ajfon = new Phone(1, "Apfel", "500", 5.0);
        ajfon.turnOn();
        Car lpg = new LPG(2, "VW", "Passat", "Gaz", 1.0);
        lpg.turnOn();

        // Zadanie 8
        Human anrzej = new Human("Anrzej", kot, 100.0, 1);
        anrzej.sell(anrzej, janusz, 10.00);

        Human podejrzanyTyp = new Human("podejrzany typ", janusz, 0.00, 1);
        podejrzanyTyp.sell(podejrzanyTyp, anrzej, 100.00);

        // Zdanie 9
        // interfejsy utworzone
        // https://github.com/adrianpogorzelski/wsb-git/commit/89f931d6bd8804ffc6775591bcfbb86b727cef2f

        // Zadanie 10
        // Klasy dziedziczące - Petrol, LPG, Electric, testowane w zad. 7
        Electric.refuel();
        lpg.refuel();
        petrol.refuel();
        ajfon.installAnApp("Dziwna chińska apka");

        // Zadanie 11
        Car.salon.setCar(1, petrol);

        System.out.println(janusz.getCar(1));
        System.out.println(janusz.getCar(-1));




        System.out.println(janusz.sumGarageValue());


        System.out.println(petrol.owners);
        System.out.println("Aktualny wlasciciel Petrol: " + petrol.getCurrentOwner().firstName);
        petrol.sell(janusz, Car.salon, 20.0);

        System.out.println("Nowy wlasciciel Petrol: " + petrol.getCurrentOwner().firstName);


        // Zadanie 12
        System.out.println("Wlasciciele: ");
        for (int i = 0; i <= petrol.owners.size() - 1; i++) {
            System.out.println(petrol.owners.get(i).firstName);
        }

        // Zadanie 13
    }
}