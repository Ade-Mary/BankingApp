import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BankTest {

    Bank bank = new Bank("Ingryd Bank");
    Account accountFrom = new Account("0020123456", 500000.0);
    Account accountTo = new Account("0012345678", 100000.0);

    @Test
    public void withdrawFunds(){
        assertEquals(300000.0, bank.withdraw(accountFrom, 200000.0));
    }

    @Test
    public void depositFunds(){
        assertEquals(300000.0, bank.deposit(accountTo, 200000.0));
    }

    @Test
    public void transferFunds(){
        assertEquals(450000.0, bank.withdraw(accountFrom, 50000.0));
        assertEquals(150000.0, bank.deposit(accountTo, 50000.0));
    }
}
