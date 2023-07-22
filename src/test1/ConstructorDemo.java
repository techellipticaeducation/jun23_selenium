package test1;

public class ConstructorDemo {

	public static void main(String[] args) {
		
		// What is Constructor
		School sch1  = new School(10,20);
//		sch1.m1();		
//		School sch2  = new School();
	}
}
class School{
	String name;
	int year;
	// Constructor name is always same as class
	// Constructor don't have any return type
	// Constructor
//	When we don’t provide any explicit constructor (if we writing in class) in class , 
//	there is always a default constructor
//	But when I create one explicit constructor , then your default nature is gone

	// this
	// Overloading - Compile time polymorphism
	
	School(int i){
		System.out.println("1 Param Constructor");	
	}
	
	School(){
		System.out.println("No Param Constructor");
	}
	
	School(int i  , int j){
		System.out.println("2 Param Constructor");	
	}
	
	// Same name method , but having different number of param, or different type of param
	// polymorphic nature = poly + morph =  
	// 
	
	int add(int i, int j) {
		return i+j;
	}
	
	float add(float a, int b) {
		return (float)a+(float)b;
	}
	
	float add(float a, float b) {
		return (float)a+(float)b;
	}
	
	int add(int i , int j , int k) {
		return  i+j+k;
	}
	
	
	
}