package inheritance;

public class InheritanceDemo3 {
	public static void main(String[] args) {
		K2 k2 = new K2(10);		
//		System.out.println(k2);
//		k2.m1();
		
	}
}

class K0{
	K0(){
		System.out.println("K0 execution");
	}
	K0(int i){
		System.out.println("K0 1 param execution");
	}
	public void m1() {

	}
}

class K1 extends K0{
	K1(){
		System.out.println("K1 execution");
	}
	K1(int i){
		super(i);
		System.out.println("K1 1 param execution");
	}
	public void m1() {

	}
}

class K2 extends K1{
	K2(){
		System.out.println("K2 execution");
	}
	K2(int i){
		super(i);
		System.out.println("K2 1 param execution");
	}
	public void m2() {
		super.m1();
	}
}
