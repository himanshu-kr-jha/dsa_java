public class backtracking {
    static int count = 0;

    public static void changeArr(int arr[], int i, int val) {
        // base case
        if (i == arr.length) {
            printArr(arr);
            return;
        }
        // recursion
        arr[i] = val;
        changeArr(arr, i + 1, val + 1);
        arr[i] -= 2;

    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void findSubsets(String str, String ans, int i) {
        if (i == str.length()) {
            System.out.println(ans);
            return;
        }
        // yes choice
        findSubsets(str, ans + str.charAt(i), i + 1);
        // no choice
        findSubsets(str, ans, i + 1);
    }

    public static void findPermutation(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String newstr = str.substring(0, i) + str.substring(i + 1);
            findPermutation(newstr, ans + curr);
        }
    }

    public static int gridways(int i, int j, int n, int m) {
        if (i == n - 1 && j == m - 1) {
            return 1;
        } else if (i == n || j == n) {
            return 0;
        }
        int ways = gridways(i + 1, j, n, m) + gridways(i, j + 1, n, m);
        return ways;
    }

    public static void main(String args[]) {
        // int arr[] = new int[5];
        // changeArr(arr, 0, 1);
        // printArr(arr);

        // String str = "abc";
        // findSubsets(str, "", 0);
        // findPermutation(str, "");
        // made chess board of nxn and initialized it with empty cell
        int n = 5;
        char chessboard[][] = new char[n][n];
        // initialize
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                chessboard[i][j] = 'x';
            }
        }
        if (Nqueens.Nqueen_oneSolution(chessboard, 0)) {
            Nqueens.printchessbrd(chessboard);
        }
        Nqueens.mainNqueen(5);
        System.out.println();
        System.out.println(gridways(0, 0, n, n));
        int[][] sudoku = {
                { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 2, 0, 0 },
                { 0, 0, 0, 0, 3, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 4, 0 },
                { 0, 0, 0, 0, 0, 5, 0, 0, 0 },
                { 0, 0, 6, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 7 },
                { 0, 0, 0, 8, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 9, 0, 0 }
        };

        if (sudokuSolver.sudokuSolving(sudoku, 0, 0)) {
            System.out.println("------Sudoku solved------");
            sudokuSolver.printSudoku(sudoku);
        } else {
            System.out.println("Not solvable");
        }

    }

    public class Nqueens {
        public static boolean isSafe(char board[][], int row, int col) {
            // vertical check
            for (int i = row - 1; i >= 0; i--) {
                if (board[i][col] == 'Q') {
                    return false;
                }
            }

            // left diagonal check
            for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
                if (board[i][j] == 'Q') {
                    return false;
                }
            }

            // right diagonal check
            for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
                if (board[i][j] == 'Q') {
                    return false;
                }
            }
            return true;
        }

        public static void Nqueen(char board[][], int row) {
            // this function is about placing N queens in N rows
            if (row == board.length) {
                System.out.println("-------Chess board-------");
                count++;
                printchessbrd(board);
                return;
            }
            // column loop
            // by applying a condition ton check whether is it safe to place the queen in
            // that cell will give solution to our problem for p
            // placing N queens in N rows such that no 2 queens attack each other
            for (int j = 0; j < board.length; j++) {
                if (isSafe(board, row, j) == true) {
                    board[row][j] = 'Q'; // places queen while travelling through each column
                    Nqueen(board, row + 1);// calling for next rows
                    board[row][j] = 'x'; // while backtracking we will make the cell empty
                }
            }
        }

        public static void printchessbrd(char board[][]) {
            for (int i = 0; i < board.length; i++) {

                for (int j = 0; j < board.length; j++) {
                    System.out.print(board[i][j]);
                }
                System.out.println();
            }
        }

        public static void mainNqueen(int n) { // to get all solution and count number of ways
            char chessboard[][] = new char[n][n];
            // initialize
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    chessboard[i][j] = 'x';
                }
            }
            Nqueen(chessboard, 0);
            System.out.print(count);
        }

        public static boolean Nqueen_oneSolution(char board[][], int row) { // changed the function to boolean type
            if (row == board.length) {
                return true;
            }
            // column loop
            // by applying a condition ton check whether is it safe to place the queen in
            // that cell will give solution to our problem for p
            // placing N queens in N rows such that no 2 queens attack each other
            for (int j = 0; j < board.length; j++) {
                if (isSafe(board, row, j) == true) {
                    board[row][j] = 'Q'; // places queen while travelling through each column
                    if (Nqueen_oneSolution(board, row + 1)) { // calling for next rows
                        return true;
                    }
                    board[row][j] = 'x'; // while backtracking we will make the cell empty

                }
            }
            return false;
        }
    }

    public class sudokuSolver {
        public static void printSudoku(int sudoku[][]) {
            for (int i = 0; i < sudoku.length; i++) {
                for (int j = 0; j < sudoku.length; j++) {
                    System.out.print(sudoku[i][j] + " ");
                }
                System.out.println();
            }
        }

        public static boolean sudokuSolving(int sudoku[][], int row, int col) {
            if (row == 9) {
                return true;
            }
            int nextrow = row, nextcol = col + 1;
            if (col + 1 == 9) {
                nextrow = row + 1;
                nextcol = 0;
            }
            if (sudoku[row][col] != 0) {
                return sudokuSolving(sudoku, nextrow, nextcol);
            }
            for (int digit = 1; digit <= 9; digit++) {
                if (isSafeMove(sudoku, row, col, digit)) {
                    sudoku[row][col] = digit;
                    if (sudokuSolving(sudoku, nextrow, nextcol)) {// solution exists
                        return true;
                    }
                    sudoku[row][col] = 0;
                }
            }
            return false;
        }

        public static boolean isSafeMove(int sudoku[][], int row, int col, int digit) {
            // vertical check
            for (int i = 0; i <= 8; i++) {
                if (sudoku[row][i] == digit) {
                    return false;
                }
            }
            // horizontal check
            for (int j = 0; j <= 8; j++) {
                if (sudoku[j][col] == digit) {
                    return false;
                }
            }
            // grid check
            int sr = (row / 3) * 3;
            int sc = (col / 3) * 3;
            for (int i = sr; i < sr + 3; i++) {
                for (int j = sc; j < sc + 3; j++) {
                    if (sudoku[i][j] == digit) {
                        return false;
                    }
                }
            }
            return true;
        }
    }

    // public class mazesolver {
    // public static void maze(int maze[][],int sr,int sc, int dr, int dc){
    // //base case
    // //moves
    // if(isMoveUp(maze,)){

    // }
    // }
    // }
}
