/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a,d,n,sum;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		d=s.nextInt();
		n=s.nextInt();
		sum=(n*(2*a+(n-1)*d)/2);
		System.out.print(sum);
		
	}
}
