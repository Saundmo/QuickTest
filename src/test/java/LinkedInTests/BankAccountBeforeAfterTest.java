package LinkedInTests;

import LinkedIn.BankAccount;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BankAccountBeforeAfterTest {

    static BankAccount bankAccount;
    static int step;

    @BeforeAll
    public static void setUp(){
        System.out.println("Ready, Steady, Test!!");
        step = 1;
        bankAccount = new BankAccount(50,0);
    }

    @AfterAll
    public static void closeDown(){
        System.out.println("Bye for now!");
        bankAccount = new BankAccount(50,0);
    }

    @BeforeEach
    public void stepNum(){
        System.out.println("This is step number: " + step);
    }

    @AfterEach
    public void increment(){
        step ++;
    }

    @Test
    @Order(1)
    public void depositFirst(){
        bankAccount.deposit(950);
        System.out.println("Deposit: "+bankAccount.getBalance());
        assertEquals(1000, bankAccount.getBalance(), 0);
    }

    @Test
    @Order(2)
    public void testWithdraw(){
        bankAccount.withdraw(100.00);
        System.out.println("Withdraw: "+bankAccount.getBalance());
    }




}
