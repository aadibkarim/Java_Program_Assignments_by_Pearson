/*

Write a program that reads the subtotal and the gratuity rate, then computes the gratuity and total.

For example, if the user enters 10 for subtotal and 15% for gratuity rate,
the program displays $1.5 as gratuity and $11.5 as total.

Enter the subtotal and a gratuity rate: 10 15
The gratuity is $1.5 and total is $11.5

*/
	import java.util.Scanner ;
	
	public class Exercise02_05{
	
		
		public static void main(String args[]){
			
			Scanner input = new Scanner(System.in);
			System.out.println(" Enter the subtotal and a gratuity rate : ");
			double subtotal = input.nextInt();
			double gratuity_rate = input.nextInt();
			
			//calculation
			
			double gratuity = ((gratuity_rate/100)*subtotal) ;
			
			double total = subtotal + gratuity ;
			
			System.out.println( "The gratuity is : $" + gratuity + " and total is $" + total ) ;
			
			
			
		}	
	
	}