package revisit1;

public class ChainingDemo {
	public static void main(String[] args) {
		M mobj = new M();
//		mobj.m1();
//		mobj.m2();
//		mobj.m3();
//		mobj.m4();
//		mobj.m5();
//		
		mobj.m1().m2().m3().m4().m5();
		
	//	10 + 20 + nishat + 40
	// 30 + nishat + 40
		
		int value = mobj.add(10, 20);
		int value1 = mobj.add(value, value);
	}
}

class M{

	public int add(int i, int j) {
		return i+j;
	}
	
	public M m1() {
		System.out.println("m1 functionality");
		return this;
	}
	public M m2() {
		System.out.println("m1 functionality");
		return this;
	}
	public M m3() {
		System.out.println("m1 functionality");
		return this;
	}
	public M m4() {
		System.out.println("m1 functionality");
		return this;
	}
	public M m5() {
		System.out.println("m1 functionality");
		return this;
	}


}
