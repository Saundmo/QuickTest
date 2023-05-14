package LinkedInTests;

import LinkedIn.BankAccount;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Nested Testing")
public class BankAccountNestedTest {

    @Test
    @DisplayName("Withdraw 300 Successfully")
    public void testWithdraw(){
        BankAccount bankAccount = new BankAccount(500,-1000);
        bankAccount.withdraw(300);
        assertEquals(200, bankAccount.getBalance(), 0);
    }

    @Test
    @DisplayName("Deposit 600 Successfully")
    public void testDeposit(){
        BankAccount bankAccount = new BankAccount(400,0);
        bankAccount.deposit(600);
        assertEquals(1000, bankAccount.getBalance(), 0);
    }
    @Nested
    @DisplayName("Zero balance tests")
    class WhenBalanceeEqualsZero{
        @Test
        @DisplayName("Withdraw below minimal balance")
        public void testWithdrawMinimumBalanceIs0(){
            BankAccount bankAccount = new BankAccount(0,0);
            assertThrows(RuntimeException.class,() ->  bankAccount.withdraw(500));
        }

        @Test
        @DisplayName("Withdrawing into negative balance")
        public void testWithdrawMinimumBalanceNegative1000(){
            BankAccount bankAccount = new BankAccount(0,-1000);
            bankAccount.withdraw(500);
            assertEquals(-500,bankAccount.getBalance());
        }
    }
}
