import java.util.*;

class fact {
    public static void main(String[] args) {
        int factorial = 1;
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of " + num + " is " + factorial);

    }
}