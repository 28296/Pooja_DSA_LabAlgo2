package Denominations.calculator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DenominationsCalculator  calculator = new DenominationsCalculator();
		calculator.collectDenominations();
		calculator.collectPaymentAmount();
		/*
		 * calculator.denominations = new Integer[]{60, 5, 12, 78, 25};
		 * calculator.paymentAmount = 128;
		 */
		calculator.calculate();
	}

}
