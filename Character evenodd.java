/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i,n;
		Scanner s=new Scanner(System.in);
		String c=s.next();
		n=c.length();
		for(i=0;i<n;i++)
		{
			if(i%2==0)
			{
				System.out.print(c.charAt(i));
			}
		}
		System.out.print("\t");
		for(i=0;i<n;i++)
		{
			if(i%2!=0)
			{
				System.out.print(c.charAt(i));
			}
		}
	}
}
