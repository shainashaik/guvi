/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,reverse=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		while(n!=0)
		{
			reverse=reverse*10;
			reverse=n%10;
			n=n/10;
			System.out.print(reverse);
			
		}
	}
}
