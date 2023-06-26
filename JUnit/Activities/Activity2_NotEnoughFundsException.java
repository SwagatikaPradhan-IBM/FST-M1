public class Activity2_NotEnoughFundsException extends RuntimeException{

        public Activity2_NotEnoughFundsException(Integer amount, Integer balance)
        {
            super("Attempted to withdraw " + amount + " with a balance of " + balance);
        }
}
