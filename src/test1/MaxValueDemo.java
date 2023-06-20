package test1;

import java.util.Scanner;

public class MaxValueDemo {
public static void main(String[] args) {
//	int input1 = 134;
//	int input2 = 137;
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter your first number:");
	int input1 = scan.nextInt();
	System.out.println("Enter your second number:");
	int input2 = scan.nextInt();
	
	if(input1 > input2) {
		System.out.println(input1 + " is more then " +input2);
	}else if(input1 == input2){
		System.out.println(input1 + " is equal to " +input2);
	}else {
		System.out.println(input2 + " is more then " +input1);
	}
}
}
