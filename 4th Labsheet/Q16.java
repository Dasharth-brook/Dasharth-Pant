public class Q16 {

    double a;
    double b;
    double c;
    static String type = "Scalene/Isosceles/Equilateral";

    Q16(double x, double y, double z) {
        a = x;
        b = y;
        c = z;
    }

    void checkTriangle() {
        boolean valid = (a + b > c) && (a + c > b) && (b + c > a);

        System.out.println("Triangle Type: " + type);
        System.out.println("Sides: " + a + ", " + b + ", " + c);

        if (valid) {
            System.out.println("Valid Triangle");
        } else {
            System.out.println("Invalid Triangle");
        }
    }

    public static void main(String[] args) {

        double a = 5;
        double b = 6;
        double c = 7;

        Q16 t = new Q16(a, b, c);
        t.checkTriangle();
    }
}