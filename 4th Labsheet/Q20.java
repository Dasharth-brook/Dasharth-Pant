public class Q20 {

    double balance;
    static String bankCode = "ABC123";

    Q20(double b) {
        balance = b;
    }

    void withdraw() {
        double amount = 5000;
        boolean allowed = amount <= balance;

        System.out.println("Bank Code: " + bankCode);
        System.out.println("Balance: ₹" + balance);
        System.out.println("Withdrawal Amount: ₹" + amount);

        if (allowed) {
            balance = balance - amount;
            System.out.println("Withdrawal Successful");
            System.out.println("Remaining Balance: ₹" + balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public static void main(String[] args) {

        double b = 10000;

        Q20 account = new Q20(b);
        account.withdraw();
    }
}