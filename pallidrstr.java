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
		String c=s.next();
		int len=c.length();
		boolean b=false;
		for(int i=0;i<(len/2);i++)
		{
			if(c.charAt(i)!=c.charAt(len-i-1))
			b=true;
			}
			if(b==true)
			{
				System.out.print("no");
			}
			else
			{
				System.out.print("yes");
			}
			}
	
	}
