package objectdemo;

public class HumanChat {

	public static void main(String[] args) {
		
		// We call the class and call the varibale name
		Human.country = "India";
		Human.showCountry();
		
		
		Human h1 = new Human();
		h1.name = "Nishat";
		h1.age = 26;
		h1.height = 150;		
		h1.country  = "India";
		
		Human h2 = new Human();
		h2.name = "Raju";
		h2.age = 30;
		h2.height = 170;
		h2.country = "USA";
		
		Human h3 = new Human();
		h3.name = "Raj";
		h3.age = 28;
		h3.height = 140;
		
		
		h1.speak("Hello");
		h2.speak("Hello! How r u?");
		
		h1.happyBirthday();
		h1.happyBirthday();
		System.out.println(h1.country);
		System.out.println(h2.country);
		System.out.println(h3.country);
	}
}
