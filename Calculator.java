package week1.day2;

public class Calculator {
	private int addTwoNumbers(int num1, int num2) {
		int res=num1+num2;
		return res;
	}
	public float mulTwoNumbers(float num1, int num2) {
		float res=num1*num2;
		return res;
	}
	public int subTwoNumbers(int num1, int num2) {
		int res=num1-num2;
		return res;

	}
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		System.out.println(cal.addTwoNumbers(2,10));
}
}
