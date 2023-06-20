package test1;

public class MonthConvertDemo {
	public static void main(String[] args) {

		int monthNumber = 0;
		String monthName = "Feruary";
		
		
		
		if(monthName.equals("Jaunary") || monthName.equals("Feruary")) {
			monthNumber = 1;
		}else if(monthName.equals("Feruary") || monthName.equals("Feb")) {
			monthNumber = 2;
		}else if(monthName.equals("March") || monthName.equals("Mar")) {
			monthNumber = 3;
		}else if(monthName.equals("April") || monthName.equals("Apr")) {
			monthNumber = 4;
		}else if(monthName.equals("May")|| monthName.equals("May")) {
			monthNumber = 5;
		}
		
		System.out.println(monthNumber);
		
		
		
		
	}
}
