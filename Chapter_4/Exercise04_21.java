/*
(Check SSN)

Write a program that prompts the user to enter a Social Security Number in the format DDD-DD-DDDD, where D is a digit.

Your program should check whether the input is valid.

Sample Run 1

Enter a SSN: 232-23-5435
232-23-5435 is a valid social security number

﻿Sample Run 2

Enter a SSN: 23-23-5435
23-23-5435 is an invalid social security number

Class Name: Exercise04_21

*/

import java.util.Scanner ;

public class Exercise04_21{

	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a SSN: ");
		String ssn = input.next();
		
		//hyphen protocol
		
		boolean length_protocol = (ssn.length() == 11) ;
		int break_protocol_1 = (ssn.indexOf('-', 3 )); //first hyphen protocol // int a // String first_part = ssn.substring(0,a) 
		int break_protocol_2 = (ssn.indexOf('-',6)) ;  //second hyphen protocol // int b // String second_part = ssn.substring(a,b) // String third_part = (b,11)
		boolean protocol_1 = break_protocol_1 == (3) ;
		boolean protocol_2 = break_protocol_2 == (6) ;
		boolean hyphen_protocol = protocol_1 && protocol_2;
	
		if(length_protocol && hyphen_protocol){
			
			//substrings conversion from string to int
		
			String first_part = ssn.substring(0,break_protocol_1);
			String second_part = ssn.substring(break_protocol_1+1,break_protocol_2);
			String third_part = ssn.substring(break_protocol_2 + 1,11) ;
			
			
			char zero =  first_part.charAt(0);
			char one  =  first_part.charAt(1);
			char two  =  first_part.charAt(2);
			// char three = '-'
			char four = second_part.charAt(0);
			char five = second_part.charAt(1);
			//char six = '-' 
			char seven = third_part.charAt(0);
			char eight = third_part.charAt(1);
			char nine = third_part.charAt(2);
			char ten = third_part.charAt(3);

			boolean zero_digit = Character.isDigit(zero);
			boolean one_digit =  Character.isDigit(one);
			boolean two_digit =  Character.isDigit(two);
			boolean four_digit = Character.isDigit(four);
			boolean five_digit = Character.isDigit(five);
			boolean seven_digit = Character.isDigit(seven);
			boolean eight_digit = Character.isDigit(eight);
			boolean nine_digit = Character.isDigit(nine);
			boolean ten_digit = Character.isDigit(ten);
			
			boolean part_1 = zero_digit && one_digit && two_digit ;  
			boolean part_2 = four_digit && five_digit ;
			boolean part_3 = seven_digit && eight_digit && nine_digit && ten_digit ;
			
			boolean final_protocol = part_1 && part_2 && part_3 ;
			
			if(final_protocol){
				
				System.out.println( ssn + " is a valid social security number " ) ;
				
			}
			else{
				
				System.out.println( ssn + " is an invalid social security number " ) ;
				
			}
		}
			
		else{
			
			System.out.println( ssn + " is an invalid social security number " ) ;
		}
	}
}
