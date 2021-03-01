// Q. 1 Write a Java program that accepts four integer from the user and prints equal if all four are
// equal, and not equal otherwise.



// This is to get the Scanner class
import java.util.*;

class Question1 {
    // This is the main method 
    public static void main(String[] args) {
        // Creating scanner object to take user input using new operator
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter four integer values: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        // Checking if all the four values are equal or not
        if(a==b && b==c && c==a && d==a) {
            System.out.println("Numbers are equal!");
        }
        else {
            System.out.println("Numbers are not equal!");
        }

    }
}