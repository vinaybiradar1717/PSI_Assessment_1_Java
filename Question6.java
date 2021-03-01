// Q.6 Write a Java program that will accept an integer and convert it into a binary representation.
// Now count the number of bits which is equal to zero of the said binary representation.

// This is to get the Scanner class
import java.util.*;

public class Question6 {
     // This is the main method 
     public static void main(String[] args) {

        // Creating scanner object to take user input using new operator
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        System.out.println(Integer.toBinaryString(a));
        String b = Integer.toBinaryString(a);
        // int count = 0;

        // for(int i=0; i<b.length(); i++) {
        //     if (b.charAt(i) == "o") {
        //         count++;
        //     }

        // }
        // System.out.println(count);

     }
}
