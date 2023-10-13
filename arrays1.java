import java.util.*;

public class arrays1 {
    static Scanner sc = new Scanner(System.in);

    public static int binary_search(int marks[]) {
        int key = sc.nextInt();
        int start = 0, end = marks.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (marks[mid] == key) {
                return mid;
            }
            if (marks[mid] > key) {// left side
                end = mid - 1;
            } else {// right side
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void pairs(int array[]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                System.out.print("(" + array[i] + "," + array[j] + ")");
            }
            System.out.println();
        }
    }

    public static void triplets(int array[]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                for (int k = j + 1; k < array.length; k++)
                    if (array[i] + array[j] + array[k] == 0) {
                        System.out.println("[" + array[i] + "," + array[j] + "," + array[k] + "]");
                    }
            }
        }
    }

    public static boolean twice_num(int array[]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void subarrays(int array[]) {
        int a = array.length;
        int sums[] = new int[(a * (a + 1)) / 2];
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                int sum = 0;
                for (int k = i; k < j; k++) {
                    sum = sum + array[k];
                    System.out.print(array[k] + " ");
                    // System.out.print(" " + sum);
                }
                for (int l = 0; l <= (a * (a + 1) / 2); l++) {
                    sums[l] = sum;
                }

                System.out.println();
            }
            System.out.println();
        }
    }

    public static void rvrs(int array[]) {
        int first = 0, last = array.length - 1;
        while (first < last) {
            int temp = array[last];
            array[last] = array[first];
            array[first] = temp;
            first++;
            last--;
        }
        System.out.println("array is reversed.");

    }
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

        int marks[] = { -1, 0, 1, 2, -1, -4 };
        // int index = binary_search(marks);
        // if (index == -1) {
        // System.out.println("Not found");
        // } else {
        // System.out.println("Index of asked number is " + index);
        // }
        // for (int i = 0; i < marks.length; i++) {
        // System.out.print(marks[i] + " ");
        // }
        // rvrs(marks);
        // for (int i = 0; i <= marks.length - 1; i++) {
        // System.out.print(marks[i] + " ");
        // }
        // entry
        // for (int i = 0; i <= 5; i++) {
        // numbers[i] = sc.nextInt();
        // }
        // System.out.println("Printing th arrays.");
        // // Output
        // for (int i = 0; i <= 5; i++) {
        // System.out.println("Number " + i + " is " + numbers[i]);
        // }

        // linear search..
        // for (int i = 1; i < numbers.length; i++) {
        // if (numbers[i] == 100) {
        // System.out.println("Index of the number is: " + i);
        // } else {
        // continue;
        // }
        // }
        // to fing legth of list== list_name.length
        // pairs(marks);
        // subarrays(marks);
        // System.out.println(twice_num(marks));
        triplets(marks);

        // we can apply mathematical operations on kthe list by traversing in it
    }
}
