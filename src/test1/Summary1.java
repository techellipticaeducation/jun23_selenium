package test1;

public class Summary1 {
	public static void main(String[] args) {
		TechElliptica tech1 = new TechElliptica();
//		tech1.m1();
//		
//		TechElliptica.m2();
//		
		
	}
}
// same class
// Method to method - yes 
// Constructor to method  - yes
// Method to Constructor - No
// Constructor to Constructor - (this) - Yes
// this calling must be the first statement in constructor body
class TechElliptica{
	// no param
	TechElliptica() {
		this(10,20);
		//this(10);
	}
	
	
	// 1 param
	TechElliptica(int i) {
		System.out.println("i am 1 param constructor with value " + i);
	}
	// 2 param
	TechElliptica(int m, int h) {
		System.out.println("i am 2 param constructor with value " + m + "- " + h);
	}
	
	
	
	
	public void m1() {
		m3();
	}
	
	public void m3() {
		
	}
	
	public static void m2() {
		
	}

	
}
