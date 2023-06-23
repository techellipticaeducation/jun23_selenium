package test1;

public class FibanacciSeriesDemo {

	public static void main(String[] args) {
		
		// 0 1 1 2 3 5 8 13 21
	
		int number1 = 0;
		int number2 = 1;
		
		System.out.println(number1);
		System.out.println(number2);
		for(int i = 1 ; i < 15 ;i++) {
			int sum = number1+number2;
			System.out.println(sum);
			
			number1 = number2;
			number2 = sum;
		}
		
	}
	// Object Oriented Approach
}
