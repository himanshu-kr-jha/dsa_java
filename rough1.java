// import java.math.*;
//import java.util.*;

/*
import java.util.*;
public class rough {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            String str1 = "My name is himanshu kumar jha";
            System.out.println(str1);
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a + b);
        }

    }
}


public class rough {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            // Largest of two numbers......
            /*
             * int a = sc.nextInt();
             * int b = sc.nextInt();
             * if (a > b) {
             * System.out.println(a + " is largest.");
             * } else {
             * System.out.println(b + " is the largest");
             * }
             * //is number is even or odd.....
             * int number = sc.nextInt();
             * if (number%2==0){
             * System.out.println(number+" is even.");
             * }
             * else{
             * System.out.println(number+" is odd.");
             * }
             * 
             * // Income tax calculator....
             * int income = sc.nextInt();
             * int tax;
             * if(income<500000){
             * tax=0;
             * }
             * else if(income>500000 && income<=1000000){
             * tax = (int)(income * 0.2);
             * }
             * else{
             * tax = (int)(income*0.3);
             * }
             * System.out.println("Your tax according to your income is "+tax);
             * 
             * // largest of three numbers...
             * int a = sc.nextInt();
             * int b = sc.nextInt();
             * int c = sc.nextInt();
             * if(a>=b && a>=c){
             * System.out.println(a+" is largest.");
             * }
             * else if(b>=c){
             * System.out.println(b+" is largest.");
             * }
             * else{
             * System.out.println(c+" is largest.");
             * }
             * 
             * //Ternary operator................
             * //check if a studdent is pass or fail:....
             * int marks = sc.nextInt();
             * String status = marks>=33?"Pass":"Fail";
             * System.out.println(status);
             */
// Calculator.......
/*            System.out.println("Enter number 1:");
            float num1 = sc.nextInt();
            System.out.println("Enter number 2:");
            float num2 = sc.nextInt();
            System.out.println("Enter operator +,-,*,/,%:");
            char ch = sc.next().charAt(0);
            switch (ch) {
                case '+':
                    System.out.println(num1 + num2);
                    break;
                case '-':
                    System.out.println(num1 - num2);
                    break;
                case '*':
                    System.out.println(num1 * num2);
                    break;
                case '/':
                    System.out.println(num1 / num2);
                    break;
                case '%':
                    System.out.println(num1 % num2);
                    break;
                default:
                    System.out.println("Please !! Provide valid operator");
            }

        }
    }
}*//*
                                      
                                      public class rough {
                                       public static void main(String args[]) {
                                           try (Scanner sc = new Scanner(System.in)) {
                                                * int counter = 0;
                                                * while (counter < 4) {
                                                * System.out.println("Hello");
                                                * counter++;
                                                * }
                                                */
/*
 * int number = 1;
 * int range = sc.nextInt();
 * while (number <= range) {
 * System.out.print(number + " ");
 * ++number;
 * }
 * 
 * System.err.println("hii");
 * int range = sc.nextInt();
 * int sum = 0;
 * int count = 1;
 * while (count <= range) {
 * sum = sum + count;
 * ++count;
 * }
 * System.out.println("Sum of first " + range + "natural number is " + sum);
 * 
 * for (int i = 1; i <= 6; i++) {
 * System.out.println("******");
 * 
 * }
 * int line = 1;
 * while (line <= 4) {
 * System.out.println("****");
 * line++;
 * }
 * 
 * // reverse of a number...
 * 
 * for (int index = sc.nextInt(); index > 0; index = index / 10) {
 * // System.out.println("num is" + index);
 * int digit = index % 10;
 * System.out.print(digit);
 * // System.out.print(num % index);
 * // System.out.println(index);
 * // System.out.println(num);
 * }
 * 
 * int rev = 0;
 * for (int num = sc.nextInt(); num > 0; num = num / 10) {
 * int digit = num % 10;
 * rev = rev * 10 + digit;
 * }
 * System.out.println(rev);
 * 
 * for (int i = 1; i < 5; i++) {
 * if (i == 3) {
 * break;
 * }
 * System.out.println(i);
 * }
 * System.out.println("Out of loop");
 * 
 * do {
 * int num = sc.nextInt();
 * if (num % 10 == 0) {
 * break;
 * }
 * System.out.println(num);
 * } while (true);
 * do {
 * int num = sc.nextInt();
 * if (num % 10 == 0) {
 * continue;
 * }
 * System.out.println(num);
 * } while (true);
 * 
 * int num = sc.nextInt();
 * 
 * boolean status;
 * for (int div = 2; div < num; div++) {
 * // System.out.println(div);
 * status = (num % div == 0) ? true : false;
 * // System.out.println("Status after every loop." + status);
 * if (status == false) {
 * System.out.println("It is  prime.");
 * 
 * } else if (status == true) {
 * System.out.println("Not PRIME.");
 * }
 * 
 * }
 * for (int div = 2; div < Math.sqrt(div); div++) {
 * status = (num % div == 0) ? true : false;
 * // System.out.println("Status after every loop." + status);
 * if (status == false) {
 * System.out.println("It is  prime.");
 * 
 * } else if (status == true) {
 * System.out.println("Not PRIME.");
 * }
 * 
 * }
 * 
 * for (int line1 = 1; line1 <= 4; line1++) {
 * for (int j1 = 1; j1 <= line1; j1++) {
 * System.out.print("*");
 * }
 * System.out.println();
 * }
 * for (int line = 4; line >= 1; line--) {
 * for (int j = 1; j <= line; j++) {
 * System.out.print("*");
 * }
 * System.out.println();
 * }
 * 
 * for (int line = 1; line <= 4; line++) {
 * for (int num = 1; num <= line; num++) {
 * System.out.print(num);
 * }
 * System.out.println();
 * }
 */
