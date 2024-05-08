package HomeWork8;

public class Pike extends Animal {
    @Override
    public void getAnimalLivingPlace() {
        System.out.println("I am a Pike and I live in a water");

    }
    public void catchPike () {
        System.out.println("Free me and I I'll make your wish come true");
    }

    String name = "Vasya";

    public void sayMyName () {
        System.out.println("By the way my name is " + name);
    }

}
