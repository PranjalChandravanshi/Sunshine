import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class alphabet
{
	public  static void main(String[] args) 

	{
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a letter:");
		char ch= reader.next().charAt(0);
		if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
		System.out.println("The character is an alphabet");
		else
		System.out.println("The character is not an alphabet");
}
}
		