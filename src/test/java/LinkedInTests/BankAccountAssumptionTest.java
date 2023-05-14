package LinkedInTests;

import LinkedIn.BankAccount;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

public class BankAccountAssumptionTest {

    @Test

    public void testActiveAssumption(){
        BankAccount bankAccount = new BankAccount(500,0);
        assumeFalse(bankAccount == null);
        assertTrue(bankAccount.isActive());

    }


}
