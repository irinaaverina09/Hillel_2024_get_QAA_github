package HomeWork6;

public class Triangle {
    public Integer getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(Integer firstSide) {
        this.firstSide = firstSide;
    }

    public Integer getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(Integer secondSide) {
        this.secondSide = secondSide;
    }

    public Integer getThirdSide() {
        return thirdSide;
    }

    public void setThirdSide(Integer thirdSide) {
        this.thirdSide = thirdSide;
    }

    Integer firstSide;
    Integer secondSide;
    Integer thirdSide;

    public Triangle (int userFirstSide, int userSecondSide, int userThirdSide) {
        firstSide = userFirstSide;
        secondSide = userSecondSide;
        thirdSide = userThirdSide;

    }


    public void calculatePerimeter () {
        int perimeter = firstSide + secondSide + thirdSide;
        System.out.println("The perimeter of triangle is " + perimeter);
    }


        public void calculateArea () {
            double halfArea = (firstSide + secondSide + thirdSide)/2;
            double areaBySide= halfArea*(halfArea-firstSide)*(halfArea-secondSide)*(halfArea-thirdSide);
            double area = Math.sqrt(areaBySide);
            System.out.println("The area of triangle is " + area);

        }
    }

