import java.util.Arrays;
public class MathFunctions {
    public static void isPalindrome(Long num) {
        String numString = Long.toString(num);
        boolean palindrome;
        int middle;
        StringBuilder first;
        if ((numString.length() & 1) == 0) {
            middle = (numString.length() >>> 1);
            first = new StringBuilder(numString.substring(0, middle));
        } else {
            middle = (numString.length() + 1 >>> 1);
            first = new StringBuilder(numString.substring(0, middle - 1));
        }
        StringBuilder second = new StringBuilder(numString.substring(middle));
        second.reverse();
        palindrome = first.compareTo(second) == 0;
        if (palindrome) System.out.println(num + " is a palindrome");
        else System.out.println(num + " is not a palindrome");
    }
    private static double[] map;
    public static void printFibonacciSeries(int n) {
        map = new double[n];
        findTerm(n - 1);
        map[0] = 0.0;
        System.out.println("Fibonacci series of size " + n + " = " + Arrays.toString(map));
    }
    private static double findTerm(int n) {
        if (n == 1 || n == 2) {
            map[n] = 1.0;
            return 1.0;
        }
        if (map[n] != 0) {
            return map[n];
        } else {
            double result = findTerm(n - 1) + findTerm(n - 2);
            map[n] = result;
            return result;
        }
    }
    public static void isPrime(long num) {
        boolean flag = false;
        for (int i = 2; i <= Math.sqrt((double) num); ++i) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}
