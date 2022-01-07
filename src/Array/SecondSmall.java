package Array;

public class SecondSmall {
	public static void main(String args[])
	{
	int a[]= {0,4,5,6,99,34,67,72,10,44};	
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1; j<a.length;j++)
		{
			if(a[i]>a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		System.out.print(a[i]+" ");
		
	}
	System.out.println();
	System.out.println("Small Large Number is="+" "+a[a.length-2]);
	}

}
