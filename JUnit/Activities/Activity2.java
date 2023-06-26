import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Activity2 {
    @Test
    void notEnoughFunds() {
        // Create an object for BankAccount class
        Activity2_BankAccount account = new Activity2_BankAccount(10);

        // Assertion for exception
        assertThrows(Activity2_NotEnoughFundsException.class, () -> account.withdraw(11),
                "Balance must be greater than withdraw amount");

    }
    @Test
    void enoughFunds() {
        // Create an object for BankAccount class
        Activity2_BankAccount account = new Activity2_BankAccount(100);

        // Assertion for no exceptions
        assertDoesNotThrow(() -> account.withdraw(99));
    }
}
