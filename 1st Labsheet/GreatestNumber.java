import java.util.Scanner;

class GreatestNumber
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = sc.nextInt();

        System.out.println("Enter second number: ");
        int b = sc.nextInt();

        if(a > b)
        {
            System.out.println(a + " is the greatest");
        }
        else if(b > a)
        {
            System.out.println(b + " is the greatest");
        }
        else
        {
            System.out.println("Both numbers are equal");
        }
    }
}