/*
(Geometry: point in a rectangle?)

Write a program that prompts the user to enter a point (x, y) 
and checks whether the point is within the rectangle centered at (0, 0) with width 10 and height 5.
﻿
For example, (2, 2) is inside the rectangle 
and (6, 4) is outside the rectangle.

(Hint: A point is in the rectangle if its horizontal distance to (0, 0) is less than 
or equal to 10 / 2 and its vertical distance to (0, 0) is less than or equal to 5.0 / 2. 
Test your program to cover all cases.)

Sample Run 1

Enter a point with two coordinates: 2 2
Point (2.0, 2.0) is in the rectangle

﻿Sample run 2

Enter a point with two coordinates: 6 4
Point (6.0, 4.0) is not in the rectangle
﻿
﻿Sample Run 3

Enter a point with two coordinates: -5.1 -2.4
Point (-5.1, -2.4) is not in the rectangle
﻿
﻿Sample Run 4

Enter a point with two coordinates: -4.9 2.49
Point (-4.9, 2.49) is in the rectangle
﻿
﻿Sample Run 5
﻿
﻿Enter a point with two coordinates: -4.99 -2.499
Point (-4.99, -2.499) is in the rectangle

Class Name: Exercise03_23

*/

import java.util.Scanner;
	
	public class Exercise03_23{
		
		public static void main(String args[]){
			Scanner input = new Scanner(System.in);
			System.out.println(" Enter a point with two coordinates: ");
			
			double in_x = input.nextDouble();
			double in_y = input.nextDouble();
			
			double center_x = 0;
			double center_y = 0;
			
			double lim_x = 10;
			double lim_y = 5;
			
			double pos_lim_x = (lim_x/2);
			double neg_lim_x = -(lim_x/2);
			
			double pos_lim_y = (lim_y/2);
			double neg_lim_y = -(lim_y/2);
			
			if( ((in_x <= pos_lim_x) && (in_x >= neg_lim_x)) && ((in_y <= pos_lim_y) && (in_y >= neg_lim_y)) ){
				
				System.out.println( " Point ( " + in_x + " , " + in_y + " ) is in the rectangle " );
			}
			
			else{
				
				System.out.println( " Point ( " + in_x + " , " + in_y + " ) is not in the rectangle " );
				
			}
		}
	
	}
	
