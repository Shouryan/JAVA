package assignment_day2;

public class UserType {
	
	String name;
	
	UserType(){
		this.name="Student";
	}
	UserType(String name){
		this.name = name;
	}
	
	public static void main(String[] args) {
		UserType userType1 = new UserType("Faculty");
		UserType userType2 = new UserType();
		
		System.out.println(userType1.name);
		System.out.println(userType2.name);

	}

}