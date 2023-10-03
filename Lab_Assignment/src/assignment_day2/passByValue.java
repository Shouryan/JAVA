package assignment_day2;

public class passByValue {

	public static void main(String[] args) {
		int sId = 25;
		passByValue val = new passByValue();
		System.out.println(sId);
		val.passTheValueMethod(sId);
		System.out.println("The sId are"+sId);
	}
	
	public void passTheValueMethod(int sId) {
		sId = 10;
		System.out.println("The sId are"+sId);
	}

}
