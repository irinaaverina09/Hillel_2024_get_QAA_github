package HomeWork6;

import java.util.Scanner;


public class Product {

    public void supplyProducts() {

        Scanner productName = new Scanner(System.in);
        System.out.println("Please enter your product name you want to order");
        String userProductName = productName.nextLine();

        Scanner numberOfItems = new Scanner(System.in);
        System.out.println("Please enter your number of products you want to order");
        Integer userNumberOfItems = numberOfItems.nextInt();

        System.out.println("The product " + userProductName + " of " + userNumberOfItems + " items will be supplied ");
    }
}