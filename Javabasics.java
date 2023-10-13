import java.util.*;

public class Javabasics {
    public static void main(String args[]) {
        // product of two numbers
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int product = a * b;
            System.out.println("The product of " + a + " and " + b + " is " + product);

            // area of circle
            float radius = sc.nextFloat();
            double area = 3.14 * radius * radius;
            System.out.println(area);
        }
    }
}