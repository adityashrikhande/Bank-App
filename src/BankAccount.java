public interface BankAccount {
    public boolean withdrawMoney(int money);
    public int checkBalance();
    public int getROI();
    public int getTotalInterest(int amount, int timeInYears);
}
