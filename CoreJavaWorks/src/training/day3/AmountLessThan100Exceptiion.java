package training.day3;

public class AmountLessThan100Exceptiion extends Exception {

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "hey macha " + message;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "yo macha " + message;
	}

	String message;

	public AmountLessThan100Exceptiion(String message) {
		this.message = message;

	}

	public AmountLessThan100Exceptiion() {
		this.message = "Sorry less than 100";
	}

}
