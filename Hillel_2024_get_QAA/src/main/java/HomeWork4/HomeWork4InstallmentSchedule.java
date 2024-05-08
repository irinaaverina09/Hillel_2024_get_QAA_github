package HomeWork4;

import java.util.Scanner;

public class HomeWork4InstallmentSchedule {
    public static void main(String[] args) {

        Scanner totalDebtAmount = new Scanner(System.in);
        Scanner interestRate = new Scanner(System.in);
        Scanner monthlyInstallment = new Scanner(System.in);
        Scanner choiceProgram = new Scanner(System.in);
        Scanner numberOfPayments = new Scanner(System.in);

        System.out.println("Please enter your total Debt Amount");
        double userTotalDebtAmount = totalDebtAmount.nextDouble();
        System.out.println("Please enter your interest rate");
        double userInterestRate = interestRate.nextDouble();
        System.out.println("Please enter your monthly installment");
        double userMonthlyInstallment = monthlyInstallment.nextDouble();
        System.out.println("Please enter your number of payments");
        double userNumberOfPayments = numberOfPayments.nextDouble();
        System.out.println("Do you want to calculate number of installments? If Yes, please set true. If No, please set false.");
        boolean userChoiceProgram = choiceProgram.nextBoolean();
        if (userChoiceProgram == true) {
            System.out.println("I am here to help with Program#1");
            calculateNumberOfInstallments(userTotalDebtAmount, userMonthlyInstallment);
        }
        else {
            System.out.println("I am here to help with Program#2");
            calculateMonthlyInstallmentPayment (userTotalDebtAmount, userNumberOfPayments, userInterestRate);
        }

    }

    public static void calculateNumberOfInstallments(double userTotalDebtAmount, double userMonthlyInstallment) {
        double numberOfInstallments = userTotalDebtAmount / userMonthlyInstallment;
        System.out.println("You will pay " + numberOfInstallments + " months with " + userMonthlyInstallment + " payment amount to pay a whole debt " + userTotalDebtAmount);
    }

    public static void calculateMonthlyInstallmentPayment(double userTotalDebtAmount, double userNumberOfPayments, double userInterestRate) {
        double monthlyInstallmentPayment = userTotalDebtAmount / userNumberOfPayments;

        for (double i = userTotalDebtAmount; i > 0;i = i - monthlyInstallmentPayment) {
            double debtWithInterestRate = i + i*(userInterestRate/100);
            System.out.println("You will pay your monthly installment " + debtWithInterestRate +  " with interest rate " + userInterestRate + " included");
        }
    }


}


