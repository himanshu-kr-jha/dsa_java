import java.util.ArrayList;
import java.util.Collections;

public class arraylist {
    public static void intro_arraylist() {

        // Syantax => ArrayList<Data_type> variable_name = new ArrayList<>();

        // similar as vectors in c++
        // it is related to Java collection framework

        ArrayList<Integer> list = new ArrayList<>();

        // operations
        // ->add ->get ->remove ->set element at index ->contains element

        // add-> list.add(element) add element at the end of the list - O(1)

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        // we can also add particular index at particular index by using
        // add(index,element) Time complexity - O(n)

        list.add(3, 15);
        System.out.println(list);

        // get(index) -> get the element at the given index - O(1)

        int element = list.get(3);
        System.out.println(element);

        // remove(index) -> Removes element from the given index. Time complexity - O(n)

        list.remove(1);
        System.out.println(list);

        // set element at index .set(index,element) -> add element at given index. Time
        // complexity - O(n)

        list.set(2, 10);
        System.out.println(list);

        // contains(element) -> return true or false depending on whether element exists
        // in the list or not. Time complexity - O(n)

        System.out.println(list.contains(5));
        System.out.println(list.contains(1));

        // size of array list -> gives size of the array list

        System.out.println(list.size()); // in array .length was property, but .size() is method/function.
        printArrayList(list);
        System.out.println();

        // sorting in arraylist -> it can be done by using collections class
        // syntax-> Collections.sort(Arraylist_name) ---> ascending order (by default)
        // ** point to be noted: Collections-> class
        // Collectioin -> interface

        // descending order ->
        // Collections.sort(arraylist_name,Collections.reverseOrder());
        // comparator - fuction that defines logic about how sorting should be done
        // actually.

        System.out.println("Original list" + list);
        Collections.sort(list);
        System.out.println("In ascending order:" + list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("In descending order:" + list);

        // multi dimensional arraylist -> defined as arraylist containing arraylist
        // syntax-> ArrayList <ArrayList<Data_structure> > list_name = new
        // ArrayList<>();
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        multi_dimensional_array(mainlist);

    }

    public static ArrayList<Integer> create(int interval) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 5; i++) {
            list.add(i + interval);
        }
        return list;

    }

    public static void printArrayList(ArrayList<Integer> list) { // implementation of .size()
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    public static void multi_dimensional_array(ArrayList<ArrayList<Integer>> mainlist) {
        // storing data in multi_dimensional arraylist
        ArrayList<Integer> list1 = create(1); // getting values in arraylist from user-defined function
        ArrayList<Integer> list2 = create(2);
        ArrayList<Integer> list3 = create(3);
        mainlist.add(list1);
        mainlist.add(list2);
        mainlist.add(list3);

        // traversing in multi dimensional arraylists
        for (int i = 0; i < mainlist.size(); i++) {
            ArrayList<Integer> currlist = mainlist.get(i);
            for (int j = 0; j < currlist.size(); j++) {
                System.out.print(currlist.get(j) + " ");
            }
            System.out.println();
        }
        System.out.println(mainlist);
    }

    public static void main(String args[]) {
        // intro_arraylist();
        // ArrayList <ArrayList <Integer> > mainlist =new ArrayList<>();
        // multi_dimensional_array(mainlist);
        // ArrayList <Integer> list = new ArrayList<>();
        // for(int i=0;i<5;i++){
        // list.add(i+1);
        // }
        // list.add(51);
        // System.out.println("List before reversing "+list);
        // question_arraylist.reverse_arraylist(list);
        // System.out.println("List after reversing: "+list);

        // System.out.println("Maximum element is: "+
        // question_arraylist.max_element(list));
        // System.out.println(list);
        // question_arraylist.swapinAL(list, 1, 5);
        // System.out.println(list);
        ArrayList<Integer> height = new ArrayList<>();
        // height.add(1);
        // height.add(8);
        // height.add(6);
        // height.add(2);
        // height.add(5);
        // height.add(4);
        // height.add(8);
        // height.add(3);
        // height.add(7);
        // question_arraylist.container_with_most_water_2pointer(height);
        // System.out.println(mostwater);
        // System.out.println(question_arraylist.pair_sum_1_opt(height, 4));
        height.add(11);
        height.add(15);
        height.add(6);
        height.add(8);
        height.add(9);
        height.add(10);
        System.out.println(question_arraylist.pair_sum2_opt(height, 19));
    }

    public class question_arraylist {
        public static void reverse_arraylist(ArrayList<Integer> list) {
            for (int i = list.size() - 1; i >= 0; i--) {
                System.out.print(list.get(i) + " ");
            }
            // int size=list.size();
            // for(int i=0;i<size;i++){
            // list.set(size-1-i,list.get(i));
            // }
        }

        public static int max_element(ArrayList<Integer> list) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) > max) {
                    max = list.get(i);
                }
            }
            return max;
        }

        public static void swapinAL(ArrayList<Integer> list, int idx1, int idx2) {
            int temp = list.get(idx1);
            list.set(idx1, list.get(idx2));
            list.set(idx2, temp);
        }

        public static int container_with_most_water(ArrayList<Integer> height) {
            int max = 0;
            for (int i = 0; i < height.size(); i++) {
                for (int j = i + 1; j < height.size(); j++) {
                    int hgt = Math.min(height.get(i), height.get(j));
                    int wdth = j - i;
                    int vol = hgt * wdth;
                    if (vol > max) {
                        max = vol;
                    }
                }
            }
            return max;
        }

        public static int container_with_most_water_2pointer(ArrayList<Integer> height) {
            int max = 0;
            int lpt = 0, rpt = height.size() - 1;
            while (lpt < rpt) {
                int hgt = Math.min(height.get(lpt), height.get(rpt));
                int wdt = rpt - lpt;
                int vol = hgt * wdt;
                if (vol > max) {
                    max = vol;
                }
                if (height.get(lpt) < height.get(rpt)) {
                    lpt++;
                } else {
                    rpt--;
                }

            }
            return max;
        }

        // find if any pair in a sorted ArrayList has target sum.
        public static boolean pair_sum_1(ArrayList<Integer> list, int target) { // time complexity - O(n^2)
            // brute force

            for (int i = 0; i < list.size(); i++) {
                for (int j = i + 1; j < list.size(); j++) {
                    if (list.get(i) + list.get(j) == target) {
                        return true;
                    }
                }
            }
            return false;
        }

        public static boolean pair_sum_1_opt(ArrayList<Integer> list, int target) { // Time complexity -O(n)
            // for sorted arraylist
            int lpt = 0, rpt = list.size() - 1;
            while (lpt != rpt) {
                if (list.get(lpt) + list.get(rpt) == target) {
                    return true;
                } else if (list.get(lpt) + list.get(rpt) > target) {
                    rpt--;
                } else {
                    lpt++;
                }
            }
            return false;
        }

        // find if any pair in a sorted and rotated ArrayList has target sum.
        // eg [11,15,6,8,9,10]
        // in this we have to find the pivot point ,i.e from where arraylist is rotated
        // this point help us to findt starting of left and right pointer....i.e left
        // for smallest value and right for largest value.
        // thereafter , we will use mod arithemetic
        // for this case lpt=(lpt+1)%n and rpt= (n+rpt-1)%n
        public static boolean pair_sum2_opt(ArrayList<Integer> list, int target) {
            int bp = -1;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) > list.get(i + 1)) {
                    bp = i;
                    break;
                }
            }
            int lpt = bp + 1;
            int rpt = bp;
            while (lpt != rpt) {
                if (list.get(lpt) + list.get(rpt) == target) {
                    return true;
                } else if (list.get(lpt) + list.get(rpt) < target) {
                    lpt = (lpt + 1) % list.size(); // this is lpt++ for sorted and rotated arraylist
                } else {
                    rpt = (list.size() + rpt - 1) % list.size(); // this is rpt-- for sorted and rotated arraylist
                }
            }
            return false;

        }
    }
}