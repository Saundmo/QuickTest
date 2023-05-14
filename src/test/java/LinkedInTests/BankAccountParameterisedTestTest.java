package LinkedInTests;

import LinkedIn.BankAccount;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.time.DayOfWeek;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(BankAccountParameterResolver.class)
@Execution(ExecutionMode.SAME_THREAD)
public class BankAccountParameterisedTestTest {

    @ParameterizedTest
    @ValueSource(ints = {100, 400, 700, 1500})
    @DisplayName("Deposit parameter value Succesfully")
    public void testDeposit(int amount, BankAccount bankAccount){
        bankAccount.deposit(500);
        assertEquals(500,bankAccount.getBalance());
    }

    @ParameterizedTest
    @EnumSource(value = DayOfWeek.class)
    public void testDayOfWeek(DayOfWeek day){
        System.out.println(day);
        assertTrue(day.toString().endsWith("Y"));
        //This will cause failures and is intended as an example
//        assertTrue((day.toString().startsWith("T"))||(day.toString().startsWith("S")));
    }

    @ParameterizedTest
    @CsvFileSource(files = "A:/CRPSA/Documents/Coding/Input.csv")
    public void depositCSVFileTest(int amount,String name, BankAccount bankAccount){
        bankAccount.setAccountHolder(name);
        bankAccount.deposit(amount);
        assertEquals(name,bankAccount.getAccountHolder());
        assertEquals(amount,bankAccount.getBalance());
    }
}


