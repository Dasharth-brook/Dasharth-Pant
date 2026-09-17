import java.util.Scanner;

class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.println("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.println("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);

        if (op == '+') {
            System.out.println("Result = " + (num1 + num2));
        }
        else if (op == '-') {
            System.out.println("Result = " + (num1 - num2));
        }
        else if (op == '*') {
            System.out.println("Result = " + (num1 * num2));
        }
        else if (op == '/') {
            if (num2 != 0) {
                System.out.println("Result = " + (num1 / num2));
            } else {
                System.out.println("Cannot divide by zero.");
            }
        }
        else {
            System.out.println("Invalid operator.");
        }

        sc.close();
    }
}