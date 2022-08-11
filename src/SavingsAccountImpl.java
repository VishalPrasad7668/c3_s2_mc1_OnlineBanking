public class SavingsAccountImpl {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount("Ramesh Poddar", 5000.0, "active");
        System.out.println("Account HolderName = " + account.accountHolderName);
        System.out.println("Account Number = " + account.accountNumber);
        System.out.println("Account Balance = " + account.accountBalance);
        System.out.println("Account Status = " + account.accountStatus);
        System.out.println("Credit Cash = " + account.creditCash(3000.0));
        System.out.println("Debit Cash = " + account.debitCash(200.0));


    }
}
