package LinkedInTests;

import LinkedIn.BankAccount;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(BankAccountParameterResolver.class)
public class BankAccountRepeatTest {
    @RepeatedTest(5)
    @DisplayName("Deposit 400 Succesfully")
    public void testDeposit(BankAccount bankAccount){
        bankAccount.deposit(500);
        assertEquals(500,bankAccount.getBalance());
    }

    @RepeatedTest(5)
    @DisplayName("Deposit 400 Succesfully")
    public void testDepositRepetitionInfo(BankAccount bankAccount, RepetitionInfo repetitionInfo){
        bankAccount.deposit(500);
        assertEquals(500,bankAccount.getBalance());
        System.out.println("This is run number: "+ repetitionInfo.getCurrentRepetition());
    }
}
