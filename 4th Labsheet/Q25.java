public class Q25 {

    static int totalCalls = 0;

    void calculateFactorial() {
        int num = 5;
        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }

        totalCalls++;

        System.out.println("Number: " + num);
        System.out.println("Factorial: " + factorial);
        System.out.println("Total Calls: " + totalCalls);
    }

    public static void main(String[] args) {

        Q25 f = new Q25();
        f.calculateFactorial();
    }
}