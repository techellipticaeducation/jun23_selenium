package test1;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {


		// while loop
		// item1 = 23    // 23
		// item2 = 25    // 23+25= 48
		// item3 = 50    // 48 + 50 = 98
		System.out.println("Expense Calculator");
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter Your Budget for today Shopping :");
		int budget = scan1.nextInt();
		System.out.println("Your today Budget is " + budget);
		int k = 0;
		int totalExpense = 0;
		while(k != -1) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter a item price:");
			k = scan.nextInt();

			if((totalExpense + k) > budget) {
				System.out.println("You are not allowed to buy this item");
			}else {

				totalExpense = totalExpense + k;
				System.out.println("total Expense " + totalExpense);
				System.out.println("Amount left in pocket " + (budget -totalExpense));
			}
		}

		System.out.println("Thank You");

	}
}
