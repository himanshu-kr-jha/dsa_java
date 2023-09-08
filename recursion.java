
public class recursion {
    // method of solving a computational problem where the solutions depends on
    // smaller instances of same problems.

    // basic requirement...
    // ........base case
    // ........work(kaam)
    // ........inner call of same function..with different values.
    public static int countSubstrs(String str, int i, int j, int n) {
        if (n == 1) {
            return 1;
        }
        if (n <= 0) {
            return 0;
        }
        int res = countSubstrs(str, i + 1, j, n - 1) + countSubstrs(str, i, j - 1, n - 1)
                - countSubstrs(str, i + 1, j - 1, n - 2);
        if (str.charAt(i) == str.charAt(j)) {
            res++;
        }
        return res;
    }

    public static void main(String args[]) {
        // Recursion.print_dec(9);
        // Recursion.print_inc(9);
        // System.out.println("\n" + Recursion.factorial(5));
        // System.out.println("\n" + Recursion.sum_of_N(5));
        // Recursion.fibonacci(5);
        // System.out.println("\n" + Recursion.fibonacci(7));
        //int data[] = { 5, 4, 5, 6, 5, 6, 5 };
        // System.out.println(Recursion.iSsorted(data, 0));
        // System.out.println(Recursion.FirstOccurrence(data, 88, 0));
        // System.out.println(Recursion.LastOccurrence(data, 5, 0));
        // System.out.println(Recursion.xTOn(5, 100));
        // System.out.println(Recursion.optimized_pow(5, 100));
        // System.out.println(Recursion.tilingProblem(4));
        // Recursion.remove_duplicates("apnacolleege", new StringBuilder(""), 0, new
        // boolean[26]);
        // System.out.println(Recursion.pairingFriends(8));
        // Recursion.binaryString(3, "", 0);
        // Recursion.all_occurence(data, 0, 5);
        // Recursion.numToWord(520);
        String str = "aabbdd";
        int n = str.length();
        System.out.println(countSubstrs(str, 0, n - 1, n));

    }

}

class Recursion {
    static void print_dec(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }
        System.out.print(n + "..");
        print_dec(n - 1);
    }

    static void print_inc(int n) {
        if (n == 1) {
            System.out.print(1 + " ");
            return;
        }
        print_inc(n - 1);
        System.out.print(n + " ");

    }

    static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        // int fac=n*factorial(n-1);
        return n * factorial(n - 1);
    }

    static int sum_of_N(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum_of_N(n - 1);
    }

    static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fib = fibonacci(n - 1) + fibonacci(n - 2);
        return fib;
    }

    static boolean iSsorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return iSsorted(arr, i + 1);
    }

    static int FirstOccurrence(int arr[], int key, int start) {
        if (start == arr.length) {
            return -1;
        }
        if (arr[start] == key) {
            return start;
        }
        return FirstOccurrence(arr, key, start + 1);
    }

    static int LastOccurrence(int arr[], int key, int start) {
        if (start == arr.length) {
            return -1;
        }
        if (arr[arr.length - 1 - start] == key) {
            return arr.length - start - 1;
        }
        return LastOccurrence(arr, key, start + 1);
    }

    static int xTOn(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * xTOn(x, n - 1);
    }

    static int optimized_pow(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int halfpower = optimized_pow(x, n / 2);
        int halfpowSq = halfpower * halfpower;
        if (n % 2 != 0) {
            halfpowSq = x * halfpowSq;
        }
        return halfpowSq;
    }

    static int tilingProblem(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fn1 = tilingProblem(n - 1);
        int fn2 = tilingProblem(n - 2);
        return fn1 + fn2;
    }

    static void remove_duplicates(String str, StringBuilder newstr, int idx, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newstr);
            return;
        }
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) { // checking if letters are repeated or not ,
            // in mapping array. (currChar - 'a') is giving information about character at
            // that index
            // if true then, that character is not appended in string Builder
            remove_duplicates(str, newstr, idx + 1, map);
        } else { // if false or othercases, then that character is appended in string in String
                 // builder and in map its being updated that for that charc its true.
            map[currChar - 'a'] = true;
            remove_duplicates(str, newstr.append(currChar), idx + 1, map);
        }
    }

    // friends pairing problem
    static int pairingFriends(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        return pairingFriends(n - 1) + (n - 1) * pairingFriends(n - 2);
    }

    // binarystring problem
    static void binaryString(int n, String str, int lastplace) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        binaryString(n - 1, str + "0", 0);
        if (lastplace == 0) {
            binaryString(n - 1, str + "1", 1);
        }
    }

    static void all_occurence(int arr[], int i, int key) {
        if (i == arr.length) {
            return;
        }
        if (arr[i] == key) {
            System.out.println(i + " ");
        }
        all_occurence(arr, i + 1, key);
    }

    static void numToWord(int n) {
        String word[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        if (n == 0) {
            return;
        }
        int digits = n % 10;
        numToWord(n / 10);
        System.out.print(" " + word[digits]);

    }
}
