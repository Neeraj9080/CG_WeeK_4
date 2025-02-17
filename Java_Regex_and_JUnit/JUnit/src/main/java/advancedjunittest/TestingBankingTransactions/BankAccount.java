package advancedjunittest.TestingBankingTransactions;
// Creating class BankAccount to implement Banking transactions system
public class BankAccount
{
    private static double balance;

    // Constructor of the class
    public BankAccount() {
        this.balance = 0.0;
    }

    // Method to deposit balance
    public static void depositBalance(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Method to withdraw balance
    public static void withdrawBalance(double amount) throws IllegalArgumentException {
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient balance");
        }
        balance -= amount;
    }

    // Method to grt balance
    public static double getBalance() {
        return balance;
    }

    // Main method
    public static void main(String[] args)
    {
        // Calling method of the class
        depositBalance(1000);
        System.out.println("Balance after deposit : " + getBalance());

        try {
            withdrawBalance(1000);
            System.out.println("Balance after withdrawal : " + getBalance());

            withdrawBalance(2000);
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
