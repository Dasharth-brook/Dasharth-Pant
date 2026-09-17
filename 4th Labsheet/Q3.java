public class Q3 {

    double radius;
    static double PI = 3.14;

    Q3(double r) {
        radius = r;
    }

    void calculate() {
        double area = PI * radius * radius;
        double circumference = 2 * PI * radius;

        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }

    public static void main(String[] args) {

        double r = 7;

        Q3 c = new Q3(r);
        c.calculate();
    }
}