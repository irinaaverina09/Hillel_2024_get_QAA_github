package HomeWork6;

public class Debt {

    public Double getDebtAmount() {
        return debtAmount;
    }

    public void setDebtAmount(Double debtAmount) {
        this.debtAmount = debtAmount;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public Double getDaysPerYear() {
        return daysPerYear;
    }

    public void setDaysPerYear(Double daysPerYear) {
        this.daysPerYear = daysPerYear;
    }

    public Double getDaysOfLoan() {
        return daysOfLoan;
    }

    public void setDaysOfLoan(Double daysOfLoan) {
        this.daysOfLoan = daysOfLoan;
    }

    private Double debtAmount;
    private Double interestRate;
    private Double daysPerYear;
    private Double daysOfLoan;

    public Debt (Double loanDebtAmount, Double loanInterestRate, Double loanDaysPerYear, Double loanDaysOfLoan) {
      debtAmount = loanDebtAmount;
      interestRate = loanInterestRate;
      daysPerYear = loanDaysPerYear;
      daysOfLoan = loanDaysOfLoan;
    }

    public void calculateBankingDebt () {
        double formulaCalculateBankingDebt = debtAmount + debtAmount*((interestRate/100/daysOfLoan)*daysOfLoan);
        System.out.println("Your debt is " + formulaCalculateBankingDebt);
    }

}