/*   int n = 5;
   char ch = 'A';
   for (int line = 1; line <= n; line++) {
       for (int j = 1; j <= line; j++) {
           System.out.print(ch);
           ch++;
       }
       System.out.println();
   }
   int num = 1;
   for (int line = 1; line <= 5; line++) {
       num = 1;
       for (int j = 5; j >= line; j--) {
           System.out.print(num);
           num++;
       }
       System.out.println();
   }
   int number = 1;
   for (int line = 1; line <= 5; line++) {
       for (int j = 1; j <= line; j++) {
           System.out.print(number);
           number++;
       }
       System.out.println();
   }
   int num1 = 1;
   for (int line = 1; line <= 5; line++) {
       for (int j = 1; j <= line; j++) {
           if ((line + j) % 2 == 1) {
               System.out.print("0");
           } else {
               System.out.print("1");
           }
       }
       System.out.println();
   }

}

}

}
*/
// import java.util.*;

public class rough1 {
    public static int calsum(int a, int b) {
        int sum = a + b;
        return sum;

    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a is :" + a);
        System.out.println("b is :" + b);
    }

    public static int product(int a, int b) {
        int prod = a * b;
        return prod;
    }

    public static int factorial(int a) {
        int factorial = 1;
        for (int i = a; i >= 1; i--) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static int binomailcoeff(int n, int r) {
        int coeff;
        int facN = factorial(n);
        int facR = factorial(r);
        int facNR = factorial(n - r);
        /*
         * for (int i = n; i >= 1; i--) {
         * facN *= i;
         * }
         * for (int j = r; j >= 1; j--) {
         * facR *= j;
         * }
         * for (int k = n - r; k >= 1; k--) {
         * facNR *= k;
         * }
         */
        coeff = facN / (facR * facNR);
        return coeff;
    }

    public static void prime(int a) {
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                // return "not prime";
                System.out.println("It is not prime.");
            } else {
                // return "prime";
                System.out.println("It is prime.");
            }
        }

    }

    public static void main(String args[]) {
        System.out.println("before function call.");
        // Scanner sc = new Scanner(System.in);
        // int x = sc.nextInt();
        // int y = sc.nextInt();
        // int sum = calsum(x, y);
        // swap
        // swap(x, y);
        // int prod = product(x, y);
        // System.out.println(prod);
        // int fac = factorial(x);
        // System.out.println("Factorial of " + x + " is " + fac);
        // int binoco = binomailcoeff(x, y);
        // System.out.println("Coefficient is: " + binoco);
        // prime(x);
        // int x = 5;
        // x *= (3 + 7);
        // System.out.println(x);
        //
        // int a = 10;
        // int A = 10;
        // System.out.println(a-- * a--);
        // System.out.println(A);
        // 
        // int ++a=100;
        // System.out.println(++a);
        // // System.out.println(ans);

    }
}