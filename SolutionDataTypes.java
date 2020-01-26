import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SolutionDataTypes {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int number1;
        double number2;
        String s2;
    


        /* Read and save an integer, double, and String to your variables.*/
        number1 = scan.nextInt();
        number2 = scan.nextDouble();
        scan.nextLine();
        s2 = scan.nextLine();
        System.out.println(i + number1);
        System.out.println(d + number2);
        System.out.println(s + s2);

        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        /* Print the sum of both integer variables on a new line. */

        /* Print the sum of the double variables on a new line. */
		
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */

        scan.close();
    }
}
