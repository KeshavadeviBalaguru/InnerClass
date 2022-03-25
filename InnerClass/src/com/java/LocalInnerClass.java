package com.java;
class Outer1{
	void method()
	{
		class Inner
		{
			int i=3;
			void InnerMethod()
			{
				System.out.println("Inner variable value: "+i);
				System.out.println("Inner method");
			}
		}
		Inner i=new Inner();
		i.InnerMethod();
	}
}

public class LocalInnerClass {

	public static void main(String[] args) {
		 Outer1 o=new  Outer1();
		 o.method();

	}

}
