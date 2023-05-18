import java.util.UUID;

public class SBIBankAccount implements BankAccount {
    private String accountNumber;
    private int age;
    private int balance;
    private int roi;

    public SBIBankAccount(int balance, int age){
        this.balance = balance;
        this.accountNumber = String.valueOf(UUID.randomUUID());
        if(age <= 20)this.roi = 5;
        else if(age > 20 && age <= 40)this.roi = 7;
        else if(age > 40)this.roi = 9;
        this.age = age;
    }
    public SBIBankAccount(int balance, int roi, int age){
        this.balance = balance;
        this.accountNumber = String.valueOf(UUID.randomUUID());
        this.roi = roi;
        this.age = age;
    }
    public void setBalance(int balance){
        this.balance = balance;
    }
    public int getBalance(){
        return this.balance;
    }
    @Override
    public boolean withdrawMoney(int money){
        if(this.balance-500 >= money){
            this.balance = this.balance - money;
            return true;
        }
        return false;
    }

    @Override
    public int checkBalance() {
        return this.balance;
    }

    @Override
    public int getROI() {
        return this.roi;
    }

    @Override
    public int getTotalInterest(int amount, int timeInYears) {
        return amount * timeInYears * this.roi / 100;
    }
}
