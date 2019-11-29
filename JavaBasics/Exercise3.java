/*
Write a Java program to determine whether an input number is an even number.
*/

public class Exercise3 {
    
    public static void main ( String[] args ) {
        String num = args[0];

        if ( Integer.parseInt(num)%2  == 0) {
            System.out.println( "The number " + num + " is an even number");
        } else {
            System.out.println( "The number " + num + " is an odd number");
        }
        
    }

}