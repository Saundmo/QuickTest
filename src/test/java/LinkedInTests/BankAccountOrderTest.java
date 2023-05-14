package LinkedInTests;

import LinkedIn.BankAccount;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.Assert.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BankAccountOrderTest {

    static BankAccount bankAccount = new BankAccount(50,0);

    @Test
    @Order(2)
    public void testWithdraw(){
        System.out.println("Withdraw: "+bankAccount.getBalance());
        bankAccount.withdraw(10.00);
    }

    @Test
    @Order(1)
    public void depositFirst(){
        bankAccount.deposit(950);
        System.out.println("Deposit: "+bankAccount.getBalance());
        assertEquals(1000,bankAccount.getBalance(),0);
    }



}
