package creatures;

import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {

        System.out.println("Dzień dobry");

        Pet dog = new Pet("dog", 10.05);
        Human Anrzej = new Human("Anrzej", null, 10.0);

        Human Janusz = new Human("Janusz", (Human) Anrzej, 100.0);
        Human Grazyna = new Human("Grazyna", null, 50.0);

        System.out.println(Janusz.pet);
        System.out.println(Janusz.cash);
        System.out.println(Grazyna.pet);
        System.out.println(Grazyna.cash);

        Janusz.sell(Janusz, Grazyna, 40.0);

        System.out.println(Janusz.pet);
        System.out.println(Janusz.cash);
        System.out.println(Grazyna.pet);
        System.out.println(Grazyna.cash);

    }
}