import java.util.*;

public class _2darrays {
    public static void print2d(int matrix[][]) {
        // output ........giving output while travelling row wise..
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // searching a key from a matrix....
    public static boolean search(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("found at (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        return false;
    }

    public static void large_small(int matrix[][]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }
        System.out.println("Maximum is:" + max + "  minimum is:" + min);
    }

    public static void spiral(int matrix[][]) {
        int sr = 0;
        int sc = 0;
        int er = matrix.length - 1;
        int ec = matrix[0].length - 1;
        while (sr <= er && sc <= ec) {
            // top
            for (int j = sc; j <= ec; j++) {
                System.out.print(matrix[sr][j]);
            }
            // right
            for (int i = sr + 1; i <= er; i++) {
                System.out.print(matrix[i][ec]);
            }
            // bottom
            for (int i = ec - 1; i >= sc; i--) {
                if (ec == sc) {
                    return;
                }
                System.out.print(matrix[er][i]);
            }
            // lefts
            for (int i = er - 1; i >= sr + 1; i--) {
                if (sr == er) {
                    return;
                }
                System.out.print(matrix[i][sc]);
            }
            sr++;
            sc++;
            er--;
            ec--;
        }
    }

    public static int diagonal_sum(int matrix[][]) {
        int sum = 0;
        // brute force method - Time complexity = O(n^2)
        // for (int i = 0; i < matrix.length; i++) {
        // for (int j = 0; j < matrix[0].length; j++) {
        // if (i == j) { // primary diagonal
        // sum += matrix[i][j];
        // } else if (i + j == matrix.length - 1) { // secondary diagonal
        // sum += matrix[i][j];
        // }
        // }
        // }

        // optimised method -Time complexity= O(n)
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i]; // primary diagonal
            if (i != matrix.length - i - 1) { // secondary diagonal and taking care of the overlapping element by
                                              // getting the equation in 2 variables only i.e i and n
                sum += matrix[i][matrix.length - i - 1];
            }
        }
        return sum;
    }

    public static void sortedsrch_2d(int matrix[][], int key) { // stair case method.

        int i = 0;
        int j = matrix[0].length - 1;
        while (i >= j || i < j) // (row<matrix.lenght && col>=0) {
            if (key == matrix[i][j]) {
                System.out.println("found at: (" + i + "," + j + ")");
                return;
            } else if (key > matrix[i][j]) {
                i++;
            } else if (key < matrix[i][j]) {
                j--;
            } else {
                System.out.println("Not found");
            }
    }

    public static void transpose(int matrix[][]) {
        int row = matrix.length;
        int col = matrix[0].length;
        int tmatrix[][] = new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                tmatrix[j][i] = matrix[i][j];
            }
        }
        print2d(tmatrix);

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // syntax for 2D array
        // data_type name[][]=new data_type [row][column]

        // creating a 2D array
        int matrix[][] = new int[4][4];

        // input ........... taken as row wise...
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        search(matrix, 7);
        large_small(matrix);
        spiral(matrix);
        System.out.println("........" + diagonal_sum(matrix) + "--------");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        // sortedsrch_2d(matrix, 29);
        transpose(matrix);
    }

}
