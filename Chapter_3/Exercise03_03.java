/*
(Algebra: solve 2 x 2 linear equations)

A linear equation can be solved using Cramer’s rule given in Programming Exercise 1.13.

Write a program that prompts the user to enter a, b, c, d, e, and f and displays the result.

If ad - bc is 0, report The equation has no solution﻿.

Sample Run 1

Enter a, b, c, d, e, f: 9.0 4.0 3.0 -5.0 -6.0 -21.0
x is -2.0 and y is 3.0

﻿Sample Run 2

Enter a, b, c, d, e, f: 1.0 2.0 2.0 4.0 4.0 5.0
The equation has no solution

﻿﻿Sample Run 3

Enter a, b, c, d, e, f: 1.0 2.0 2.0 4.0 4.0 5.0 6.0
x is -4.0 and y is 4.5


Class Name: Exercise03_03

*/

import java.util.Scanner;

public class Exercise03_03{
	
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println(" Enter a, b, c, d, e, f: ");
			
			double a = input.nextDouble() ;
			double b = input.nextDouble() ;
			double c = input.nextDouble() ;
			double d = input.nextDouble() ;
			double e = input.nextDouble() ;
			double f = input.nextDouble() ;
		
				
				
				double determine = (a*d) - (b*c) ;

					if (determine == 0){
						
						System.out.println("The equation has no solution");
						
					}
					
					else{
						
						double x = ((e*d) - (b*f))/((a*d) - (b*c));
						double y = ((a*f) - (e*c))/((a*d) - (b*c));
						
						System.out.println(" x is " + x + " and y is " + y );
					}
	}
}