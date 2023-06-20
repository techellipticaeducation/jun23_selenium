package test1;

import java.util.Scanner;

public class ConditionalStatementDemo {
public static void main(String[] args) {
	// age < 18 = kid
	// age >18 and age < 45 = adult
	// age > 45 = old
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a age:");
	int age = scan.nextInt();
	
	String ageGroup = "";
	if(age < 18) {
		ageGroup = "kid";
	}else if(age >= 18 && age < 45) {
		ageGroup = "Adult";
	}else if(age > 45) {
		ageGroup = "old";
	}else {
		ageGroup ="i am  45";
	}
	
	System.out.println(age + " = " + ageGroup);
	
	
	
	
}
}
