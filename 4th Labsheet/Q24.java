public class Q24 {

    static int seriesCount = 0;

    void displayFibonacci() {
        int n = 8;
        int first = 0;
        int second = 1;

        System.out.println("First " + n + " Fibonacci Terms:");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }

        seriesCount++;

        System.out.println();
        System.out.println("Total Series Count: " + seriesCount);
    }

    public static void main(String[] args) {

        Q24 f = new Q24();
        f.displayFibonacci();
    }
}