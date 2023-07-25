package revisit1;

public class RevisitDemo {
public static void main(String[] args) {
	
	System.out.println(A.j);
	A.test2();
	
	
	A a1 = new A();
	System.out.println(a1.i);
	System.out.println(a1.j);
	a1.test1();
	a1.test2();
	
	// Singleton Design Pattern
}
}


class A{
	int i; 
	static int j;
	
	A(){
		System.out.println("i am constructor");
	}
	
	public void test1() {
		System.out.println("Logical code");
	}
	public static void test2() {
		System.out.println("Logical code");
	}
}

