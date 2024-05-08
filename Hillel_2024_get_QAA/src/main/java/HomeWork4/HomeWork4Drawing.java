package HomeWork4;

import java.util.Scanner;
public class HomeWork4Drawing {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        do {

            System.out.println("""
                Which shape to display?\s
                If it's a rectangle, press number 1\s
                If it's a right triangle (right angle at the bottom left), press number 2\s
                If it's a right triangle (right angle at the bottom right), press number 3\s
                If it's a triangle, press number 4\s""");

            int shape = scanner.nextInt();

            if (shape == 1) {
                System.out.println("Height of rectangle is:");
                int heightOfRectangle = scanner.nextInt();
                System.out.println("Width of rectangle is:");
                int widthOfRectangle = scanner.nextInt();

                for (int i = 0; i < heightOfRectangle; i++) {
                    for (int j = 0; j < widthOfRectangle; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
            }
            else if (shape == 2) {
                System.out.println("Height of right triangle is:");
                int heightOfRightTriangle = scanner.nextInt();

                for (int row = 1; row <= heightOfRightTriangle; row++) {
                    for (int col = 1; col <= row; col++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
            else if (shape == 3) {
                System.out.println("Height of right triangle is:");
                int heightOfRightTriangle = scanner.nextInt();

                for (int row = 1; row <= heightOfRightTriangle; row++) {
                    for (int col = 1; col <= heightOfRightTriangle - row; col++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                    for (int col = 1; col < row; col++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
            else if (shape == 4) {
                System.out.println("Height of right triangle is:");
                int heightOfRightTriangle = scanner.nextInt();

                for (int row = 1; row <= heightOfRightTriangle; row++) {
                    for (int col = 1; col <= heightOfRightTriangle - row; col++) {
                        System.out.print(" ");
                    }
                    for (int co = 1; co <= 2 * row - 1; co++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }

            } System.out.println("""
                     Do you want to display another shape?\s
                     if YES, press number 1\s
                     if NO,  press number 2\s""");
            int yesOrNo = scanner.nextInt();
            if (yesOrNo == 1) {
            } else {
                break;
            }
        } while (true);
        System.out.println("Thank you. The program finishing it's work");
    }
}

