package LinkedInTests;

import LinkedIn.BankAccount;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(BankAccountParameterResolver.class)
public class BankAccountDITest {
    @Test
    @DisplayName("Deposit 400 Succesfully")
    public void testDeposit(BankAccount bankAccount){
        bankAccount.deposit(500);
        assertEquals(500,bankAccount.getBalance());
    }
}
