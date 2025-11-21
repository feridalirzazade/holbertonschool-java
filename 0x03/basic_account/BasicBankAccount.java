import exceptions.InvalidOperationException;

public class BasicBankAccount {
    private String accountNumber;
    private double balance;
    private double actualInterestRate;

     public String getAccountNumber(){
         return accountNumber;
     }
    public double getBalance(){
        return balance;
    }
    public double getActualInterestRate(){
        return actualInterestRate;
    }

    BasicBankAccount(String accountNumber, double actualInterestRate){
         this.accountNumber = accountNumber;
         this.actualInterestRate = actualInterestRate;
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
         if((balance/10) > 10) return 10;
         return (balance/10);
    }

    public double calculateMonthlyInterest(){
         if(balance <= 0) return 0;
         return balance * actualInterestRate;
    }

    public void applyMonthlyUpdate(){
         balance = balance - calculateMonthlyFee() + calculateMonthlyInterest();
    }
}
