package test1;

public class ComparisonOperator {
public static void main(String[] args) {
	int i  = 10;
	int j = 20;
	
//	System.out.println(i > j); // false
//	System.out.println(i >= j); // false
//	System.out.println(i < j); // true
//	System.out.println(i <= j); // true
//	System.out.println(i == j); // false
//	System.out.println(i != j); // true
//	
	
	// bitwise Operator
//	when we have more then one condition to check
	// & - bitwise operator
	// true & true = true 
	// true & false = false 
	// false & true = false 
	// false & false = false 
	// && - logical operator
	
//	System.out.println(retureFalse() && retureFalse());
	
	// |
	// true | true = true 
	// true | false = true 
	// false | true = true 
	// false | false = false 
	System.out.println(retureTrue() | retureTrue());
	
}

public static boolean retureTrue() {
	System.out.println("return true");
	return true;
}
public static boolean retureFalse() {
	System.out.println("return false");
	return false;
}






}
