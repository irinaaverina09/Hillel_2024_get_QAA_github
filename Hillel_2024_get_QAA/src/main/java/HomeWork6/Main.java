package HomeWork6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //HW 4.1

        Product product = new Product();
        product.supplyProducts();

        ProductItemId productItemId = new ProductItemId();
        productItemId.checkProductItemId();

        //HW 4.2

        Employee firstEmployee = new Employee("Irina Averina", "28/05/2015", 124.65);

        firstEmployee.calculateSalaryPerMonth();

        firstEmployee.setName ("Ave Irina");
        firstEmployee.setHireDate("31/12/2018");
        firstEmployee.setSalaryPerHour(54.76);
        firstEmployee.calculateSalaryPerMonth();

        // HW 4.4

        Debt bankingLoan = new Debt(80000.00,12.00, 365.00,250.00 );
        bankingLoan.calculateBankingDebt();

        bankingLoan.setDaysOfLoan(145.00);
        bankingLoan.setDebtAmount(55000.00);
        bankingLoan.setInterestRate(34.00);
        bankingLoan.setDaysPerYear(364.00);
        bankingLoan.calculateBankingDebt();

        // HW 4.3

        Triangle userTriangle = new Triangle(30, 40, 50);
        userTriangle.calculatePerimeter();
        userTriangle.calculateArea();

        userTriangle.setFirstSide(3);
        userTriangle.setSecondSide(4);
        userTriangle.setThirdSide(5);
        userTriangle.calculatePerimeter();
        userTriangle.calculateArea();



    }
}
