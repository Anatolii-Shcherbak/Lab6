public class task3 {
    public static void main(String[] args) {
        int n = 5;
        long result = calculateFactorial(n);
        System.out.println("Factorial of " + n + " is: " + result);
    }

    public static long calculateFactorial(int n) {
        if (n < 2) {
            return 1;
        } else {
            return calculateFactorial(n - 1) * n;
        }
    }

}
