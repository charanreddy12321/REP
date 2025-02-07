package Divisibility;

public class DivisibilityThreads {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 10}; // Predefined input values

        for (int num : numbers) {
            System.out.println("Factorial of " + num + " is: " + factorial(num));
        }
    }

    public static long factorial(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
