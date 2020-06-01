package solid_week8;

public class Multiplication extends Calculator {
	
	public Multiplication(int num1, int num2) {
		super(num1, num2);
	}

	@Override
	public int operation() {
		int num1 = this.getNum1();
		int num2 = this.getNum2();
		
		return num1 * num2;
	}
}
