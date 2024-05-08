package HomeWork7;

public class Quadrangle {
    // implementing composition

    protected Shape shape;

    public Quadrangle() {
        this.shape = new Shape("This is Quadrangle");

        }
        public void getFigureShapeName () {
        shape.getFigureShapeName();
        }

    public void initialShapeName() {
        shape.initialShapeName();
        return;
    }


}
