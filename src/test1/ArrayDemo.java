package test1;

public class ArrayDemo {
public static void main(String[] args) {
	//math 1, sciecne 2, sst 3, hindi 4, english 5
	int[] st1 = {34,12,56,78,89}; // Early initialization
	int[] st2 = {44,62,96,28,69};
	int[] st3 = {54,12,96,28,79};
	
	// when we define array , we need to provide size to that array
	int[] st4 = new int[3];
	//Lazy initilization
	st4[0] = 34;
	st4[1] = 64;
	st4[2] = 78;
	
//	System.out.println(st1[4]);
//	System.out.println(st1.length); // 5
	
	for(int i = 0 ; i < st1.length ; i = i + 2) {
		System.out.println(st1[i]);
	}
	System.out.println("------");
	// Iteration using for-each loop
	for(  int a  :   st1  ) {
		System.out.println(a);
	}
	
	
	
//	int[][] sessionMarks = {st1,st2,st3};
	// indexing - 0
	// 1 D array
	// 2 D array - excel , array inside another array
	//System.out.println(st2[3]);
//	System.out.println(sessionMarks[1][7]);
	// once a size is defined , you cannot reduce and increase it
	
// String concept	
	
	
}
}
