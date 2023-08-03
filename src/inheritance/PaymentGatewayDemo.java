package inheritance;

public class PaymentGatewayDemo {
	public static void main(String[] args) {
		PayPal obj = new SBIBank();
		obj.charges();
		
		int amountToSend = 100;
		int amountToReceive = amountToSend - obj.charges();
		
		System.out.println(amountToSend + " -> " + amountToReceive);
		
	}
}

class PayPal{
	public int charges() {
		return 10;
	}
}

class SBIBank extends PayPal{
	public int charges() {
		return 7;
	}
}

class BankOfAmerica extends PayPal{
	public int charges() {
		return 5;
	}
}

class HDFC extends PayPal{
	public int charges() {
		return 9;
	}
}

class ChaseBank extends PayPal{
	public int charges() {
		return 3;
	}
}