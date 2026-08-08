import java.util.Scanner;

public class PalindromeChecker {

    static boolean isPalindromeIterative(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    static boolean recursive(String s, int left, int right) {
        if (left >= right)
            return true;

        if (s.charAt(left) != s.charAt(right))
            return false;

        return recursive(s, left + 1, right - 1);
    }

    static boolean isPalindromeRecursive(String s) {
        return recursive(s, 0, s.length() - 1);
    }

    static boolean isPalindromeArrayReversal(String s) {
        char[] arr = s.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        return s.equals(new String(arr));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.next();

        System.out.println("Iterative: " + isPalindromeIterative(text));
        System.out.println("Recursive: " + isPalindromeRecursive(text));
        System.out.println("Array Reversal: " + isPalindromeArrayReversal(text));

        sc.close();
    }
}