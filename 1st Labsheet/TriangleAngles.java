import java.util.Scanner;

class TriangleAngles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first angle: ");
        int a = sc.nextInt();

        System.out.println("Enter second angle: ");
        int b = sc.nextInt();

        System.out.println("Enter third angle: ");
        int c = sc.nextInt();

        if (a > 0 && b > 0 && c > 0 && a + b + c == 180) {
            System.out.println("The angles can form a valid triangle.");
        } else {
            System.out.println("The angles cannot form a valid triangle.");
        }

        sc.close();
    }
}