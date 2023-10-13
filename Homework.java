// import java.util.*;

//ASSNGMENTS 
/* 
public class Homework {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int num3 = sc.nextInt();
            int avg = (num1 + num2 + num3) / 3;
            System.out.println("Average: " + avg);

            // Find area of square

            float side = sc.nextFloat();
            float area = side * side;
            System.out.println("Area is:" + area);

            // Enter cost of 3 items from the user (usingfloatdatatype)
            // -a pencil,a pen and an eraser. You have to output the
            // total cost of the items back to the user as their bill.
            // (Add on : You can also try adding 18% gst tax to the items in the bill as an
            // advanced problem)

            float pen = sc.nextFloat();
            float pencil = sc.nextFloat();
            float eraser = sc.nextFloat();
            float price = pen + pencil + eraser;
            System.out.println("Total bill without gst:" + price);
            System.out.println("Total bill with gst:" + (price + price * 18 / 100));
        }

        
          int $ = 24; //No error would be there
          System.out.println($);
         
        
         //dOUBLE DATATYPE WILL BE THERE FOR HE given expression
         
    }

}*/

/*public class Homework {
    public static void main(String args[]) {
        // question1
        System.out.println("Question 1");
        int x = 2, y = 5;
        int exp1 = (x * y / x);
        int exp2 = (x * (y / x));
        System.out.println(exp1);
        System.out.println(exp2);
        // question2
        System.out.println("Question 2");
        int x1 = 200, y1 = 50, z = 100;
        if (x1 > y1 && y1 > z) {
            System.out.println("Hello");
        }
        if (z > y1 && z < x1) {
            System.out.println("Java");
        }
        if ((y1 + 200) < x && (y1 + 150) < z) {
            System.out.println("Hello Java");
        }

        // question 3
        System.out.println("Question 3");
        int x2, y2, z2;
        x2 = y2 = z2 = 2;
        x2 += y2;
        y2 -= z2;
        z2 /= (x2 + y2);
        System.out.println(x2 + " " + y2 + " " + z2);
        // question 4
        System.out.println("Question 4");
        int x3 = 9, y3 = 12;
        int a = 2, b = 4, c = 6;
        int exp = 4 / 3 * (x3 + 34) + 9 * (a + b * c) + (3 + y3 * (2 + a)) / (a + b * y3);
        System.out.println(exp);

        // question 5
        System.out.println("Question 5");
        int x4 = 10, y4 = 5;
        int exp3 = (y4 * (x4 / y4 + x4 / y4));
        int exp4 = (y4 * x4 / y4 + y4 * x4 / y4);

        System.out.println(exp3);
        System.out.println(exp4);

    }
}*/
/*
public class Homework {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            // Question 1

            int a = sc.nextInt();
            if (a > 0) {
                System.out.println("Number is positive.");
            } else {
                System.out.println("Number is negative.");
            }

            // Question 2

            double temp = sc.nextDouble();
            if (temp > 100) {
                System.out.println("You have fever.");
            } else {
                System.out.println("You don't have fever.");
            }

            // Question3...

            System.out.println("Enter week number:");
            int weekno = sc.nextInt();
            switch (weekno) {
                case 1:
                    System.out.println("Its Monday");
                    break;
                case 2:
                    System.out.println("Its Tuesday");
                    break;
                case 3:
                    System.out.println("Its Wednesday");
                    break;
                case 4:
                    System.out.println("Its Thursday");
                    break;
                case 5:
                    System.out.println("Its Friday");
                    break;
                case 6:
                    System.out.println("Its Saturday");
                    break;
                case 7:
                    System.out.println("Its Sunday");
                    break;
                default:
                    System.out.println("!! Provide with correct week number !!");
            }

            // question 4

            int a1 = 63, b1 = 36;
            boolean x = (a1 < b1) ? true : false;
            int y = (a1 > b1) ? a1 : b1;
            System.out.println(x + "" + y);

            // Question 5 leap year finding.......

            int year = sc.nextInt();
            if (year % 100 == 0) {
                if ((year % 400) == 0) {
                    System.out.println(year + " is leap year.");
                } else {
                    System.out.println(year + " is not leap year.");
                }
            } else {
                if ((year % 4) == 0) {
                    System.out.println(year + " is leap year.");
                } else {
                    System.out.println(year + " is not leap year.");
                }
            }

            // correction of ques 5
            int year1 = sc.nextInt();
            if ((year1 % 4) == 0) {
                if ((year1 % 100) == 0) {
                    if ((year1 % 400) == 0) {
                        System.out.println("It is a leap year.");
                    } else {
                        System.out.println("Not a leap year.");
                    }
                } else {
                    System.out.println("It is a leap year");
                }
            } else {
                System.out.println("Not leap year.");
            }
        }

    }
}*/
// import java.util.*;

