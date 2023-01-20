package task;

public class Pattern {
	public static void main(String[] args)
	{
		int a,b;
		for(a=5;a>=1;a--)
		{
			for (b=a;b<5;b++)
			{
				System.out.print(" ");
			}
			for(b=1;b<2*(a-1);b++)
			{
				System.out.print("*");
				}
		System.out.println();
		}
	}

}
