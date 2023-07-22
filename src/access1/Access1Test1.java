package access1;

import access2.Access2Test1;

public class Access1Test1 {
// public - visible to everyone 
// protected - 
// default - visible with in package
// private - visible in class
	
	// variable, method, constructor, class 
	
	// class - public , default
	private int i = 10;
	public static void main(String[] args) {
		Access2Test1 test1 = new Access2Test1();
		test1.m1();
		
		Access1Test2 test2 = new Access1Test2();
		test2.m2();
	}
}
