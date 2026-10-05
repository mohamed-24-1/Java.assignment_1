package Assignment;
import java.util.Date;

public class Loan {

    // Data fields
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate;

    // Default constructor
    public Loan() {
        annualInterestRate = 2.5;
        numberOfYears = 1;
        loanAmount = 1000;
        loanDate = new Date();
    }

    // Constructor with specified values
    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        this.loanDate = new Date();
    }

    // Getter for annual interest rate
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    // Getter for number of years
    public int getNumberOfYears() {
        return numberOfYears;
    }

    // Getter for loan amount
    public double getLoanAmount() {
        return loanAmount;
    }

    // Getter for loan date
    public Date getLoanDate() {
        return loanDate;
    }

    // Setter for annual interest rate
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    // Setter for number of years
    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    // Setter for loan amount
    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    // Calculate monthly payment
    public double getMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 1200;

        double monthlyPayment = loanAmount * monthlyInterestRate
                / (1 - 1 / Math.pow(1 + monthlyInterestRate,
                numberOfYears * 12));

        return monthlyPayment;
    }

    // Calculate total payment
    public double getTotalPayment() {
        return getMonthlyPayment() * numberOfYears * 12;
    }
}
class TestLoan {

    public static void main(String[] args) {

        // Create a Loan object using the default constructor
        Loan loan1 = new Loan();

        System.out.println("Default Loan");
        System.out.println("-------------");
        System.out.println("Annual Interest Rate: " + loan1.getAnnualInterestRate());
        System.out.println("Number of Years: " + loan1.getNumberOfYears());
        System.out.println("Loan Amount: " + loan1.getLoanAmount());
        System.out.println("Loan Date: " + loan1.getLoanDate());
        System.out.println("Monthly Payment: " + loan1.getMonthlyPayment());
        System.out.println("Total Payment: " + loan1.getTotalPayment());

        System.out.println();

        // Create a Loan object using the parameterized constructor
        Loan loan2 = new Loan(5.5, 5, 5000);

        System.out.println("Custom Loan");
        System.out.println("-----------");
        System.out.println("Annual Interest Rate: " + loan2.getAnnualInterestRate());
        System.out.println("Number of Years: " + loan2.getNumberOfYears());
        System.out.println("Loan Amount: " + loan2.getLoanAmount());
        System.out.println("Loan Date: " + loan2.getLoanDate());
        System.out.println("Monthly Payment: " + loan2.getMonthlyPayment());
        System.out.println("Total Payment: " + loan2.getTotalPayment());

        System.out.println();

        // Test setters
        loan2.setAnnualInterestRate(4.5);
        loan2.setNumberOfYears(10);
        loan2.setLoanAmount(10000);

        System.out.println("After Using Setters");
        System.out.println("-------------------");
        System.out.println("Annual Interest Rate: " + loan2.getAnnualInterestRate());
        System.out.println("Number of Years: " + loan2.getNumberOfYears());
        System.out.println("Loan Amount: " + loan2.getLoanAmount());
        System.out.println("Monthly Payment: " + loan2.getMonthlyPayment());
        System.out.println("Total Payment: " + loan2.getTotalPayment());
    }
}