package practice;



public class Exercise {
	public static void main(String args[])
	{
		String address="Delhi,America";
		
		if(address.endsWith("India"))
		{
			if(address.contains("surat"))
			{
				System.out.println("Surat");
			}if(address.contains("Ahemdabad"))
			{
				System.out.println("Ahemdabad");
			}else
			{
				System.out.println(address.split(",")[1]);
			}
		}else {
			System.out.println("You are not Indian");
		}
	}

}
