// Q. 2 Write a Java program that accepts two double variables and test if both strictly between 0
// and 1 and false otherwise.


// This is to get the Scanner class
import java.util.*;

class Question2 {
    // This is the main method 
    public static void main(String[] args) {
        // Creating scanner object to take user input using new operator
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter two double values: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        // Checking if the values are between 0 and 1
        if (a>0 && a<1 && b>0 && b<1) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }

    }
}