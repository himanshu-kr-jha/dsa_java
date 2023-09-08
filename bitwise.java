public class bitwise {
    public static void odd_even(int num) { // least significant bit (LSB) is 1 in every odd number.
        if ((num & 1) == 1) { // used AND operator with 1 to get LSB as 1.
            System.out.println("Odd number");
        } else {
            System.out.println("Even");
        }
    }

    public static int get_ith_bit(int num, int i) {
        if ((num & (1 << i)) != 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int set_ith_bit(int num, int i) {
        return (num | 1 << i);
    }

    public static int clear_ith_bit(int num, int i) {
        return (num & ~(1 << i));
    }

    public static int update_ith_bit(int n, int i, int nb) {
        // if (nb == 0) {
        // return clear_ith_bit(n, i);
        // } else {
        // return set_ith_bit(n, i);
        // }
        n = clear_ith_bit(n, i);
        int bitmask = nb << i;
        return (n | bitmask);
    }

    public static int clear_i_lastbits(int n, int i) {
        return (n & (~0) << i);
    }

    public static int clear_range_of_bits(int n, int i, int j) {
        int bitmask = (((~0) << j + 1) | (1 << i) - 1);
        return (n & bitmask);
    }

    public static boolean isPower_of2(int n) {
        return ((n & (n - 1)) == 0);
    }

    public static int count_set_bits(int num) {
        int count = 0;
        while (num > 0) {
            if ((num & 1) != 0) {
                count++;
            }
            num = num >> 1;
        }
        return count;
    }

    public static int fastexpo(int a, int n) {
        int ans = 1;
        while (a > 0) {
            if ((n & 1) != 0) {
                ans = a * ans;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }

    public static void main(String args[]) {
        System.out.println(5 & 6); // "&" - binary AND operator ... gives 1 only when both element is one.
        System.out.println(5 | 6); // "|" - binary OR operator ... gives 1 in all cases expect for "0 | 0".
        System.out.println(5 ^ 6); // "^" - binary XOR operator ... gives 1 when both element is different.
        System.out.println(~5);
        System.out.println(5 << 11);
        // System.out.println(Math.pow(3, 11));
        odd_even(5);
        // for (int i = 0; i < 100; i++) {
        // System.out.print(i + ":");
        // odd_even(i);
        // }
        // System.out.println(get_ith_bit(5, 2));
        // System.out.println(set_ith_bit(5, 1));
        // System.out.println(update_ith_bit(6, 0, 1));
        // System.out.println(clear_i_lastbits(15, 2));
        // System.out.println(clear_range_of_bits(15, 0, 2));
        // System.out.println(isPower_of2(1024));
        // System.out.println(count_set_bits(15));
        System.out.println(fastexpo(8,8));

    }
}
