/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n,i;
		int a=0;
		n=s.nextInt();
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				a++;
				
			}
	}
	if(a==2)
	{
		System.out.print("yes");
	}
			else
			{
				System.out.print("no");
			}
		}
	}
