public class Q13 {

    double celsius;
    static String scale = "Celsius";

    Q13(double c) {
        celsius = c;
    }

    void convert() {
        double fahrenheit = (celsius * 9 / 5) + 32;
        double kelvin = celsius + 273.15;

        System.out.println("Scale: " + scale);
        System.out.println("Celsius: " + celsius);
        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Kelvin: " + kelvin);
    }

    public static void main(String[] args) {

        double c = 25;

        Q13 t = new Q13(c);
        t.convert();
    }
}