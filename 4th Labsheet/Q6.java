public class Q6 {

    String brand;
    double mileage;
    static int wheels = 4;

    Q6(String b, double m) {
        brand = b;
        mileage = m;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Mileage: " + mileage + " km/l");
        System.out.println("Wheels: " + wheels);
    }

    public static void main(String[] args) {

        String b = "Toyota";
        double m = 18.5;

        Q6 c = new Q6(b, m);
        c.display();
    }
}
