package task;

public class Max {
	public static void main(String[]args)
	{
		
		int a[]= {25,2,63,50,24};
		int i,max;
		max=a[0];
		int pos=0;
		for(i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
				pos=i;
			}
				
			
		}
		
		System.out.println("Greatest element="+max);
		System.out.println("The greater no. is found at index="+pos);
		
	}

}
