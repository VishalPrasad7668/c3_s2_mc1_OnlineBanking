import java.util.Random;

public class SavingsAccount {
    long accountNumber;
    String accountHolderName;
    double accountBalance;
    String accountStatus;

    SavingsAccount(String accountHolderName, double accountBalance, String accountStatus) {
        this.accountNumber = generateAccountNumber();
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
        this.accountStatus = accountStatus;

    }

    public long generateAccountNumber() {
        Random random = new Random();
        accountNumber = random.nextLong(4907000000000L, 4907500000000L);
        return accountNumber;

    }

    public double debitCash(double amount) {
        return accountBalance - amount;
    }

    public double creditCash(double amount) {
        return accountBalance + amount;
    }
}
