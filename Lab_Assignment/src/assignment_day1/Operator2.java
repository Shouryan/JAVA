package assignment_day1;

public class Operator2 {
	public static void main(String[] args) {
		int intVal=100;
		byte byteVal=(byte)intVal;
		System.out.println(byteVal);
		byte max=127;
		byte min=-128;
		byte sum = (byte) (min + max);
		System.out.println("Sum = "+sum);
	}
}
