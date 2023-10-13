public class bitwise1 {
    public static int shifts(int n, int i) {
        return n << i;

    }

    public static boolean oddoreven(int n) {
        if ((n & 1) == 0) {
            return true;
        }
        return false;
    }

    public static int getithbit(int n, int i) {
        int bitmask = 1 << i;
        if ((n & bitmask) != 0) {
            return 1;
        }
        return 0;
    }

    public static int setbitscount(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static void main(String arggs[]) {
        // System.out.println(shifts(10, 2));
        // System.out.println(oddoreven(8));
        System.out.println(setbitscount(15));

    }

}
