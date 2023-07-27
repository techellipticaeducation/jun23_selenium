package inheritance;

public class InheritanceDemo {
	public static void main(String[] args) {
		
	}
}

// final class cannot be inherited - 

class A{
	public void m1() {
		
	}
	private void m5() {
		
	}
}

class B{
	public void m2() {
		A a1 = new A(); // HAS A Relationship , B class has A Class object
		a1.m1();
	}
}
// parent class automatically provide all methods and variable to child class
class C extends A{
	public void m3() {
		m1();  // IS-A Relationship, C class is a A class 
	}
	public void m4() {
//		m5(); // we cannot call private method
	}
}

