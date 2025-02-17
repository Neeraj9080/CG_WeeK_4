package advanceedjunittest.TestBankingTransactions;
import static advancedjunittest.TestingBankingTransactions.BankAccount.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
// Creating class TestingBankingTransactions to test our BankAccount program
public class TestingBankingTransactions
{
    @Test
    public void testDeposit() {
        depositBalance(1000);
        assertEquals(2000.0, getBalance());
    }

    @Test
    public void testWithdrawal() {
        withdrawBalance(500);
        assertEquals(1500.0, getBalance());
    }

    @Test
    public void testInsufficientFunds() {
        assertThrows(IllegalArgumentException.class, () -> withdrawBalance(2000));
    }

    @Test
    public void testGetBalance() {
        depositBalance(1000);
        assertEquals(1000.0, getBalance());
    }
}
