/*
(Vowel or consonant?)

Write a program that prompts the user to enter a letter and check whether the letter is a vowel or consonant.

For a nonletter input, display invalid input.


Sample Run 1

Enter a letter: B
B is a consonant

﻿Sample Run 2

Enter a letter grade: a
a is a vowel

﻿Sample Run 3

Enter a letter grade: #
# is an invalid input

Class Name: Exercise04_13
*/

import java.util.Scanner;
public class Exercise04_13{
	
	public static void main(String args[]){
	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a letter grade : ");
		
		String s = input.nextLine();
		char letter = s.charAt(0);
		
		boolean alphabet = Character.isLetter(letter);
		
		//vowels
		char var_a = 'a' ;
		char var_A = 'A' ;
		
		char var_e = 'e' ;
		char var_E = 'E' ;
		
		char var_i = 'i' ;
		char var_I = 'I' ;
		
		char var_o = 'o' ;
		char var_O = 'O' ;
		
		char var_u = 'u' ;
		char var_U = 'U' ;
		
		
		
		if ( alphabet ){
			
			
			if ( (letter == var_a) || (letter == var_A ) ) {
				
				System.out.println( letter + " is a vowel ");
				
			}
			
			else if ( (letter == var_e) || (letter == var_E ) ) {
				
				System.out.println( letter + " is a vowel ");
			}
			
			else if ( (letter == var_i) || (letter == var_I ) ) {
				
				System.out.println( letter + " is a vowel ");
			}
			
			else if ( (letter == var_o) || (letter == var_O ) ) {
				
				System.out.println( letter + " is a vowel ");
			}
			
			else if ( (letter == var_u) || (letter == var_U ) ) {
				
				System.out.println( letter + " is a vowel ");
			}
			
			else{
				
				System.out.println( letter + " is a consonant " ) ;
			}
			
			
			
		}
		else{
			
			System.out.println(letter + " is an invalid input ");
		}
	
	}
}