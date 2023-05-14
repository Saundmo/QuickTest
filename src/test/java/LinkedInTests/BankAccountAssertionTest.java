package LinkedInTests;

import LinkedIn.BankAccount;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import org.junit.Test;
import java.time.Duration;


public class BankAccountAssertionTest {

    @Test
    public void testWithdraw() {
        BankAccount bankAccount = new BankAccount(500, -1000);
        bankAccount.withdraw(300);
        assertEquals(200, bankAccount.getBalance(), 0);
    }

    @Test
    public void testDeposit() {
        BankAccount bankAccount = new BankAccount(400, 0);
        bankAccount.deposit(600);
        assertEquals(1000, bankAccount.getBalance(), 0);
    }

    @Test
    public void testWithdrawNotStuckAtZero() {
        BankAccount bankAccount = new BankAccount(500, -1000);
        bankAccount.withdraw(800);
        assertNotEquals(0, bankAccount.getBalance());
    }

    @Test
    public void testStatusActive() {
        BankAccount bankAccount = new BankAccount(500, 0);
        assertTrue(bankAccount.isActive());
    }

    @Test
    public void testStatusInactive() {
        BankAccount bankAccount = new BankAccount(500, 0);
        bankAccount.setActive(false);
        assertFalse(bankAccount.isActive());
    }

    @Test
    public void testAccountHolderNull() {
        BankAccount bankAccount = new BankAccount(500, 0);
        assertNull(bankAccount.getAccountHolder());
    }

    @Test
    public void testAccountHolderSet() {
        BankAccount bankAccount = new BankAccount(500, 0);
        bankAccount.setAccountHolder("Chris");
        assertNotNull(bankAccount.getAccountHolder());
    }

    @Test
    public void testNoWithdrawBelowMin() {
        BankAccount bankAccount = new BankAccount(500, -1000);
        assertThrows(RuntimeException.class, () -> bankAccount.withdraw(2000));
    }

    @Test
    public void testNoExceptions() {
        BankAccount bankAccount = new BankAccount(500, -1000);
        assertAll(() -> bankAccount.deposit(5), () -> bankAccount.withdraw(1500));
    }

    @Test
    public void testDepositTimeout(){
        BankAccount bankAccount = new BankAccount(400, -1000);
        assertTimeout(Duration.ofNanos(5), ()-> bankAccount.deposit(50000));
    }
}

