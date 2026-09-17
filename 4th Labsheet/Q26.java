public class Q26 {

    int[][] matrix;
    static String matrixType = "2x2 Matrix";

    Q26(int[][] m) {
        matrix = m;
    }

    void addAndSubtract(Q26 m2) {

        int[][] sum = new int[2][2];
        int[][] difference = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                sum[i][j] = matrix[i][j] + m2.matrix[i][j];
                difference[i][j] = matrix[i][j] - m2.matrix[i][j];
            }
        }

        System.out.println("Matrix Type: " + matrixType);

        System.out.println("Addition:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Subtraction:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(difference[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] a = {
            {1, 2},
            {3, 4}
        };

        int[][] b = {
            {5, 6},
            {7, 8}
        };

        Q26 m1 = new Q26(a);
        Q26 m2 = new Q26(b);

        m1.addAndSubtract(m2);
    }
}