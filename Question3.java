// Q. 3 Write a Java program to print the contents of a two-dimensional Boolean array where t will
// represent true and f will represent false.

class Question3 {
    // This is the main method 
    public static void main(String[] args) {

        // Taking the sample array
        boolean myArray[][] = {{true, false, true}, {false, true, false}};

        // Looping throughthe sample array using rray length
        for (int i=0; i<myArray.length; i++) {
            // Going through the columns
            for (int j=0; j<myArray[0].length; j++) {
                // Checking if ythe array vlaue if rue or false
                if (myArray[i][j]) {
                    System.out.print("t\t");
                }
                else {
                    System.out.print("y\t");
                }
            }
            System.out.print("\n");
        }
        

        

        

    }
}