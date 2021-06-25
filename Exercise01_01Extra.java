/*
The formula for computing the discriminant of a quadratic equation ax^2 + bx + c = 0 is b^2 – 4ac. 
Write a program that computes the discriminant for the equation 3x^2 + 4x + 5 = 0.

Class Name: Exercise01_01Extra

*/

import java.lang.Math;

public class Exercise01_01Extra{

	public static void main(String args[]){
		
	double a = 3 ;
	double b = 4 ;
	double c = 5 ;
	double x ;
	
	double discriminant ;
	
	discriminant = ((Math.pow(b,2)) - (4*a*c));
	

	System.out.println( discriminant );
	
	
	}


}