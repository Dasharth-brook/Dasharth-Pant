public class Q23 {

    static int totalPrimeChecks = 0;

    void checkPrime() {
        int num = 17;
        boolean prime = true;

        if (num <= 1) {
            prime = false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }
        }

        totalPrimeChecks++;

        System.out.println("Number: " + num);

        if (prime) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not Prime Number");
        }

        System.out.println("Total Prime Checks: " + totalPrimeChecks);
    }

    public static void main(String[] args) {

        Q23 p = new Q23();
        p.checkPrime();
    }
}