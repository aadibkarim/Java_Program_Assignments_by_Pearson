/*
Algebra: solve quadratic equations)

The two roots of a quadratic equation ax^2 + bx + c = 0 can be obtained using the following formula:

r1 = (-b + sqrt(b^2 - 4ac)) / (2a)
and
r2 = (-b - sqrt(b^2 - 4ac)) / (2a)

b^2 - 4ac is called the discriminant of the quadratic equation. 
If it is positive, the equation has two real roots.
If it is zero, the equation has one root. 
If it is negative, the equation has no real roots.

Write a program that prompts the user to enter values for a, b, and c and displays the result based on the discriminant.
If the discriminant is positive, display two roots.
If the discriminant is 0, display one root.
Otherwise, display The equation has no real roots.

Note that you can use Math.pow(x, 0.5) to compute sqrt(x).

Sample Run 1

Enter a, b, c: 1.0 3 1
The equation has two roots -0.381966 and -2.61803

﻿﻿﻿Sample Run 2

Enter a, b, c: 1 2.0 1
The equation has one root -1

Sample Run 3

Enter a, b, c: 1 2 3
The equation has no real roots

Class Name: Exercise03_01
*/
	import java.util.Scanner;
	
	public class Exercise03_01{
		
		
		public static void main(String args[]){
			
			Scanner input = new Scanner(System.in) ;
			
			System.out.println(" Enter a, b, c: ");
			
				
			double variable_a = input.nextDouble() ;
			double variable_b = input.nextDouble() ;
			double variable_c = input.nextDouble() ;
		
				
			double discriminant = Math.pow(variable_b,2) - (4 * variable_a * variable_c) ;
					
						//conditionals now
						//conditional_1
						//r1 = (-b + sqrt(b^2 - 4ac)) / (2a)
						//r2 = (-b - sqrt(b^2 - 4ac)) / (2a)

				if (discriminant > 0){
							
					double r_1 = ( -variable_b + Math.pow( (Math.pow(variable_b,2) - (4 * variable_a * variable_c)), 0.5  ) ) / (2*variable_a) ;
					double r_2 = ( -variable_b - Math.pow( (Math.pow(variable_b,2) - (4 * variable_a * variable_c)), 0.5  ) ) / (2*variable_a) ;
					
					String r_1_format = String.format( " %,.6f " , r_1) ;
					String r_2_format = String.format( " %,.6f " , r_2) ;
					System.out.println(" The equation has two roots " + r_1_format + "  " + r_2_format) ;
					
				}
						//conditional_2
						
				else if(discriminant == 0){
					
					double r_1 = ( -variable_b + Math.pow( (Math.pow(variable_b,2) - (4 * variable_a * variable_c)), 0.5  ) ) / (2*variable_a) ;
					
					System.out.println(" The equation has one root " + r_1 ) ;
					
				}	

				else{
					
					System.out.println(" The equation has no real roots "  ) ;
					
				}
					
				
		
		}
		
		
	}