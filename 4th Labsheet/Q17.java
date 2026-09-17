public class Q17 {

    String name;
    int marks;
    static int passingMarks = 40;

    Q17(String n, int m) {
        name = n;
        marks = m;
    }

    void assignGrade() {
        char grade;

        if (marks < passingMarks) {
            grade = 'F';
        } else if (marks >= 80) {
            grade = 'A';
        } else if (marks >= 60) {
            grade = 'B';
        } else {
            grade = 'C';
        }

        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Passing Marks: " + passingMarks);
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {

        String n = "Rahul";
        int m = 85;

        Q17 s = new Q17(n, m);
        s.assignGrade();
    }
}