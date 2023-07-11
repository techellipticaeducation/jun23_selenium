package test1;

public class StringDemo {
public static void main(String[] args) {
	// Object - Heap
	// String-pool 
	
	// String - its array of characters
	
	
	String s1 = "India"; //  1
	String s2 = "India"; // 1
	String s3 = "USA"; // 2
	s3 = "Pakistan"; // 3 
	String s4 = new String("India"); // 4
	String s5 = new String("Australia"); // 6
 	String s6 = new String("Australia"); // 7
 	String s7 = new String("England"); // 9
	
 	// ==  operator - ref check

 	int i= 10; // Literal way
 	String k1 = "Java"; // Literal way 
 	String k2 = "Java";
 	String k3 = new String("Java"); // Object way
 	String k4 = new String("Java");
 	
 	k3=k3.intern();
 	
// 	System.out.println(k1 == k2);  // true
// 	System.out.println(k1 == k3);  // false
// 	System.out.println(k2 == k4);  // false
//  	System.out.println(k3 == k4);  // false
 	
  	// there is way to convert object into literal in java - interning
  	
  	
  	// equals method = compare values
//  	System.out.println(k1.equals(k2));  // true
// 	System.out.println(k1.equals(k3));  // false
// 	System.out.println(k2.equals(k4));  // false
//  	System.out.println(k3.equals(k4));  // false
  	

  	// Immutability of String
  	//  == and equals operator 
  	// how string memory works
  	
  	// String method
  	
  	System.out.println(k1.length());
	System.out.println(k1.toUpperCase());
	System.out.println(k1.toLowerCase());
	System.out.println(k1.charAt(2));
  	System.out.println(k1.indexOf('a'));
  	System.out.println(k1.substring(1));
  	
}
}

class Student{
	String name ;
}
