package Array;



//hi rushikesh here 

public class Decending {
	public static void main(String args[])
	{
		int a[]= {55,33,85,63,50,48,71,5,3,1,2};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])        //logic
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.print(a[i]+",");
		}
		
	}

}
