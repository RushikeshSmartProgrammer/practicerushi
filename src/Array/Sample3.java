package Array;

public class Sample3 {
	public static void main(String args[])
	{
		int a[]= {2,6,1,3,10};
		int even[]=new int[5];
		int count=0;
		for (int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				even[count]=a[i];
				count++;
			}else
			{
				System.out.println("odd="+a[i]);
			}
			System.out.print("even=");
			for(int v:even)
			{
			System.out.println(" "+v);	
			}
		}
		
	}
}
