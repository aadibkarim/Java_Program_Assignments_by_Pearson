/*
(Find the number of years)

Write a program that prompts the user to enter the minutes (e.g., 1 billion),
and displays the number of years and days for the minutes.

For simplicity, assume a year has 365 days.

Sample Run

Enter the number of minutes: 1000000000
1000000000 minutes is approximately 1902 years and 214 days

Class Name: Exercise02_07

*/

	import java.util.Scanner ;
	
	public class Exercise02_07{
		
		public static void main(String args[]){
			
			Scanner input = new Scanner(System.in) ;
			
			System.out.println(" Enter the number of minutes: " ) ;
			
			long minutes = input.nextLong() ;
			long days = (minutes/1440);
			long years = (days/365);
			long extra_days = days - (years*365);
			System.out.println( minutes + " minutes is approximately " + years + " years and " + extra_days + " days " ) ;
			
		}
		
	}
