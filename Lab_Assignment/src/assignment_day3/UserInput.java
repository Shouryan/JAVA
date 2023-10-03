package assignment_day3;

public class UserInput {

	public static void main(String[] args) {
		int number, iterations;
		
		number = Integer.parseInt ("10");
		iterations = Integer.parseInt("1");
		while(iterations<=10)
		{
			System.out.println(number*iterations);
			iterations++;
		}
	}

}
