package practice;
                         //Static variable use 
class Counter
{
int count=0;               //if static int count=0;    output:1 2 3
Counter()
{
count++;
System.out.println(count);
}
public static void main(String args[])
{
Counter a=new Counter();
Counter b=new Counter();
Counter c=new Counter();               //output:1 1 1
}
}