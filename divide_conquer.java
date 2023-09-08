import java.util.*;

public class divide_conquer {
    public static void print_Int_arr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void print_str_arr(String arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void mergesort(int arr[], int si, int ei) { // Time C: O(n x logn) Space complexity:O(n)
        // ------> also known as "depth first Mergesort"
        // base case i.e one element
        if (si > ei || si == ei) {
            return;
        }
        // kaam
        int mid = si + (ei - si) / 2;
        // left side divide and sorting
        mergesort(arr, si, mid);
        // right side divide and sorting
        mergesort(arr, mid + 1, ei);
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int i = si; // iterator for left side
        int j = mid + 1; // iterator for right side
        int k = 0; // iterator for traversing in temp array
        int temp[] = new int[ei - si + 1]; // declared temp array
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i <= mid) { // for leftover elements of left side of array
            temp[k++] = arr[i++];
        }
        while (j <= ei) { // for leftover elements of right side of array
            temp[k++] = arr[j++];
        }
        for (k = 0, i = si; k < temp.length; k++, i++) { // copy from temp arr to original array
            arr[i] = temp[k];
        }

    }

    public static void quickSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        // last element
        int pIdx = partition(arr, si, ei);
        // left side of pivot
        quickSort(arr, si, pIdx - 1);
        quickSort(arr, pIdx + 1, ei);
    }

    public static int partition(int[] arr, int si, int ei) {
        int i = si - 1;
        int pivot = arr[ei];
        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i]; // pivot=arr[i] is not correct as(call by value) , we need array to be changed
        arr[i] = temp;
        return i;
    }

    public static int search_rotated_array(int arr[], int target, int si, int ei) {
        // ------> time complexity is O(log n) for rotated binary search.

        // visualise it as straight line ....
        // kaam
        int mid = si + (ei - si) / 2;
        // for which target not exists
        if (si > ei) {
            return -1;
        }
        // target is found
        if (arr[mid] == target) {
            return mid;
        }
        // mid on Line 1
        if (arr[si] <= arr[mid]) {
            // case a: left side of L1:
            if (target >= arr[si] && target <= arr[mid]) {
                return search_rotated_array(arr, target, si, mid - 1);
            }
            // case b: right side of L1:
            else {
                return search_rotated_array(arr, target, mid + 1, ei);
            }
        }
        // mid on Line 2
        else {
            // case c: right side of L2:
            if (target >= arr[mid] && target <= arr[ei]) {
                return search_rotated_array(arr, target, mid + 1, ei);
            }
            // case d: left side of L2:
            else {
                return search_rotated_array(arr, target, si, mid - 1);
            }
        }
    }

    public static void mergesort_strings(String arr[], int si, int ei) {
        if (si > ei || ei == si) {
            return;
        }
        int mid = si + (ei - si) / 2;
        mergesort_strings(arr, si, mid);
        mergesort_strings(arr, mid + 1, ei);
        merge_string(arr, si, mid, ei);
    }

    public static void merge_string(String arr[], int si, int mid, int ei) {
        String temp[] = new String[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= ei) {
            if (arr[i].compareTo(arr[j]) <= 0) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    // public static int search_rotated_array_iteration(int arr[], int target) {
    // }

    public static void main(String args[]) {
        // int arr[] = { 5, 9, 1, 7, 8, 5, 8, 6, 8, 6, 85, 4, 6, 8, 56, 8, 56, 8, 5 };
        // mergesort(arr, 0, arr.length - 1);
        // quickSort(arr, 0, arr.length - 1);
        // printarr(arr);
        // int rsArr[] = { 4, 5, 6, 1, 2 };
        // int idx = search_rotated_array(rsArr, 1, 0, rsArr.length - 1);
        // System.out.println(idx);
        String arr[] = { "apple", "arrow", "avocado", "ant" };
        // String arr[] = { "earth", "mars", "sun", "mercury" };
        mergesort_strings(arr, 0, arr.length - 1);
        print_str_arr(arr);
    }
}