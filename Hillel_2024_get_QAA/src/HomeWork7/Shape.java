package HomeWork7;

public class Shape {
    String name;

    public Shape (String figureShapeName) {
        name = figureShapeName;
    }

    public void getFigureShapeName () {
        System.out.println("It`s just a shape");
    }

    public String initialShapeName() {
        return name;
    }
}
