package test1;

public class MethodDemo {
	
	public static void main(String[] args) {
		MethodDemo demo1 = new MethodDemo();
//		int n = 10;
//		int o = 20;
//		int m = demo1.add(n,o);
//		System.out.println(m);
//		int s1 = demo1.square(5);
//		System.out.println(s1);
		for(int i = 1 ; i <= 10 ;i++) {
			int g = demo1.square(i);
			System.out.println(g);
		}
		
		PrimeNumberDemo dem1 = new PrimeNumberDemo();
		boolean isPrime = dem1.isPrime(30);
		System.out.println(isPrime);
		
	}
	
	// Method is like services
	// taking some input and processing it and giving back some output
	// name of method  - add
	// take 2 values as input , then sum them , and give me sum value
	// parameters
	// return keyword must be the last logical statement in method	
	// methods are reusable
	
	int square(int i){
		return i*i;
	}
	
	int add(int i , int j){
		int k = i + j;
		return i;
	}

	// non-param method
	double piValue() {
		return 3.14d;
	}
	
	// no return type	
	void increment(){
		System.out.println("incement");
	}
	
	
	
}
