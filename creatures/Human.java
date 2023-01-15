package creatures;
import devices.Car;
import devices.Phone;

public class Human extends Animal {
    public String firstName;
    public String lastName;
    public Animal pet;
    public Car car;
    public Phone phone;
    public Double cash;

    public Human(String firstName, Animal pet, Double cash) {
        super("homo sapiens", 50.0);
        this.firstName = firstName;
        this.pet = pet;
        this.cash = cash;
    }
}
