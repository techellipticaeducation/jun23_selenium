package inheritance;

public class RuntimePolymorphism {
public static void main(String[] args) {
	D1 d2  = new D2();
	d2.m1();
	
	//d2.m2();
	//  we can use parent class ref and object of child class
	
	// method of parent class will be visible
	// due to overriding, child class method will be executed 
}
}

class D1{
	public void m1() {
		System.out.println("D1-m1");
	}
}

class D2 extends D1{
	public void m1() {
		System.out.println("D2-m1");
	}
	public void m2() {
		System.out.println("D2-m2");
	}
}
