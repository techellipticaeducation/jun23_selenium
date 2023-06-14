package test1;

public class BooleanAndCharDemo {
public static void main(String[] args) {
	// true  / bit, 0 and 1
	boolean b1 = true;
	
	char ch = 'A';
	// ascii code (1 byte), unicode - 2 byte
	System.out.println(ch);
	
	int chValue = (int)ch;
	System.out.println(chValue);
	
	int m = 100;
	char j = (char)m;
	System.out.println(j);
	
	// int = 4 byte
	// every char is int but every int is not char
	
	char hindi = '\u0D23';
	System.out.println(hindi);
	
	
	
}
}
