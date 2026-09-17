import java.util.Scanner;

class FloatToInteger {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a floating-point number: ");
        float num = sc.nextFloat();

        int converted = (int) num;

        System.out.println("Original value: " + num);
        System.out.println("Converted integer value: " + converted);

        sc.close();
    }
}