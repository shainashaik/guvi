/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int sum=0,n,a,temp;
		 
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		temp=n;
		while(n!=0)
		{
			a=n%10;
			n=n/10;
			sum=sum+(a*a*a);
		}
		if(sum==temp)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		}
		}
		
		
	
