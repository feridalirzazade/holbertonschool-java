public class ControlledBankAccount extends BasicBankAccount{
    public ControlledBankAccount(String accountNumber, double annualInterestRate) {
        super(accountNumber, annualInterestRate);
    }

    private double minimumBalance;
    private double penaltyAmount;
    public double getMinimumBalance(){
        return minimumBalance;
    }
    public double getPenaltyAmount(){
        return penaltyAmount;
    }

    ControlledBankAccount(String accountNumber, double annualInterestRate, double minimumBalance, double penaltyAmount){
        super(accountNumber,annualInterestRate);

        this.minimumBalance = minimumBalance;
        this.penaltyAmount = penaltyAmount;
    }

    @Override
    public void applyMonthlyUpdate() {
        super.applyMonthlyUpdate();
        if (balance < minimumBalance) {
            balance -= penaltyAmount;
        }
    }

}
