public class recursion1 {
    public static int friendspairing(int n){
        if (n==1||n==2){
            return n;
        }
        int fnm1=friendspairing(n-1);
        int fnm2=friendspairing(n-2);
        int pairways=(n-1)*fnm2;
        int totalways=fnm1+pairways;
        return totalways;
    }
    public static void duplicatestring(String str, int idx, StringBuilder sb,boolean map[]){
        //base
        if(idx==str.length()){
            System.out.println(sb);
            return;
        }
        char currchar=str.charAt(idx);
        if(map[currchar-'a']==true){
            //duplicate
            duplicatestring(str, idx+1, sb, map);
        }else{
            map[currchar-'a']=true;
            duplicatestring(str, idx+1, sb.append(currchar), map);
        }
    }
    public static int fac(int n) {
        if (n == 0) {
            return 1;
        }
        int facn1 = fac(n - 1);
        int facn = n * facn1;
        return facn;
    }

    public static void printInc(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printInc(n - 1);
        System.out.print(n + " ");
    }

    public static void printDec(int n) {
        if (n == 1) {
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n - 1);
    }

    public static void main(String args[]) {
        int n = 5;
        printDec(n);
        // System.out.println();
        // printInc(n);
        //System.out.println(fac(n));
        //String str="aabbcccdddeeefffghijklmnoppqqqrrssttuuuvvvwwwxxxyyyzzz";
        //duplicatestring(str, 5, new StringBuilder(""),new boolean[26]);
        //System.out.println('z'-'a'); 
        // System.out.println(friendspairing(100));

    }
}
