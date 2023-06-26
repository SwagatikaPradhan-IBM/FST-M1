public class Activity2_BankAccount {
        private Integer balance;

        // Create a constructor
        public Activity2_BankAccount(Integer initialBalance)
        {
            balance = initialBalance;
        }

        // Add method to calculate
        // balance amount after withdrawal
        public Integer withdraw(Integer amount)
        {
            if (balance < amount)
            {
                throw new Activity2_NotEnoughFundsException(amount, balance);
            }
            balance -= amount;
            return balance;
        }

}
