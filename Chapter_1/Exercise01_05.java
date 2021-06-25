/*
The U.S. Census Bureau projects population based on the following assumptions:

- One birth every 7 seconds
- One death every 13 seconds
- One new immigrant every 45 seconds

Write a program to display the population for each of the next five years.
Assume the current population is 312,032,486 and one year has 365 days.

Hint: In Java, if two integers perform division, the result is an integer. 
The fractional part is truncated. For example, 5 / 4 is 1 (not 1.25) and 10 / 4 is 2 (not 2.5). 
To get an accurate result with the fractional part,
one of the values involved in the division must be a number with a decimal point. 
For example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5.

Sample Run

Population after 1 year:  3.148125827032967E8
Population after 2 years: 3.1759267940659344E8
Population after 3 years: 3.2037277610989016E8
Population after 4 years: 3.2315287281318676E8
Population after 5 years: 3.259329695164835E8

Class Name: Exercise01_11



Program Architecture:

1 year = 365 days = ( 3.154e+7 ) 





*/




public class Exercise01_11{

    public static void main(String args[]){
		
		// CurrentPop + Birth(1 yr s/7s) + Immigration(1 yr s/45s) - Death(1yr s / 13s)
		
		System.out.println( "Population after 1 Year: " , ( 312032486 + (3.154e+7 / 7) + (3.154e+7 / 45) - (3.154e+7 / 13)) );
		

      

    }

}
