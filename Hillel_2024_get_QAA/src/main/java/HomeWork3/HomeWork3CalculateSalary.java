package HomeWork3;

import java.util.Scanner;

public class HomeWork3CalculateSalary {
    public static void main(String[] args) {
        Scanner monthNumber = new Scanner(System.in);
        System.out.println("Please enter your month number in a range of 1 - 12");
        double userMonthNumber = monthNumber.nextDouble();

        if (userMonthNumber > 12){
            System.out.println("There are only 12 months in a year");
            System.exit(0);
        }
        else if (userMonthNumber  < 1){
            System.out.println("Please enter your month number in a range of 1 - 12");
            System.exit(0);
        }

        Scanner numberOfDaysInMonth = new Scanner(System.in);
        // assume employee is working without sick leave, day off and so on
        System.out.println("Please enter number of days in a month in a range of 28 - 31 days");
        double userNumberOfDaysInMonth = numberOfDaysInMonth.nextDouble();

        if (userNumberOfDaysInMonth < 28){
            System.out.println("Number of days in a month IS NOT in a range of 28 - 31 days");
            System.exit(0);
        }
        else if (userNumberOfDaysInMonth > 31){
            System.out.println("Number of days in a month IS NOT in a range of 28 - 31 days");
            System.exit(0);
        }

        Scanner salaryPerHour = new Scanner(System.in);
        System.out.println("Please enter your salary per hour");
        double userSalaryPerHour = salaryPerHour.nextDouble();

        Scanner salaryTaxRate = new Scanner(System.in);
        System.out.println("Please enter your salary tax rate");
        double userSalaryTaxRate = salaryTaxRate.nextDouble();

        double calculateLastWeekOfMonthReminder = userNumberOfDaysInMonth % 7;
        // every month has at least 20 working days
        double calculateNumberOfWorkingDaysPerMonth = 20 + calculateLastWeekOfMonthReminder;


        double salaryPerMonthWithTax = calculateNumberOfWorkingDaysPerMonth * userSalaryPerHour;
        System.out.println("Your gross salary per month is " + salaryPerMonthWithTax);

        double salaryPerMonthNet =  salaryPerMonthWithTax - ( salaryPerMonthWithTax * (userSalaryTaxRate/100));
        System.out.println("Your net salary per month is " + salaryPerMonthNet);


    }
}