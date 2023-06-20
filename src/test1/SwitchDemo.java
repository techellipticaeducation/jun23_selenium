package test1;

public class SwitchDemo {

	public static void main(String[] args) {
		int monthNumber = 0;
		String monthName = "Jan";


		switch(monthName) {

		case "January":
		case "Jan":
		case "JAN":
		case "JANUARY":
		case "FIRST MONTH OF YEAR":
			monthNumber = 1;
			break;

		case "Februray":
		case "Feb":
			monthNumber =  2;
			break;

		default:
			monthNumber = -1;

		}
		System.out.println(monthNumber);


	}


}
