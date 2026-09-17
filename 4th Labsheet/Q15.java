public class Q15 {

    double principal;
    double rate;
    double time;
    static String bank = "ABC Bank";

    Q15(double p, double r, double t) {
        principal = p;
        rate = r;
        time = t;
    }

    void calculateInterest() {
        double interest = (principal * rate * time) / 100;

        System.out.println("Bank: " + bank);
        System.out.println("Principal: " + principal);
        System.out.println("Rate: " + rate);
        System.out.println("Time: " + time);
        System.out.println("Simple Interest: " + interest);
    }

    public static void main(String[] args) {

        double p = 10000;
        double r = 5;
        double t = 2;

        Q15 s = new Q15(p, r, t);
        s.calculateInterest();
    }
}