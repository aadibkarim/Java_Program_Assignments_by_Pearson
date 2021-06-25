/*

(Physics: acceleration)

Average acceleration is defined as the change of velocity divided by the time taken to make the change, 
as shown in the following formula:

a = (v1 - v0) / t

Here, v0 is the starting velocity in meters per second, 
v1 is the ending velocity in meters per second, 
and t is the time span in seconds. 
Assume v0 is 5.6, v1 is 10.5, and t is 0.5, and write the code to display the average acceleration.

Class Name: Exercise01_02Extra

*/

public class Exercise01_02Extra{

	public static void main(String args[]){
		
		double a ;
		double t =  0.5  ;
		double v0 = 5.6  ;
		double v1 = 10.5 ;
	
		a = ( (v1 - v0) / t );
		System.out.println(a);		
	}
}




