import java.util.Scanner;

class CheckDivisibility
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        if(n % 3 == 0 && n % 5 == 0)
        {
            System.out.println("Number is divisible by both 3 and 5");
        }
        else
        {
            System.out.println("Number is not divisible by both 3 and 5");
        }
    }
}