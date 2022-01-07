package practice;

public class Occurance {
	String a="Welcome";
	
	void CheckChar(String str)
	{
		int count=0;
		char check='e';
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==check)
			{
				count=count+1;
			}
		}
		System.out.println("Occurance count ofg iven cchar is:"+count);
		
	}
	
	
	public static void main(String args[])
	{
		Occurance o=new Occurance();
		
		o.CheckChar("Welcome");
		
		
	}

}
