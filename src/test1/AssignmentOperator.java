package test1;

public class AssignmentOperator {
	public static void main(String[] args) {
		int i = 10; 
//		i = i + 4;
		
		i+=5; // i = i + 5
		i*=5; // i = i * 5
		i/=5; // i = i / 5
		i-=5; // i = i - 5
		i%=5; // i = i % 5
		
//		System.out.println(i);
		
		// ternary operator - work around of if else 
		
		int age = 10;
//		String ageGroup = "";
//		if(age <  18) {
//			ageGroup = "Child";
//		}else {
//			ageGroup = "Adult";
//		}
//		System.out.println(ageGroup);
		
		
		String ageGroup = age < 18 ? "Child" : "Adult"; 
		
		// operator
		// increment and decrement
		// bitwise and logical
		// ternary operator
		
		
		
	}
}
