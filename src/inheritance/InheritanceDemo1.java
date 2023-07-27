package inheritance;

public class InheritanceDemo1 {
public static void main(String[] args) {
	H3 h3 = new H3();
	h3.m1();
//	h3.m2();
	h3.m3();
}
}


class H1{
	public void m1() {
		
	}
}
class H2 extends H1{
	public void m2() {
		
	}
}
class H3 extends H1{
	public void m3() {
		
	}
}