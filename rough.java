public class rough {
    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("transfer disk " + n + "from " + src + " to " + dest);
            return;
        }
        // transfer top n-1 from src to helper using dest as 'helper'
        towerOfHanoi(n - 1, src, dest, helper);
        // transfer nth from src to dest
        System.out.println("transfer disk " + n + "from " + src + " to " + dest);
        // transfer n-1 from helper to dest using src as 'helper'
        towerOfHanoi(n - 1, helper, src, dest);
    }

    public static void reverse(int arr[], int size) {
        for (int i = 0; i < size / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[size - i - 1];
            arr[size - i - 1] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    // public static void printArray(int arr[]) {

    // }

    public static void main(String args[]) {
        // // swap by new method
        // int a = 10;
        // int b = 30;
        // a = a + b - (b = a);
        // System.out.println(a);
        // System.out.println(b);
        // towerOfHanoi(5, "A", "B", "C");
        int list[] = { 1, 2, 3, 4, 5 };
        reverse(list, 0);
        // printArray(list);
    }
}