import java.util.Scanner;

class StudentMarks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks of Subject 1: ");
        int m1 = sc.nextInt();

        System.out.println("Enter marks of Subject 2: ");
        int m2 = sc.nextInt();

        System.out.println("Enter marks of Subject 3: ");
        int m3 = sc.nextInt();

        int total = m1 + m2 + m3;
        double percentage = total / 3.0;

        System.out.println("Total marks = " + total);
        System.out.println("Percentage = " + percentage + "%");

        if(m1 >= 40 && m2 >= 40 && m3 >= 40)
        {
            System.out.println("Result = Pass");
        }
        else
        {
            System.out.println("Result = Fail");
        }
    }
}