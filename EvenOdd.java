import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class EvenOdd
{
	public  static void main(String[] args) 

	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number:");
		int a= s.nextInt();
		if(a%2==0)
		System.out.println("The number is even");
		else
		System.out.println("The number is odd");
}
}
		
	