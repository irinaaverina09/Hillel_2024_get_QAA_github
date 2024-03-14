package HomeWork3;

import java.util.Scanner;

public class HomeWork3CalculatePrice {

        public static void main(String[] args) {

            double pricePerItem = Double.parseDouble(args[0]);


            Scanner numberOfItems = new Scanner(System.in);
            System.out.println("Please enter the number of items you want to buy");
            double userNumberOfItems = numberOfItems.nextDouble();

            double discountRateFor10 = 0.05;

            double discountRateFor20 = 0.1;

            double discountRateFor30 = 0.12;

            double additionalDiscountRateForNext10Items = 0.004;

            double discountRateFor41 = discountRateFor30 + additionalDiscountRateForNext10Items;

            double discountRateFor51 = discountRateFor30 + 2*additionalDiscountRateForNext10Items;

            double discountRateFor61 = discountRateFor30 + 3*additionalDiscountRateForNext10Items;

            double discountRateFor71 = discountRateFor30 + 4*additionalDiscountRateForNext10Items;

            double discountRateFor80 = 0.13;

            //double pricePerItem = 15;


            if (userNumberOfItems <= 10 ) {
                double totalPriceNoDiscount = userNumberOfItems * pricePerItem;
                System.out.println("You will pay " + (totalPriceNoDiscount)  + " for the " + userNumberOfItems + " items with no discount");
            }

            else if (userNumberOfItems >= 11 && userNumberOfItems <=20 ) {
                double totalPrice = userNumberOfItems * pricePerItem * discountRateFor10;
                System.out.println("You will pay " + (totalPrice)  + " for the " + userNumberOfItems + " items with " + discountRateFor10 + " discount");
            }

            else if (userNumberOfItems > 20 && userNumberOfItems <=30 ) {
                double totalPrice = userNumberOfItems * pricePerItem * discountRateFor20;
                System.out.println("You will pay " + (totalPrice)  + " for the " + userNumberOfItems + " items with " + discountRateFor20 + " discount");
            }

            else if (userNumberOfItems > 30 && userNumberOfItems <=40 ) {
                double totalPrice = userNumberOfItems * pricePerItem * discountRateFor30;
                System.out.println("You will pay " + (totalPrice)  + " for the " + userNumberOfItems + " items with " + discountRateFor30 + " discount");
            }

            else if (userNumberOfItems > 80) {
                double totalPrice = userNumberOfItems * pricePerItem * discountRateFor80;
                System.out.println("You will pay " + (totalPrice)  + " for the " + userNumberOfItems + " items with " + discountRateFor80 + " discount");
            }

            else if (userNumberOfItems >= 41 && userNumberOfItems <=50 ) {
                double totalPrice = userNumberOfItems * pricePerItem * discountRateFor41;
                System.out.println("You will pay " + (totalPrice)  + " for the " + userNumberOfItems + " items with " + discountRateFor41 + " discount");
            }

            else if (userNumberOfItems >= 51 && userNumberOfItems <=60 ) {
                double totalPrice = userNumberOfItems * pricePerItem * discountRateFor51;
                System.out.println("You will pay " + (totalPrice)  + " for the " + userNumberOfItems + " items with " + discountRateFor51 + " discount");
            }

            else if (userNumberOfItems >= 61 && userNumberOfItems <=70 ) {
                double totalPrice = userNumberOfItems * pricePerItem * discountRateFor61;
                System.out.println("You will pay " + (totalPrice)  + " for the " + userNumberOfItems + " items with " + discountRateFor61 + " discount");
            }

            else if (userNumberOfItems >= 71 && userNumberOfItems <=80 ) {
                double totalPrice = userNumberOfItems * pricePerItem * discountRateFor71;
                System.out.println("You will pay " + (totalPrice)  + " for the " + userNumberOfItems + " items with " + discountRateFor71 + " discount");
            }


        }
    }

