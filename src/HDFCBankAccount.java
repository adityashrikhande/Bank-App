public class HDFCBankAccount implements BankAccount{

    private int balance;

    public HDFCBankAccount(int balance){
        this.balance = balance;
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
}
