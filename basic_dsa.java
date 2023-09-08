import java.util.*;

public class basic_dsa {
    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }

    // for Integer ..so that as reverse poses problem and works only objects...
    public static void printarr(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }

    public static void bubblsort(int arr[]) {
        int n = arr.length; // n=5
        for (int turn = 0; turn < n - 1; turn++) { // total turns n-1 i.e (0,1,2,3)
            for (int j = 0; j < n - 1 - turn; j++) { // comparing arrays elements
                // swap
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
    }

    // rough try for hw question...
    public static void sortedarray(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            int swap = 0;
            for (int j = 0; j < arr.length - 1 - turn; j++) {

                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;

                }
                if (swap == 0) {
                    System.out.println("Sorted");
                    return;
                }

            }

        }
    }

    public static void selectionsort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minpos = i; // always getting new value after first loop run ...to get assumed index of
                            // smallest or greatest number
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minpos] > arr[j]) { // for ascending or descending ..use sign carefully...i.e asec-">" and for
                                            // desc-"<".
                    minpos = j;
                }
            }
            // swap the smallest / greatest element
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertionsort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            // finding out correct pos to insert...
            while (prev >= 0 && arr[prev] > curr) { // asec-">" and desc-"<"
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // insertion of current element
            arr[prev + 1] = curr;
        }
    }

    public static void countingsort(int arr[]) {

        // getting the largest number among the array given to get the range....
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest + 1]; // creating array of size of largest+1 number i.e from 0 to larget number
        for (int i = 0; i < arr.length; i++) { // entering the frequency of the occuring elements
            // basically 0 to range tak ek array create karenege and original array me
            // traverse karke respective index of count ko increase karenge
            count[arr[i]]++;
        }
        printarr(count);
        // sorting
        int j = 0; // initiating the first element to be placed
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i; // sorting by placing the occured element in frequency array to original array.
                j++;
                count[i]--;
            }
        }

    }

    public static void main(String args[]) {
        int arr[] = { 4, 5, 6, 8, 9 };
        Integer srtarr[] = { 1, 2, 3, 4, 5, 6 };
        int arr1[] = { 7, 8, 5, 4, 2, 1 };
        int arr2[] = { 1, 4, 1, 3, 2, 4, 3, 7 };
        // insertionsort(arr1);
        // getting sorted array
        // printarr(arr1);

        // inbuit sort - ascending
        // Arrays.sort(arr1);
        // printarr(arr1);
        countingsort(arr2);
        printarr(arr2);

        // inbuilt sort- descending .... using collection
        // import java.util.Collections
        // Arrays.sort(srtarr, Collections.reverseOrder()); // reverse work on Objects
        // ..that's why used Integer to declare
        // // variable.
        // printarr(srtarr);

        // checking for already sorted array
        // sortedarray(srtarr);
        // sortedarray(arr1);// tried for already sorted fuction wala code on non sorted
        // array.... but did not worked..
    }
}