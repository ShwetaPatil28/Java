import java.util.Scanner;
class LowBalanceException extends Exception {
    public LowBalanceException(String message) {
        super(message);
    }
}

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be negative. Setting balance to 0.");
            this.balance = 0;
        }
    }

    public void balanceEnquiry() {
        System.out.printf("Current Balance: $%.2f%n", balance);
    }

    public void deposit(double amount) throws NegativeNumberException {
        if (amount < 0) {
            throw new NegativeNumberException("Cannot deposit a negative amount.");
        }
        balance += amount;
        System.out.println("Deposit successful.");
    }

    public void withdraw(double amount) throws LowBalanceException, NegativeNumberException {
        if (amount < 0) {
            throw new NegativeNumberException("Cannot withdraw a negative amount.");
        }
        if (amount > balance) {
            throw new LowBalanceException("Insufficient funds. Available balance: $" + balance);
        }
        balance -= amount;
        System.out.println("Withdrawal successful.");
    }
}

public class BankApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount(500.00); // Starting with $500

        boolean running = true;

        while (running) {
            System.out.println("\n--- Bank Menu ---");
            System.out.println("1. Balance Enquiry");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");

            int choice = scanner.nextInt();

            try {
                switch (choice) {
                    case 1:
                        account.balanceEnquiry();
                        break;
                    case 2:
                        System.out.print("Enter deposit amount: ");
                        double depositAmount = scanner.nextDouble();
                        account.deposit(depositAmount);
                        break;
                    case 3:
                        System.out.print("Enter withdrawal amount: ");
                        double withdrawAmount = scanner.nextDouble();
                        account.withdraw(withdrawAmount);
                        break;
                    case 4:
                        running = false;
                        System.out.println("Thank you for using the Bank App!");
                        break;
                    default:
                        System.out.println("Invalid option. Please choose 1-4.");
                }
            } catch (LowBalanceException | NegativeNumberException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        scanner.close();
    }
}
