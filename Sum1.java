package task;
import java.util.*;

public class Sum1 {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int n,s=0;
		System.out.println("\n Enter a number:");
		n=sc.nextInt();
		for(s=0;n>0;n=n/10)
		{
			s=s+n%10;
		}
		System.out.println("Sum of digits="+s);
		
		}

}