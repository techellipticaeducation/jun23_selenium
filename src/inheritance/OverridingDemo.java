package inheritance;

public class OverridingDemo {
	public static void main(String[] args) {
		R2 r2= new R2();
		r2.m1();
	}
}

class R1{
	public final void m1() {
		System.out.println("R1 -> m1 body");
	}
}

// Method Overriding : R2 class m1 method override  R1 class m1 method
class R2 extends R1{
	public void m2() {
		super.m1();
		System.out.println("R2 -> m1 body");
	}
}

// Rules Of Method Overriding
// 1 - visibility rule  : child class overriding 
// method can increase the visibility or keep same visibility
// public > protected > default > private

// 2 - super keyword rule 
// 3 - private method can't be overridden 
// 4 - final method can't be overridden


