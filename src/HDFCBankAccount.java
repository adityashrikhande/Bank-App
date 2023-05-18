import java.util.UUID;

public class HDFCBankAccount implements BankAccount{

    private String accountNumber;
    private int balance;
    private int roi;

    public HDFCBankAccount(int balance){
        this.balance = balance;
        this.accountNumber = String.valueOf(UUID.randomUUID());
        this.roi = 5;
    }
    public HDFCBankAccount(int balance, int roi){
        this.balance = balance;
        this.accountNumber = String.valueOf(UUID.randomUUID());
        this.roi = roi;
    }
    public void setBalance(int balance){
        this.balance = balance;
    }
    public int getBalance(){
        return this.balance;
    }
    @Override
    public boolean withdrawMoney(int money){
        if(this.balance >= money){
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
