/**
 * CS 272 - Fall 2019
 * H01-Grade.java
 */
package occ.cs272.h01;

import java.util.Scanner;

/**
 * @author jjang12
 * @version 9/3/2019
 *
 */
public class Grade
{
    // TODO: You must fill these in correctly to get credit
    public static final String STUDENT = "jjang12";
    public static final String ASSIGNMENT = "H01-C";
    
    private String grade;
    
    /**
     * Constructs a Grade object given a letter grade.
     * @param input the letter grade.
     */
    public Grade(String input) 
    {
        grade = input;
    }
    
    /**
     * getNumericGrade
     * @return returns the numeric value of this grade.
     */
    public double getNumericGrade() 
    {
        //TODO Complete this method
    	int n = grade.length();
        char letter = grade.charAt(0);
        char modifier = (n > 1) ? grade.charAt(1) : (char)0; // 0 is the null char
        boolean valid = true;
        
        double base = -1.0;
        switch (letter)
        {
        	case 'A': case 'a': base = 4.0; break;
        	case 'B': case 'b': base = 3.0; break;
        	case 'C': case 'c': base = 2.0; break;
        	case 'D': case 'd': base = 1.0; break;
        	case 'F': case 'f': base = 0.0; break;
        	default: valid = false;
        }
        
        double adjust = 0.0;
        if (base >= 0.0)
        {
	        switch (modifier)
	        {
	        	case '+': adjust = 0.3; break;
	        	case '-': adjust = -0.3; break;
	        	case 0: break;
	        	default: valid = false;
	        }
        }
        
        if (base == 0.0 && adjust != 0.0) valid = false; //F+ f+ F- f-
        if (n > 2) valid = false;
        
        double num = base + adjust;
        if (num > 4.0) num = 4.0;        
        
        return (valid) ? num : -1.0; 
    }
    
    /**
     * Use this main method to interactively
     * test the getNumericGrade method.
     */
    public static void main(String[] args)
    {
        try (Scanner in = new Scanner(System.in))
        {
            System.out.print("Enter a letter grade: ");
            String input = in.nextLine();
            Grade g = new Grade(input);
            double grade = g.getNumericGrade();
            System.out.println("Numeric value: " + grade);
        }
    }
}
