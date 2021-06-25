/*
Write a program that reads in investment amount, annual interest rate, and number of years, 
and displays the future investment value using the following formula:

futureInvestmentValue = investmentAmount * (1 + monthlyInterestRate)^(numberOfYears * 12)

For example, if you enter amount 1000, annual interest rate 3.25%, and number of years 1,
the future investment value is 1032.98

Sample Run

Enter investment amount: 1000.56
Enter annual interest rate in percentage: 4.25
Enter number of years: 1
Future value is $1043.92

Class Name: Exercise02_21

*/
	import java.util.Scanner;
	
	public class Exercise02_21{
	
	
		public static void main(String args[]){
		
			Scanner input = new Scanner(System.in);
			
			System.out.println(" Enter investment amount: " );
			
			double investment_amount = input.nextDouble();
			
			System.out.println(" Enter annual interest rate in percentage: " );
			
			double annual_interest = input.nextDouble();
			
			double annual_interest_percentage = annual_interest / 100 ; 
			
			double monthly_interest = annual_interest_percentage / 12 ;
			
			System.out.println(" Enter number of years: " );
			
			double years = input.nextDouble();
			
			double future_value = investment_amount * Math.pow( (1 + monthly_interest),(years * 12) );
			
			String future_value_formatted = String.format( " %.2f " , future_value) ; 
			
			System.out.println(" Future value is " + future_value_formatted );
			
		}
		
	}

