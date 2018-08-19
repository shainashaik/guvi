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
		String c=s.nextLine();
		boolean b=false;
		int len=c.length();
		for(int i=0;i<len;i++)
		{
			if(c.charAt(i)=='A'||c.charAt(i)=='E'||c.charAt(i)=='I'||c.charAt(i)=='O'||c.charAt(i)=='U'||c.charAt(i)=='a'||c.charAt(i)=='e'||c.charAt(i)=='i'||c.charAt(i)=='o'||c.charAt(i)=='u')
			{
				b=true;
			}
		}
		
			if(b=true)
			{
				System.out.print("yes");
			}
			else
			{
				System.out.print("no");
			}
			}
			}
		
