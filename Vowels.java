import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class Vowels
{
	public  static void main(String[] args) 

	{
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a letter:");
		char ch= reader.next().charAt(0);
		if( ch=='a' || ch=='e' ||  ch=='i' ||  ch=='o' ||  ch=='u')
		System.out.println("The letter is a vowel");
		else
		System.out.println("The letter is a consonant");
}
}