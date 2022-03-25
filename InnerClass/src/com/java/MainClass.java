//class inside class(inner class)
package com.java;
class Outer{
	 int i=2;
	private class Inner{
		int varinner;
		Inner(){
			varinner=10;//constrctor
		}
		public void inner()
		{
			System.out.println("Value of inner class"+varinner);
			System.out.println("value of outer class"+i);
		}
	}
	public void outer() {
		 Inner i=new  Inner();
		 i.inner();
	}
}

public class MainClass {

	public static void main(String[] args) {
		Outer o=new Outer();
		o.outer();
	}

}
