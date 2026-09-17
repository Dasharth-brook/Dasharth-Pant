public class Q18 {

    int units;
    static double fixedCharge = 100;

    Q18(int u) {
        units = u;
    }

    void calculateBill() {
        double rate = 5;
        double unitCharge = units * rate;
        double totalBill = unitCharge + fixedCharge;

        System.out.println("Units: " + units);
        System.out.println("Fixed Charge: ₹" + fixedCharge);
        System.out.println("Unit Charge: ₹" + unitCharge);
        System.out.println("Total Bill: ₹" + totalBill);
    }

    public static void main(String[] args) {

        int u = 150;

        Q18 e = new Q18(u);
        e.calculateBill();
    }
}