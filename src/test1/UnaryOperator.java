package test1;

public class UnaryOperator {
public static void main(String[] args) {
	int i  = 10;
	
	// increment / decrement 
	// pre increment ,  first increase then assign ,  ++i
	// post increment , first assign then increase ,  i++

	int j = i++ + ++i + i++;
	    //  10 + 12 + 12
	
	System.out.println("j = " + j);
	System.out.println("i = "  + i);
	
	
	// pre-increment is little faster then post increment
	// reason
	
	// boolean 
	boolean b = false;
	System.out.println(!b);
	
	
}
}
