package HomeWork4;

import java.util.Scanner;

public class HomeWork4CalculateSalary {
    public static void main(String[] args) {
        Scanner salaryPerHour = new Scanner(System.in);
        Scanner taxRate = new Scanner(System.in);
        Scanner checkFebruary = new Scanner(System.in);


        System.out.println("Please enter your salary per hour");
        double userSalaryPerHour = salaryPerHour.nextDouble();
        System.out.println("Please enter your tax rate");
        double userTaxRate = taxRate.nextDouble();
        System.out.println("Please confirm there are 28 days in February? Program will work for only 28 days in February");
        int userCheckFebruary = checkFebruary.nextInt();
        if (userCheckFebruary == 28) {
            System.out.println("This year would have 365 days");
        } else {
            System.out.println("Program does not work");

        }

        calculateSalaryPerMonth(userSalaryPerHour, userTaxRate);


    }

    /*23j, 20f, 23m, 22a, 23m, 22j, 23j, 23a, 22s, 23o, 22n, 23d  working days per month
    23*7 + 20 + 22*4 = 161 + 20 + 88 = 269 working days per year*/
    public static void calculateSalaryPerMonth(double userSalaryPerHour, double userTaxRate) {
        double grossSalaryPerJan = userSalaryPerHour * 23;
        double grossSalaryPerFeb = userSalaryPerHour * 20;
        double grossSalaryPerMar = userSalaryPerHour * 23;
        double grossSalaryPerApr = userSalaryPerHour * 22;
        double grossSalaryPerMay = userSalaryPerHour * 23;
        double grossSalaryPerJun = userSalaryPerHour * 22;
        double grossSalaryPerJul = userSalaryPerHour * 23;
        double grossSalaryPerAug = userSalaryPerHour * 23;
        double grossSalaryPerSep = userSalaryPerHour * 22;
        double grossSalaryPerOct = userSalaryPerHour * 23;
        double grossSalaryPerNov = userSalaryPerHour * 22;
        double grossSalaryPerDec = userSalaryPerHour * 23;

        double grossSalaryPerYear = grossSalaryPerJan*7 + grossSalaryPerFeb + grossSalaryPerApr*4;

        double netSalaryPerJan = grossSalaryPerJan - (grossSalaryPerJan * (userTaxRate / 100));
        double netSalaryPerFeb = grossSalaryPerFeb - (grossSalaryPerFeb * (userTaxRate / 100));
        double netSalaryPerMar = grossSalaryPerMar - (grossSalaryPerMar * (userTaxRate / 100));
        double netSalaryPerApr = grossSalaryPerApr - (grossSalaryPerApr * (userTaxRate / 100));
        double netSalaryPerMay = grossSalaryPerMay - (grossSalaryPerMay * (userTaxRate / 100));
        double netSalaryPerJun = grossSalaryPerJun - (grossSalaryPerJun * (userTaxRate / 100));
        double netSalaryPerJul = grossSalaryPerJul - (grossSalaryPerJul * (userTaxRate / 100));
        double netSalaryPerAug = grossSalaryPerAug - (grossSalaryPerAug * (userTaxRate / 100));
        double netSalaryPerSep = grossSalaryPerSep - (grossSalaryPerSep * (userTaxRate / 100));
        double netSalaryPerOct = grossSalaryPerOct - (grossSalaryPerOct * (userTaxRate / 100));
        double netSalaryPerNov = grossSalaryPerNov - (grossSalaryPerNov * (userTaxRate / 100));
        double netSalaryPerDec = grossSalaryPerDec - (grossSalaryPerDec * (userTaxRate / 100));

        double netSalaryPerYear = netSalaryPerJan*7 + netSalaryPerFeb + netSalaryPerApr*4;

        System.out.println("JAN "  +  netSalaryPerJan + "  " + grossSalaryPerJan + "\n" + "FEB "  +  netSalaryPerFeb + "  " + grossSalaryPerFeb + "\n" + "MAR "  +  netSalaryPerMar + "  " + grossSalaryPerMar + "\n" + "APR "  +  netSalaryPerApr + "  " + grossSalaryPerApr + "\n" + "MAY "  +  netSalaryPerMay + "  " + grossSalaryPerMay + "\n" + "JUN "  +  netSalaryPerJun + "  " + grossSalaryPerJun + "\n" + "JUL "  +  netSalaryPerJul + "  " + grossSalaryPerJul + "\n" + "AUG "  +  netSalaryPerAug + "  " + grossSalaryPerAug + "\n" + "SEP "  +  netSalaryPerSep + "  " + grossSalaryPerSep + "\n" + "OCT "  +  netSalaryPerOct + "  " + grossSalaryPerOct + "\n" + "NOV "  +  netSalaryPerNov + "  " + grossSalaryPerNov + "\n" + "DEC "  +  netSalaryPerDec + "  " + grossSalaryPerDec + "\n" + "TOTAL: "  + netSalaryPerYear + "  " + grossSalaryPerYear);
    }

}
