import exceptions.InvalidOperationException;

public class BasicBankAccount {
    private final String accountNumber;
    private double balance;
    private final double annualInterestRate;

     public String getAccountNumber(){
         return accountNumber;
     }
    public double getBalance(){
        return balance;
    }
    public double getActualInterestRate(){
        return annualInterestRate;
    }

    public BasicBankAccount(String accountNumber, double annualInterestRate){
         this.accountNumber = accountNumber;
         this.annualInterestRate = annualInterestRate;
         this.balance = 0;
    }

    public void deposit(double value) throws InvalidOperationException {
         if(value <= 0){
             throw new InvalidOperationException("Deposit amount must be greater than 0");
         }
         else balance = balance + value;
    }
    public void withdraw(double value) throws InvalidOperationException {
         if(value <= 0){
             throw new InvalidOperationException("Withdrawal amount must be greater than 0");
         }
         else if(value > balance){
             throw new InvalidOperationException("Withdrawal amount must be less than the current balance");
         }
         else balance = balance - value;
    }

    public double calculateMonthlyFee(){
         if((balance * 0.10) > 10) return 10;
         return (balance * 0.10);
    }

    public double calculateMonthlyInterest(){
         if(balance <= 0) return 0;
         return balance * annualInterestRate;
    }

    public void applyMonthlyUpdate(){
         balance = balance - calculateMonthlyFee() + calculateMonthlyInterest();
    }
}
