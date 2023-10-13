import java.util.*;

public class question {
    public static void main(String args[]) {
        // to fin whether the rectangle is square or not...
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Give length of rectanlge:");
            int a = sc.nextInt();
            System.out.println("Give breadth of rectanlge:");
            int b = sc.nextInt();
            if (a == b) {
                System.out.println("Its a square...");
            } else {
                System.out.println("Its a rectangle...");
            }
            // discount management
            System.out.println("Quantiy purchased:");
            int qty = sc.nextInt();
            if ((qty * 100) > 1000) {
                System.out.println("Total cost:" + (qty * 100 - (qty * 100 * 0.1)));
            } else {
                System.out.println("Total cost:" + qty * 100);
            }
            System.out.println("Salary you get:");
            double salary = sc.nextInt();
            System.out.println("Year of service:");
            double year = sc.nextInt();
            if (year > 5) {
                double bonus = salary * 0.05;
                System.out.println("Your total bonus amount is:" + bonus);
            } else {
                System.out.println("Sorry !! You haven't recieved ay bonus.");
            }
            int marks = sc.nextInt();
            if (marks > 80) {
                System.out.println("Grade:A");
            } else if (marks < 80 && marks > 60) {
                System.out.println("Grade:B");
            } else if (marks < 60 && marks > 50) {
                System.out.println("Grade:C");
            } else if (marks < 50 && marks > 45) {
                System.out.println("Grade:D");
            } else if (marks < 45 && marks > 25) {
                System.out.println("Grade:E");
            } else if (marks < 25) {
                System.out.println("Grade:F");
            } else {
                System.out.println("Be hard worrking to have proper grade.");
            }
            System.out.println("Sex [M|F]:");

        }
    }
}