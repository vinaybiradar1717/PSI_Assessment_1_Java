// Q. 5 Write a Java program to find the k largest elements in a given array. Elements in the array can
// be in any order.

import java.util.*;

class Question5 {
    // This is the main method 
    public static void main(String[] args) {
        
        Integer a[] = new Integer[] {1, 4, 17, 7, 25, 3, 100};
        int k = 3;
        Arrays.sort(a, Collections.reverseOrder());
        for(int i=0; i<k; i++){
            System.out.println(a[i]+" ");
        }

    }
}