package practice;

 class Animal{
	void eat()
	{
		System.out.println("Eat");
	}
	
 }
 class Dog extends Animal{
	
	void bark() {
		System.out.println("Barking");
		
		
	}
	
}
public  class Test extends Dog{
	 public static void main(String args[])
		{
		Dog d=new Test();
			d.eat();
			d.bark();
			
		}
 }

