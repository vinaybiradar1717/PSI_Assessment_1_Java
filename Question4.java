// Q. 4 Write a Java program to print an array after changing the rows and columns of a 
// given twodimensional array.


class Question4 {
    // This is the main method 
    public static void main(String[] args) {
        // This is the given array
        int originalArray[][]={{10, 20, 30},{40, 50, 60}};
        int transpose[][] = new int[originalArray[0].length][originalArray.length];

        // Printing the original array
        for(int i=0; i<originalArray.length; i++) {
            for(int j=0; j<originalArray[0].length; j++) {
                System.out.print(originalArray[i][j]+"\t");
            }
            System.out.print("\n");
        }

        // Taking the transpose of the matrix
        for(int i=0; i<2; i++) {
            for(int j=0; j<3; j++) {
                transpose[j][i] = originalArray[i][j];
            }
        }

        // Printing the transpose matrix
        for(int i=0; i<transpose.length; i++) {
            for(int j=0; j<transpose[0].length; j++) {
                System.out.print(transpose[i][j]+"\t");
            }
            System.out.print("\n");
        }
    }

}