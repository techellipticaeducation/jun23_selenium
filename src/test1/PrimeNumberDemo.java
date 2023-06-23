package test1;

import java.util.Scanner;

public class PrimeNumberDemo {
	public static void main(String[] args) {
		// 11

		// how will you check that this number is prime or not ?
		// 1,2,3,4,5,6,7,8,9,10,11
		// from 2 to (number-1)
		// 

		// 17
		// 2 to 16
		// 16 % 2 = 0 
// 16 , 9,10,11,12,13,14,15
// 16 = , 2 to 15
// 16 =   2 to 8
		
//		long  -  8 bytes
//      short - 2 byte
//      unicode char - 
//		ascii - 1 byte
//		unicode - 2 byte
		
		// please provide all prime number from 1 to 100

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your range from 1 to ");
		int input = scan.nextInt();
		for(int j = 1; j  <= input ;j++ ) {
			boolean isPrime = true;
			for(int i = 2 ; i <= (j/2); i++) {
				if(j % i == 0) {
					isPrime = false;
				}
			}

			if(isPrime) {
				System.out.println(j);
			}else {
//				System.out.println("number is not prime");
			}
		}

	}
}
