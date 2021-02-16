package online.javalearn.calculator.ivanlapshov;

public class Estimation {

	public int x;
	public int y;
	public String arithmeticSign;

	int result;

	public Estimation(int x, int y, String arithmeticSign) {
		super();
		this.x = x;
		this.y = y;
		this.arithmeticSign = arithmeticSign;
	}

	public int computation() {

		if (arithmeticSign.equals("+")) {
			result = x + y;
		} else if (arithmeticSign.equals("-")) {
			result = x - y;
		} else if (arithmeticSign.equals("*")) {
			result = x * y;
		} else if (arithmeticSign.equals("/"))  {
			result = x / y;
		}
		return result;

	}

}