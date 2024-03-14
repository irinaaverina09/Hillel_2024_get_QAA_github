package HomeWork2;

import java.util.Scanner;

public class HomeWork2numbers {
    public static void main(String[] args) {
        Scanner firstNumber = new Scanner(System.in);
        System.out.println("Please enter the first number");
        int userFirstNumber = firstNumber.nextInt();

        Scanner secondNumber = new Scanner(System.in);
        System.out.println("Please enter the second number");
        int userSecondNumber = firstNumber.nextInt();

        long result = (long) Math.pow(userFirstNumber, userSecondNumber);

        System.out.println("The result is " + result);
    }
}
