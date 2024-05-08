package HomeWork2;

import java.util.Scanner;
public class HomeWork2Salary {
    public static void main(String[] args) {

        Scanner workingHoursPerWeek = new Scanner(System.in);
        System.out.println("Please enter the number of working hours per week");
        double userWorkingHoursPerWeek = workingHoursPerWeek.nextDouble();

        Scanner wagePerHour = new Scanner(System.in);
        System.out.println("Please enter your wage per hour");
        double userWagePerHour = wagePerHour.nextDouble();

        Scanner taxRate = new Scanner(System.in);
        System.out.println("Please enter your tax rate");
        double userTaxRate = taxRate.nextDouble();

        double weeksPerMonth = 4.0;
        double weeksPerYear = weeksPerMonth * 12.0;

        double salaryPerMonthGross = userWorkingHoursPerWeek * userWagePerHour * weeksPerMonth;
        double salaryPerYearGross = userWorkingHoursPerWeek * userWagePerHour * weeksPerYear;
        double salaryPerMonthNet = salaryPerMonthGross - (salaryPerMonthGross * (userTaxRate/100));
        double salaryPerYearNet = salaryPerYearGross - (salaryPerYearGross * (userTaxRate/100));

        System.out.println("Your gross salary per month is " + salaryPerMonthGross);
        System.out.println("Your net salary per month is " + salaryPerMonthNet);
        System.out.println("Your gross salary per year is " + salaryPerYearGross);
        System.out.println("Your net salary per year is " + salaryPerYearNet);

    }
}
