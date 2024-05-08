package HomeWork2;

import java.util.Scanner;
public class HomeWork2WagePerHour {
    public static void main(String[] args) {

        Scanner workingHoursPerWeek = new Scanner(System.in);
        System.out.println("Please enter the number of working hours per week");
        double userWorkingHoursPerWeek = workingHoursPerWeek.nextDouble();

        Scanner grossSalaryPerYear = new Scanner(System.in);
        System.out.println("Please enter your gross salary per year");
        double userGrossSalaryPerYear = grossSalaryPerYear.nextDouble();

        Scanner taxRate = new Scanner(System.in);
        System.out.println("Please enter your tax rate");
        double userTaxRate = taxRate.nextDouble();

        double weeksPerMonth = 4.0;

        double salaryPerMonthGross = userGrossSalaryPerYear / 12;

        double salaryPerWeekGross = salaryPerMonthGross / weeksPerMonth;

        double wagePerHourNet = salaryPerWeekGross - (salaryPerWeekGross * (userTaxRate/100));

        System.out.println("With " + userWorkingHoursPerWeek + " working hours per week and with " + userGrossSalaryPerYear + " gross salary per year, your net wage per hour is " + wagePerHourNet);

    }
}
