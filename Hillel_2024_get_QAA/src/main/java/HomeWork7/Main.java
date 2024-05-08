package HomeWork7;

public class Main {
    public static void main(String[] args) {

        Shape shape = new Shape("Initial Shape name");

        Round round = new Round ("My name is round");
        System.out.println(round.name);
        // round calls super method
        round.getFigureShapeName();

        Triangle triangle = new Triangle("My name is triangle");
        // Triangle overrides super method
        System.out.println(triangle.name);
        triangle.getFigureShapeName();

        Quadrangle quadrangle = new Quadrangle();
        // Як вивести в 20 рядку параметр класу Quadrangle рядок 9 ?
        quadrangle.initialShapeName();
        // Quadrangle has a shape
        quadrangle.getFigureShapeName();

    }
}