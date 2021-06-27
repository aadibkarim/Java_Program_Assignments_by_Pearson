/*
(Find the number of days in a month)

Write a program that prompts the user to enter the month and year and displays the number of days in the month.

For example,

If the user entered month 2 and year 2012, the program should display that February 2012 has 29 days.

If the user entered month 3 and year 2015, the program should display that March 2015 has 31 days.

Sample Run 1

Enter a month in the year (e.g., 1 for Jan): 2
Enter a year: 2012
February 2012 has 29 days

﻿﻿﻿Sample Run 2

Enter a month in the year (e.g., 1 for Jan): 4
Enter a year: 2005
April 2005 has 30 days

Sample Run 3

Enter a month in the year (e.g., 1 for Jan): 2
Enter a year: 2006
February 2006 has 28 days

Sample Run 4

Enter a month in the year (e.g., 1 for Jan): 2
Enter a year: 2000
February 2000 has 29 days

Class Name: Exercise03_11

*/

import java.util.Scanner;

	public class Exercise03_11{
		
		public static void main(String args[]){
		
			Scanner input = new Scanner(System.in);
			
				System.out.println(" Enter a month in the year (e.g., 1 for Jan): ");
				int Month = input.nextInt();
				
				System.out.println(" Enter a year: ");
				int Year = input.nextInt();
					
				
				boolean LeapYear = ( Year % 4 == 0);
					
				if(Month <= 12){
			
					switch (Month){
						
						case 1 : System.out.println(" January " + Year + " has 31 days " ); 
						
						break;
									
									
						
						case 2 : 	if (LeapYear) {
									
										System.out.println(" February " + Year + " has 29 days " );
									}
									else{
										
										System.out.println(" February " + Year + " has 28 days " );
										
									}
						break;		
						
						case 3 : System.out.println(" March " + Year + " has 31 days " );
						
						break;
						
						case 4 : System.out.println(" April " + Year + " has 30 days " );
						
						break;
						
						case 5 : System.out.println(" May " + Year + " has 31 days " );
						
						break;
						
						case 6 : System.out.println(" June " + Year + " has 30 days " );
						
						break;
						
						case 7 : System.out.println(" July " + Year + " has 31 days " );
						
						break;
						
						case 8 : System.out.println(" August " + Year + " has 31 days " );
						
						break;
						
						case 9 : System.out.println(" September " + Year + " has 30 days " );
						
						break;
						
						case 10 : System.out.println(" October " + Year + " has 31 days " );
						
						break;
						
						case 11 : System.out.println(" November " + Year + " has 30 days " );
						
						break;
						
						case 12 : System.out.println(" December " + Year + " has 31 days " );
						
						break;
					}
				}
				
				else{
					
					System.out.println("Invalid Month");
					
				}
		}

	}
