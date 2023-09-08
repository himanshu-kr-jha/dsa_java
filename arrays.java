import java.util.*;

public class arrays {

    public static void create(String dataTYPE, int size) {
        // dataTYPE arrayNAME[] = new dataTYPE[size];
        // or
        // dataTYPE arrayName = {e0,e1,e2,e3,...} ei-elements
        // String arrays[] = { "A", "B", "C" };
    }

    public static void update(int array[]) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] + 2; // it will show increment in 2 marks in real array of marks in main function.
        }
    }

    public static int linear_search(int array[], int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int binary_search(int array[], int key) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int mid = start + (end-start) / 2;
            if (array[mid] == key) {
                return mid;
            }
            if (array[mid] > key) {
                end = mid - 1;
            }
            if (array[mid] > key) {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // Defn- List of element of SAME type placed in a contigous memory location.
        // based on 0(Zero) indexing.
        // -CREATE -INPUT/OUTPUT -UPDATE
        // to find length of array -> arrayName.length
        int array[] = new int[10];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter the element " + i + ":");
            array[i] = sc.nextInt();
        }

        // OUTPUT
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }

        // UPDATE
        // arrayName[index] = new value;
        // arrayName[index] = arrayName[index] (+-*/) new value;
        array[2] = array[2] + 26;
        System.out.println(array[2]);

        // Passing arrays as arguement....
        // -it is passed by reference. (i.e reflect in main or calling funtion)
        int marks[] = { 97, 98, 96 };
        update(marks);
        // printing the marks' array after passing argument in function.
        for (int i = 0; i < marks.length; i++) {
            System.out.print("{" + marks[i] + ",");
        }
        System.out.print("}");

        // Linear search.
        // - loop for(i=0 to n)...i.e TC=O(n)
        int number[] = { 2, 4, 5, 6, 34, 51 };
        int found = linear_search(number, 5);
        if (found == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("index-" + found);
        }

        // Binary search.
        // pre-requiste -> sorted array.
        // compare mid element with key and accordingly find key.
        // TC = O(log n)
        int number_b[] = { 2, 4, 5, 6, 8, 9, 10 };
        int found_b = binary_search(number_b, 5);
        if (found_b == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("index-" + found_b);
        }
    }
}