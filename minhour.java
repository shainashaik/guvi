/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,rem=0,min;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		min=n/60;
		rem=n%60;
		System.out.println(min+" "+rem);
	}
}
