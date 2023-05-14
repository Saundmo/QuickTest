package LinkedInTests;

import LinkedIn.BankAccount;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Test BankAccount class")
public class BankAccountTest {

    @Test
    @DisplayName("Withdraw 500 Successfully")
    public void testWithdraw(){
        BankAccount bankAccount = new BankAccount(500,-1000);
        bankAccount.withdraw(300);
        assertEquals(200,bankAccount.getBalance(),0);
    }

    @Test
    @DisplayName("Deposit 600 Successfully")
    public void testDeposit(){
        BankAccount bankAccount = new BankAccount(400,0);
        bankAccount.deposit(600);
        assertEquals(1000,bankAccount.getBalance(),"You have failed!!");
    }
}
