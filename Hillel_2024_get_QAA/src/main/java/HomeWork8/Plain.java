package HomeWork8;

public class Plain implements Flyable {
    @Override
    public void fly() {
        System.out.println("I believe I can fly faster than Eagle");
    }

    @Override
    public void landOn() {
        System.out.println("I can land on only at the airport");

    }

    public void getPlainRoute (String pointA, String pointB) {

        System.out.println("I am flying from " + pointA + " to " + pointB);
    }
}
