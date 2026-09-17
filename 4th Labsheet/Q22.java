public class Q22 {

    static int totalChecks = 0;

    void checkArmstrong() {
        int num = 153;
        int original = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum = sum + digit * digit * digit;
            num = num / 10;
        }

        totalChecks++;

        System.out.println("Number: " + original);

        if (original == sum) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }

        System.out.println("Total Checks: " + totalChecks);
    }

    public static void main(String[] args) {

        Q22 a = new Q22();
        a.checkArmstrong();
    }
}