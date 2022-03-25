package com.java;
abstract class MyAbstract
{
	public abstract void add();
	public abstract void sub();
	void display()
	{
		System.out.println("Display method");
	}
}

public class MainClass1 {

	public static void main(String[] args) {
	 
		MyAbstract ob=new MyAbstract()
				{

					@Override
					public void add() {
						System.out.println("Add Method");
						
					}

					@Override
					public void sub() {
						System.out.println("Sub Method");
					}
			
				};
		ob.add();
		ob.sub();
		ob.display();

	}

}
