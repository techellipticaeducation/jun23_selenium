package inheritance;

public class CarImplementation {
	public static void main(String[] args) {
		Car car1 = new Tata();
		int maxSpeed = car1.maxSpeed(); // 
		System.out.println(maxSpeed);
		
		//Car car2 = new Car();
	}
}

// Runtime Polymorphism with normal class - implementation is optional

// Mandate - abstract class - no body for abstract method
// when ever we make our class as abstract and method as abstract , then it is mandate
// to provide implementation for all abstract method
// as abstarct class not having method which is having body . so we are not allowedto create 
//object for asbtarct entity
// abstract class can have both type of entity  (partial abstraction)
//  1 - abstract method - No body , normal - body

// full abstraction - interface  - no need of any abstarct keyword (full abstraction)
// we do not extends interface, we actually implement it

// a class can implements multiple interfaces
// one class can extends only 1 class (mutiple inheritance not allowed)

// interface extends each other

// all varibales inside the interfaces , automatically constant
// final and static together

interface Car{
	int i=10;
	public int maxSpeed();
}

interface USCar extends  Car{
	public int maxAverage();
}


class Audi implements USCar{
	public int maxSpeed() {
		System.out.println(Car.i);
		return 300; 
	}
	public int maxAverage() {
		return 30; 
	}
}

class BMW implements Car{
	public int maxSpeed() {
		return 200; 
	}
}

class Tata implements Car{
	public int maxSpeed() {
		return 100; 
	}
}