// public class Homework {
//     public static void main(String args[]) {
//         try (Scanner sc = new Scanner(System.in)) {
// Sum of even and odd inergers from nth natural numbers...
/*
 * System.out.print("Enter nth natural number:");
 * int range = sc.nextInt();
 * int sumE = 0, sumO = 0;
 * for (int i = 1; i <= range; i++) {
 * if (i % 2 == 0) {
 * sumE += i;
 * } else {
 * sumO += i;
 * }
 * }
 * System.out.println("Sum of even numbers:" + sumE);
 * System.out.println("Sum of odd numbers:" + sumO);
 */

// FACTORIAL....
/*
 * System.out.print("Find factorial of:");
 * int range = sc.nextInt();
 * int factorial = 1;
 * if (range == 0) {
 * factorial = 1;
 * } else if (range > 0) {
 * for (int i = range; i >= 1; i--) {
 * factorial = factorial * i;
 * }
 * } else {
 * System.out.println("Error !!. Not able to find factorial of such number.");
 * }
 * System.out.println("Factorial of " + range + ": " + factorial);
 */
// table of number N:
//             System.out.print("Show table of:");
//             int number = sc.nextInt();
//             for (int i = 1; i <= 10; i++) {
//                 System.out.println(number + "*" + i + "=" + (number * i));
//             }
//         }
//     }
// }
// import java.util.*;
// public class Homework{
//     public static void Hw1(int matrix[][]){
//         int nums=0;
//         for(int i=0;i<matrix.length;i++){
//             for(int j=0;j<matrix[0].length;j++){
//                 if(matrix[i][j]==7){
//                     nums++;
//                 }
//             }
//         }
//         System.out.println("7 is "+nums+"times.");
//     }
//     public static void Hw2(int matrix[][]) {
//         int sum=0;
//         for (int j=0;j<matrix[0].length;j++){
//             sum+=matrix[1][j];
//         }
//         System.out.println(sum+" Hw 2");        
//     }
//     public static void tranposeUni(int matrix[][]){
//         //real matrix;
//         printmatrix(matrix);
//         int transpose[][]=new int[matrix[0].length][matrix.length];
//         for(int i=0;i<matrix.length;i++){
//             for (int j=0;j<matrix[0].length;j++){
//                 transpose[j][i]=matrix[i][j];
//             }
//         }
//         System.out.println("tRANPOSED MATRIX.");
//         printmatrix(transpose);
//     }
// public static void transpose(int matrix[][]) {
//     int no=0;
//     for(int i=0;i<matrix.length;i++){
//         for(int j=0;j<matrix[0].length;j++){
//             if(i!=j){
//                 no++;
//                 int temp=matrix[i][j];
//                 matrix[i][j]=matrix[j][i];
//                 matrix[j][i]=temp;

//             }
//         }
//     }
//     System.out.println(no);

// }
//     public static void  printmatrix(int matrix[][]){
//         for(int i=0;i<matrix.length;i++){
//             for(int j=0;j<matrix[0].length;j++){
//                 System.out.print(matrix[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]) {
//         int matrix[][]={{4,7,8},{7,7,7}};
//         int matrix2[][]={{1,4,9,4},{11,4,3,4},{2,2,3,5}};
//         int matrix3[][]={{1,2,3},{4,5,6},{7,8,9}};
//         // Hw1(matrix);
//         // Hw2(matrix2);
//         tranposeUni(matrix2);

//     }
// }
// import java.util.*;

public class Homework {
    public static void Hw1s(String str) {
        int count = 0;
        String vowel = "aeiou";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < vowel.length(); j++) {
                if (str.charAt(i) == vowel.charAt(j)) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static void main(String args[]) {
        String str = "hEllo everyone i am himanshu kumar jha . asdedghiounmcair.";
        Hw1s(str);
    }
}
