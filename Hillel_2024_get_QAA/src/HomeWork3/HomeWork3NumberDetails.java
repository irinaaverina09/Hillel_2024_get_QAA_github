package HomeWork3;

import java.util.Scanner;

public class HomeWork3NumberDetails {
    public static void main(String[] args) {
        Scanner numberToDetail = new Scanner(System.in);
        System.out.println("Please enter your number to detail");
        long userNumberToDetail = numberToDetail.nextLong();


        // would be at least one match if number is a composite number

        {
            for (int compositeIndex = 2; compositeIndex < 10; compositeIndex++)
                if (userNumberToDetail % compositeIndex == 0 && userNumberToDetail != 0 && userNumberToDetail != 1 && userNumberToDetail != compositeIndex) {
                    System.out.println("Entered number " + userNumberToDetail + " can be divided on " + compositeIndex + " so, it is a composite number");
                }


            double checkNumberIsEven = userNumberToDetail % 2;
            if (checkNumberIsEven == 0 && userNumberToDetail != 0) {
                System.out.println("Entered number " + userNumberToDetail + " is even number");
            } else if (checkNumberIsEven != 0) {
                System.out.println("Entered number " + userNumberToDetail + " IS NOT even number");
            } else if (userNumberToDetail == 0 || userNumberToDetail == 1) {
                System.out.println("Entered number " + userNumberToDetail + " IS NOT even number");
            }
            if (userNumberToDetail > 0) {
                System.out.println("Entered number " + userNumberToDetail + " is a positive number");
            } else if (userNumberToDetail < 0) {
                System.out.println("Entered number " + userNumberToDetail + " is a negative number");
            }

        }
    }
}
