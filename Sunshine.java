import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Sunshine
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number:");
		int a= s.nextInt();
		
		if (a>0)
		System.out.println("The number is positive");
		else if(a<0)
		System.out.println("The number is negative");
		else 
		System.out.println("The number is zero");
	}
}
