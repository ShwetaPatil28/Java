import java.util.Scanner;

class DivisionException extends Exception {
    public DivisionException(String message) {
        super(message);
    }
}

  
class Calculator {
    public int divide(int a, int b) throws DivisionException {
        if (b == 0) {
            throw new DivisionException("Error: Division by zero is not allowed.");
        }
        return a / b;
    }
}

 public class ExceptionHandlingDemoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.print("Enter numerator: ");
        int a = scanner.nextInt();

        System.out.print("Enter denominator: ");
        int b = scanner.nextInt();

        try {
            int result = calculator.divide(a, b);
            System.out.println("Result: " + result);
        } catch (DivisionException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        scanner.close();
    }
}
