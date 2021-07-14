/*
(Days of a month)

Write a program that prompts the user to enter a year and
the first three letters of a month name (with the first letter in uppercase) and displays the number of days in the month.

If the input for month is incorrect, display a message as shown in the following sample run.


Sample Run 1

Enter a year: 2001
Enter a month: Jan
Jan 2001 has 31 days

﻿Sample Run 2

Enter a year: 2016
Enter a month: Feb
Feb 2016 has 29 days
﻿
Sample Run 3

Enter a year: 2016
Enter a month: jan
jan is not a correct month name

Class Name: Exercise04_17

*/

import java.util.Scanner;

	public class Exercise04_17{
		
		public static void main(String args[]){
		
			Scanner input = new Scanner(System.in);
			
				System.out.println(" Enter a year: ");
				int Year = input.nextInt();
				
				System.out.println(" Enter a month: ");
				String Month = input.next();
				
				boolean LeapYear = ( Year % 4 == 0);
					
				//if(Month <= 12){
			
					switch (Month){
						
						case "Jan" : System.out.println(" Jan " + Year + " has 31 days " ); 
						
						break;
									
									
						
						case "Feb" : 	if (LeapYear) {
									
										System.out.println(" Feb " + Year + " has 29 days " );
									}
									else{
										
										System.out.println(" Feb " + Year + " has 28 days " );
										
									}
						break;		
						
						case "Mar" : System.out.println(" Mar " + Year + " has 31 days " );
						
						break;
						
						case "Apr" : System.out.println(" Apr " + Year + " has 30 days " );
						
						break;
						
						case "May" : System.out.println(" May " + Year + " has 31 days " );
						
						break;
						
						case "Jun" : System.out.println(" Jun " + Year + " has 30 days " );
						
						break;
						
						case "Jul" : System.out.println(" Jul " + Year + " has 31 days " );
						
						break;
						
						case "Aug" : System.out.println(" Aug " + Year + " has 31 days " );
						
						break;
						
						case "Sep" : System.out.println(" Sep " + Year + " has 30 days " );
						
						break;
						
						case "Oct" : System.out.println(" Oct " + Year + " has 31 days " );
						
						break;
						
						case "Nov" : System.out.println(" Nov " + Year + " has 30 days " );
						
						break;
						
						case "Dec" : System.out.println(" Dec " + Year + " has 31 days " );
						
						break;
					
						default : System.out.println( Month + " is not a correct month name ") ;
						
						System.exit(1);
					}
				//}
				
					
		}

	}