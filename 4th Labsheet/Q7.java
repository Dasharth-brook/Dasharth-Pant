public class Q7 {

    String accountNumber;
    double balance;
    static String bankName = "ABC Bank";

    Q7(String a, double b) {
        accountNumber = a;
        balance = b;
    }

    void deposit() {
        double amount = 5000;
        balance = balance + amount;

        System.out.println("Bank: " + bankName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Deposited Amount: " + amount);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {

        String a = "ACC101";
        double b = 10000;

        Q7 account = new Q7(a, b);
        account.deposit();
    }
}