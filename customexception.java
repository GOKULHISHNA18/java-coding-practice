class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class customexception {

    public static void withdraw(double balance, double amount)
            throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException(
                "Insufficient balance! Available balance: " + balance
            );
        }

        System.out.println("Withdrawal successful.");
        System.out.println("Remaining balance: " + (balance - amount));
    }

    public static void main(String[] args) {

        double balance = 5000;
        double amount = 7000;

        try {
            withdraw(balance, amount);
        } catch (InsufficientBalanceException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}