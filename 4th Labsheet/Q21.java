public class Q21 {

    static int countChecks = 0;

    void checkPalindrome() {
        int num = 121;
        int original = num;
        int reverse = 0;

        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        countChecks++;

        if (original == reverse) {
            System.out.println("Number: " + original);
            System.out.println("Palindrome");
        } else {
            System.out.println("Number: " + original);
            System.out.println("Not Palindrome");
        }

        System.out.println("Total Checks: " + countChecks);
    }

    public static void main(String[] args) {

        Q21 p = new Q21();
        p.checkPalindrome();
    }
}