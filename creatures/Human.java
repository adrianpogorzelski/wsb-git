package creatures;
import devices.Car;
import devices.Phone;

public class Human extends Animal {
    public static final Integer DEFAULT_GARAGE_SIZE = 2;
    public String firstName;
    public String lastName;
    public Animal pet;
    public Car[] garage;
    public Phone phone;
    public Double cash;

    public Human(String firstName, Animal pet, Double cash) {
        super("homo sapiens", 50.0);
        this.firstName = firstName;
        this.pet = pet;
        this.cash = cash;
        this.garage = new Car[DEFAULT_GARAGE_SIZE];
    }

    public Human(String firstName, Animal pet, Double cash, Integer numberOfCars) {
        super("homo sapiens", 50.0);
        this.firstName = firstName;
        this.pet = pet;
        this.cash = cash;
        this.garage = new Car[numberOfCars];
    }

    public Car getCar(Integer parkingNumber) {
        if (parkingNumber < 0 || parkingNumber >= this.garage.length) {
            System.out.println("Nie ma takiego miejsca");
            return null;
        } else {
            return this.garage[parkingNumber];
        }
    }

    public void setCar(Integer parkingNumber, Car car) {
        this.garage[parkingNumber] = car;
    }

    public Integer sumGarageValue() {
        Integer sum = 0;
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] != null) {
                sum++;
            }
        }
        return sum;
    }

    public boolean hasCar(Car carToSell) {
        boolean humanHasCar = false;
        for (Car car : this.garage) {
            if (car == carToSell) {
                humanHasCar = true;
                break;
            }
        }
        return humanHasCar;
    }

    public boolean hasParkingSpace() {
        boolean hasFreeParkingSpot = false;
        for (Car car : this.garage) {
            if (car == null) {
                hasFreeParkingSpot = true;
                break;
            }
        }
        return hasFreeParkingSpot;
    }

    public void removeCar(Car car) {
        for (int i = 0; i <= this.garage.length; i++) {
            if (this.garage[i] == car) {
                this.garage[i] = null;
                break;
            }
        }
    }

    public void addCar(Car car) {
        for (int i = 0; i <= this.garage.length; i++) {
            if (this.garage[i] == null) {
                this.garage[i] = car;
                break;
            }
        }
    }
}
