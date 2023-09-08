import java.util.*;

public class strings {
    public static boolean palindrome(String str) {
        boolean palin = true;
        for (int i = 0; i <= str.length() / 2; i++) {
            if (str.charAt(i) == str.charAt(str.length() - i - 1)) {
                palin = true;
            } else {
                palin = false;
            }
        }
        return palin;
    }

    public static void shortestdist(String str) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < str.length(); i++) {
            char dir = str.charAt(i);
            if (dir == 'n') {
                y++;
            } else if (dir == 's') {
                y--;
            } else if (dir == 'e') {
                x++;
            } else if (dir == 'w') {
                x--;
            }
        }
        int dist = (int) Math.sqrt(x * y + y * y);
        System.out.println(dist);

    }

    public static String touppercase(String str) {
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        // sb.append(Character.toUpperCase(str.charAt[0]))
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static StringBuilder strcompression(String str) {
        StringBuilder newstr = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            newstr.append(str.charAt(i));
            if (count > 1) {
                newstr.append(count.toString());
            }
        }
        return newstr;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // declaring strings
        char arr[] = { 'a', 'b', 'c' };
        String str = "himanshu";
        String str1 = new String("himanshu kumar jha");

        // strings are IMMUTABLE.

        // input as string...
        String var = sc.next();

        // to find strig length- .lenght() function is used.
        // concatenation of string- two or more string can be concatenated by using "+"
        // sign
        // .charAt() - it is used to get the character at the given index.

        // finding is the string is palindrome or not.
        System.out.println(palindrome(var));
        shortestdist(var);

        // String builder - it is a mutable sequence of characters .....used instead of
        // string which is immutable
        // it is similar to Stringbuffer ...but differs in synchornization
        // The StringBuilder class provides no guarantee of synchronization whereas the
        // StringBuffer class does.
        // it is recommended that this class be used in preference to StringBuffer as it
        // will be faster under most implementations.
        // Instances of StringBuilder are not safe for use by multiple threads.
        // If such synchronization is required then it is recommended that StringBuffer
        // be used. String Builder is not thread-safe and high in performance compared
        // to String buffer.

        // ...declaring a string builder....
        // StringBuilder var_name = new StringBuilder();

        StringBuilder strbuld = new StringBuilder();

        // StringBuilder(): with no characters in it and an initial capacity of 16
        // characters.
        // StringBuilder(int capacity): " and an initial capacity specified by the
        // capacity argument.
        // StringBuilder(CharSequence seq): contains the same characters as the
        // specified CharSequence.
        // StringBuilder(String str): initialized to the contents of the specified
        // string.

        StringBuilder sb = new StringBuilder("aaaabbbbcccdddd");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
        }
        // TC- O(26) by using string builder
        // TC - O(n^2) by using string.
        System.out.println(sb);

        // sb.length(); // gives length of the string builder sb.

        // program to convert each of the first letter of each word to upper case.
        System.out.println("-----------------------");
        String str3 = "abbcccdddeeee";
        System.out.println(touppercase("my name is himanshu"));
        System.out.println(strcompression(str3));
    }

}
