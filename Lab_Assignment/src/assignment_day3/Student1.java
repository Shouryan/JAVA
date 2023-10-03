package assignment_day3;

import assignment_day3.Student1;

public class Student1 {
	static int id=550;
	static char ch='F';
	private int studentId=id;
	private char studentType;
	private String studentName;
	static int studentCount=10;
	public Student1(char sType, String fName, String lName) {
		super();
		this.studentId = id;
		this.studentType =ch;
		this.studentName = fName+lName;
		id++;studentCount++;
	}
	public Student1() {
		super();
		this.studentId=id;
		id++;studentCount++;
	}
	public void displayDetails(Student1 obj) {
		System.out.println("Student Id: "+this.studentId);
		System.out.println("Student type: "+this.studentType);
		System.out.println("Student Name: "+this.studentName);
		System.out.println("Student Count:"+getStudentCount());
	}
	public static int getStudentCount()
	{
		return studentCount;
	}
	public static void main(String[] args) {
		Student1 s1 = new Student1('D', "Bony", "Thomas");
		s1.displayDetails(s1);
		
		Student1 s2 = new Student1('H', "Dinil", "Bose");
		s2.displayDetails(s2);

	}
	
}
