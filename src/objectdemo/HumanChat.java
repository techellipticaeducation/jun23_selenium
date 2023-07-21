package objectdemo;

public class HumanChat {

	public static void main(String[] args) {
		
		// We call the class and call the varibale name
		Human.country = "India";
		Human.showCountry();
		
		
		Human h1 = new Human("Nishat", 26, 150);
		Human h2 = new Human("Raju",30,170);
		Human h3 = new Human("Raj",28,140);
		
		
		h1.speak("Hello");
		h2.speak("Hello! How r u?");
		
		h1.happyBirthday();
		h1.happyBirthday();
		System.out.println(h1.country);
		System.out.println(h2.country);
		System.out.println(h3.country);
	}
}
