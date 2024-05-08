package HomeWork8;

public class Main {
    public static void main(String[] args) {
        // Abstract class and methods
        Animal animal1 = new Pike();
        Animal animal2 = new Carp();
        Animal animal3 = new CatFish();
        Animal animal4 = new Eagle();

        animal1.getAnimalLivingPlace();
        Pike pike = new Pike();
        pike.catchPike();
        pike.sayMyName();

        animal2.getAnimalLivingPlace();
        Carp carp = new Carp();
        carp.catchPike();

        animal3.getAnimalLivingPlace();
        CatFish catFish = new CatFish();
        catFish.catchFish();

        // Interfaces

        animal4.getAnimalLivingPlace();
        Eagle eagle = new Eagle();
        eagle.fly();
        eagle.landOn();

        Plain plain = new Plain();
        plain.fly();
        plain.landOn();
        plain.getPlainRoute("Lviv", "Odesa");

    }
}
