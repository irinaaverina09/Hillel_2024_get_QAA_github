package HomeWork7;

public class Triangle extends Shape {
    public Triangle (String name){
        super(name);
    }

    @Override
    public void getFigureShapeName () {
        System.out.println("Triangle overrides Shape method");

    }

}
