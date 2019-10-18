class SavingsAccount {
    public static double annualInterestRate = 0.0;
    private double savingsBalance;

    public SavingsAccount(double amountTotal){
        this.savingsBalance = amountTotal;
    }
    public void calculateMonthlyInterest(){
        double interest;
        interest = (this.savingsBalance * (annualInterestRate/100))/12;
        this.savingsBalance = this.savingsBalance + interest;  //updates total with interest
    }
    public void showBalance(){
        System.out.printf("$%.2f", this.savingsBalance); //prints to display active account totals
    }
    public static void modifyInterestRate(double newInterestRate){  //used to update to 5% interest rate
        annualInterestRate = newInterestRate;
    }
}

public class Application {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000.0); //Set initial account balance
        SavingsAccount saver2 = new SavingsAccount(3000.0);
        SavingsAccount.modifyInterestRate(4.0); // set initial interest rate to 4%
        System.out.println("\t\t \tSavings 1: \t Savings 2:");
        System.out.println(("-----------------------------------"));

        for (int i = 0; i < 12; ++i) {
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
            System.out.print("Month " + (i + 1) + ": \t");
            saver1.showBalance();
            System.out.print("\t  ");
            saver2.showBalance();
            System.out.println("");
        }
        System.out.println("Month 13 uses increased interest rate of 5.0%");
        SavingsAccount.modifyInterestRate(5.0); // increase of the interest rate to 5.0%

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.print("Month 13: \t");
        saver1.showBalance();
        System.out.print("\t  ");
        saver2.showBalance();
    }
}
