/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class A
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		n=s.nextInt();
		if (n>0)
		{
			System.out.println("given number is positive");
		}
		else if (n<0)
		{
			System.out.println("given number is negative");
		}
		else 
		{
			System.out.println("given number is zero");
		}
		}
		}
