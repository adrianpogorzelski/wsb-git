package creatures;

public class Animal implements Feedable, Sellable {
    public static final Double DEFAULT_ANIMAL_WEIGHT = 1.0;
    public static final Double DEFAULT_DOG_WEIGHT = 6.0;
    public static final Double DEFAULT_CAT_WEIGHT = 2.0;
    public static final Double DEFAULT_HORSE_WEIGHT = 800.0;
    private static final Double DEFAULT_FOOD_WEIGHT = 1.0;
    private static final Double DEFAULT_WALK_DISTANCE = 5.0;

    public final String species;
    public String name;
    protected Double weight;
    protected Boolean isAlive;


    public Animal(String species) {
        this.isAlive = true;
        this.species = species;
        switch (species) {
            case "canis" -> this.weight = DEFAULT_DOG_WEIGHT;
            case "felis" -> this.weight = DEFAULT_CAT_WEIGHT;
            case "equus" -> this.weight = DEFAULT_HORSE_WEIGHT;
            default -> this.weight = DEFAULT_ANIMAL_WEIGHT;
        }
    }

    public Animal(String species, Double weight) {
        this.isAlive = true;
        this.species = species;
        if (weight <= 0) {
            System.out.println("Sorry, błędna waga, przypisano wagę domyślną");
            this.weight = DEFAULT_ANIMAL_WEIGHT;
        } else {
            this.weight = weight;
        }
    }

    public Double getWeight() {
        return this.weight;
    }

    public void checkIfItIsAlive() {
        if (isAlive) {
            System.out.println("Jasne że żyję!");
        } else {
            System.out.println("no niestety, trochę za późno");
        }
    }

    public void feed(Double foodWeight) {
        this.feed(foodWeight, FoodType.MIXED);
    }

    public void feed(Double foodWeight, FoodType foodType) {
        if (isAlive) {
            weight += foodWeight * foodType.nutritionRatio;
            System.out.println("dzięki za żarcie :) ");
        } else {
            System.out.println("trochę za późno :|");
        }
    }

    public void feed() {
        this.feed(DEFAULT_FOOD_WEIGHT);
    }

    public void takeForAWalk(Double distance) {
        if (!isAlive) {
            System.out.println("HALO POLICJA!");
        } else {
            weight -= (distance * 0.1);
            if (weight <= 0.0) {
                isAlive = false;
            } else {
                System.out.println("dzięki za spacer");
            }
        }
    }

    public void takeForAWalk() {
        this.takeForAWalk(DEFAULT_WALK_DISTANCE);
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.pet instanceof Human) {
            System.out.println("Zgłaszam do prokuratury");
        } else if (seller.pet != null && buyer.cash >= price) {
            buyer.cash -= price;
            seller.cash += price;
            buyer.pet = seller.pet;
            buyer.pet = null;
            System.out.println(buyer.firstName + " kupuje " + seller.pet.species + " od " + seller.firstName + " za " + price + " zł.");
        } else {
            System.out.println("Transakcja niemożliwa");
        }
    }
}