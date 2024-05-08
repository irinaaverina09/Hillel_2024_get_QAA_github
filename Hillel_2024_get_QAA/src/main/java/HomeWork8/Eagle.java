package HomeWork8;

public class Eagle extends Animal implements Flyable {
    @Override
    public void getAnimalLivingPlace() {
        System.out.println("I am an Eagle and I live in a wood");
    }

    @Override
    public void fly() {
        System.out.println("I believe I can fly");

    }

    @Override
    public void landOn() {
        System.out.println("I am afraid of plains and I can`t land on at the airports");

    }
}
