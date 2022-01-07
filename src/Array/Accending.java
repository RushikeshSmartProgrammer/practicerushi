package Array;

public class Accending 
{
public static void main(String args[])
{
	int a[]= {1,10,9,33,4,2};
for(int i=0;i<a.length;i++)
{
for(int j=i+1;j<a.length;j++)
{
if(a[i]>a[j])       //logic
{
int temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
System.out.print(a[i]+",");    // first method to print accending number
}
//for(int v:a)                 //second method 
//{
//System.out.print(v +",");	
//}
}
}
