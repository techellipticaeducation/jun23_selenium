package objectdemo;

public class Human {

	// characteristic
	
	// instance variable/ object variable
	String name;
	int age;
	int height;
	static String country; // static variable , 
	
	// this - instance level variables or method
	
	Human(String name,int age, int height){
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	// 40% java
	
	//class variable
	// these variable comes in memory first thing
	
	// static variable
	// static methods
	// instance variable
	// instance method
	
	int j = i;
	static int i = 10;
	
	// static method, 
	//we can have access to static variables
	public static void showCountry() {
		System.out.println(country);
	}
	
	public void speak(String content) {
		System.out.println(name + " : " + content);
	}
	
	public void happyBirthday() {
		age++;
		System.out.println("Happy Birthday "
		+name+"! Your age is now "+ age);
	}
	
	
	
}

