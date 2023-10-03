package assignment_day2;

public class Student1 {
	static int id=550;
	static char ch='F';
	private int studentId=id;
	private char studentType;
	private String studentName;
	public Student1(char sType, String fName, String lName) {
		super();
		this.studentId = id;
		this.studentType =ch;
		this.studentName = fName+lName;
		id++;
	}
	public Student1() {
		super();
		this.studentId=id;
		id++;
	}
	public void displayDetails(Student1 obj) {
		System.out.println("Student Id: "+this.studentId);
		System.out.println("Student type: "+this.studentType);
		System.out.println("Student Name: "+this.studentName);
	}
	public static void main(String[] args) {
		Student1 s1 = new Student1('D', "Bony", "Thomas");
		s1.displayDetails(s1);
		
		Student1 s2 = new Student1('H', "Dinil", "Bose");
		s2.displayDetails(s2);

	}
	
}
